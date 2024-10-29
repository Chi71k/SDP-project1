package week8.MVC;

public class Main {
    public static void main(String[] args) {
        TodoView view = new TodoView();
        TodoController controller = new TodoController(view);
        view.setVisible(true);
    }
}

