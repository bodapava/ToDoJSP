import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/todo")
public class TodoServlet extends HttpServlet {
    TodoService todoService=new TodoService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("todos",todoService.retrieveTodos());
        req.getRequestDispatcher("/todopage.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String newTodo=req.getParameter("newtodo");
        if("".equals(newTodo)){
            req.setAttribute("errorMessage","Please enter a valid Todo!!");
        } else {
            todoService.addTodo(newTodo);
        }
        req.setAttribute("todos", todoService.retrieveTodos());
        req.getRequestDispatcher("/todopage.jsp").forward(req,resp);
    }
}
