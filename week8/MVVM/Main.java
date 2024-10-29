package week8.MVVM;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentViewModel viewModel = new StudentViewModel();
            StudentView view = new StudentView(viewModel);
            view.setVisible(true);
        });
    }
}
