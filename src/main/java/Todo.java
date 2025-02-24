import java.util.Objects;

public class Todo {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Todo(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(name, todo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
