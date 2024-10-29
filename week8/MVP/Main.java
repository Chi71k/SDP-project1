package week8.MVP;

public class Main {
    public static void main(String[] args) {
        LoginPresenter presenter = new LoginPresenter(new LoginForm(new LoginPresenter(null)));
        LoginForm loginForm = new LoginForm(presenter);
        loginForm.display();
    }
}