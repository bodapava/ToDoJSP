import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    LoginService service=new LoginService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String pwd=req.getParameter("password");

        boolean isValidUser= service.isValidUser(username,pwd);

        if(isValidUser){
            req.getSession().setAttribute("username",username);
            resp.sendRedirect("/ToDoJSPServlet/todo");
        } else{
            req.setAttribute("error","Invalid credentials! Please try again");
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        }

    }
}
