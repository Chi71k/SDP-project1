package week8.MVVM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentView extends JFrame {
    private StudentViewModel viewModel;
    private JTextField nameField;
    private JTextField ageField;
    private JTextField courseField;
    private DefaultListModel<Student> studentListModel;
    private JList<Student> studentList;

    public StudentView(StudentViewModel viewModel) {
        this.viewModel = viewModel;
        initUI();
    }

    private void initUI() {
        setTitle("Student Management");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Age:"));
        ageField = new JTextField();
        inputPanel.add(ageField);
        inputPanel.add(new JLabel("Course:"));
        courseField = new JTextField();
        inputPanel.add(courseField);

        JButton addButton = new JButton("Add Student");
        JButton updateButton = new JButton("Update Student");
        inputPanel.add(addButton);
        inputPanel.add(updateButton);

        add(inputPanel, BorderLayout.NORTH);

        studentListModel = new DefaultListModel<>();
        studentList = new JList<>(studentListModel);
        add(new JScrollPane(studentList), BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateStudent();
            }
        });

        loadStudents();
    }

    private void addStudent() {
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        String course = courseField.getText();
        viewModel.addStudent(name, age, course);
        loadStudents();
    }

    private void updateStudent() {
        Student selectedStudent = studentList.getSelectedValue();
        if (selectedStudent != null) {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String course = courseField.getText();
            viewModel.updateStudent(selectedStudent.getId(), name, age, course);
            loadStudents();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a student to update.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadStudents() {
        studentListModel.clear();
        for (Student student : viewModel.getStudents()) {
            studentListModel.addElement(student);
        }
    }
}

