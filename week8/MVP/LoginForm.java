package week8.MVP;

import java.util.Scanner;

public class LoginForm implements LoginView {
    private final Scanner scanner = new Scanner(System.in);
    private final LoginPresenter presenter;

    public LoginForm(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    public void display() {
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        System.out.println("Enter Password: ");
        String password = scanner.nextLine();
        presenter.login(username, password);
    }

    @Override
    public void showLoginSuccess(String message) {
        System.out.println("Login Success: " + message);
    }

    @Override
    public void showLoginError(String message) {
        System.out.println("Login Failed: " + message);
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }
}