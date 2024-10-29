package week8.MVP;

public class LoginPresenter {
    private final LoginView view;

    public LoginPresenter(LoginView view) {
        this.view = view;
    }

    public void login(String username, String password) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            view.showLoginError("Username or password cannot be empty.");
            return;
        }

        if (username.equals("YourSen") && password.equals("Eroha100!")) {
            view.showLoginSuccess("Welcome " + username + "!");
        } else {
            view.showLoginError("Invalid username or password.");
        }
    }
}