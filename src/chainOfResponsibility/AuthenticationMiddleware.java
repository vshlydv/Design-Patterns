package chainOfResponsibility;

public class AuthenticationMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equalsIgnoreCase("admin@gmail.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
