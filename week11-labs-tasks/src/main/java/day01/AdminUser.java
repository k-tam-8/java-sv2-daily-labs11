package day01;

public class AdminUser implements User {
    private String userEmail;
    private String password;

    public AdminUser(String userEmail, String password) {
        this.userEmail = userEmail;
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getPassword() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            sb.append("*");
        }
        return sb.toString();
    }
}
