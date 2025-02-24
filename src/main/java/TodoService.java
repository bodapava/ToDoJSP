import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private static List<Todo> todos=new ArrayList<Todo>();

    static{
        todos.add(new Todo("Spring"));
        todos.add(new Todo("JSP's"));
        todos.add(new Todo("Spring Boot"));
    }

    public List<Todo> retrieveTodos(){
        return todos;
    }

    public void addTodo(String todo){
         todos.add(new Todo(todo));
    }

    public void deleteTodo(String todo){
       todos.remove(new Todo(todo));
    }
}
