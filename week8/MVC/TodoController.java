package week8.MVC;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TodoController {
    private TodoView view;
    private List<Todo> todos;
    private int idCounter;

    public TodoController(TodoView view) {
        this.view = view;
        this.todos = new ArrayList<>();
        this.idCounter = 1;

        this.view.setAddButtonListener(new AddTodoListener());
        this.view.setDeleteButtonListener(new DeleteTodoListener());
    }

    private class AddTodoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String description = view.getTodoInput();
            if (!description.isEmpty()) {
                Todo todo = new Todo(idCounter++, description);
                todos.add(todo);
                view.addTodoToList(todo);
                view.clearTodoInput();
            } else {
                JOptionPane.showMessageDialog(view, "Todo description cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class DeleteTodoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Todo selectedTodo = view.getSelectedTodo();
            if (selectedTodo != null) {
                todos.remove(selectedTodo);
                view.removeTodoFromList(selectedTodo);
            } else {
                JOptionPane.showMessageDialog(view, "Please select a todo to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
