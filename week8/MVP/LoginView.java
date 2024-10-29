package week8.MVP;

public interface LoginView {
    void showLoginSuccess(String message);
    void showLoginError(String message);
    String getUsername();
    String getPassword();
}