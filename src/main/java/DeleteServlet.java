import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/delete-todo")
public class DeleteServlet extends HttpServlet {
        TodoService todoService=new TodoService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String todo=req.getParameter("todo");
        todoService.deleteTodo(todo);
        resp.sendRedirect("/ToDoJSPServlet/todo");
    }
}
