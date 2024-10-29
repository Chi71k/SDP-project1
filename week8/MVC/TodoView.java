package week8.MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TodoView extends JFrame {
    private JTextField todoInput;
    private JButton addButton;
    private JButton deleteButton;
    private DefaultListModel<Todo> todoListModel;
    private JList<Todo> todoList;

    public TodoView() {
        setTitle("Todo List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        todoInput = new JTextField(20);
        addButton = new JButton("Add Todo");
        inputPanel.add(todoInput);
        inputPanel.add(addButton);

        todoListModel = new DefaultListModel<>();
        todoList = new JList<>(todoListModel);
        deleteButton = new JButton("Delete Selected");

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(todoList), BorderLayout.CENTER);
        add(deleteButton, BorderLayout.SOUTH);
    }

    public String getTodoInput() {
        return todoInput.getText();
    }

    public void clearTodoInput() {
        todoInput.setText("");
    }

    public void addTodoToList(Todo todo) {
        todoListModel.addElement(todo);
    }

    public Todo getSelectedTodo() {
        return todoList.getSelectedValue();
    }

    public void removeTodoFromList(Todo todo) {
        todoListModel.removeElement(todo);
    }

    public void setAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void setDeleteButtonListener(ActionListener listener) {
        deleteButton.addActionListener(listener);
    }
}
