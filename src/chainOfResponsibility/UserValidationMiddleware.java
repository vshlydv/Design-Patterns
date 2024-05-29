package chainOfResponsibility;

public class UserValidationMiddleware extends Middleware {
    private Server server;

    UserValidationMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email, password)) {
            System.out.println("User not found!");
            return false;
        }

        if (!server.isValidPassword(email, password)) {
            System.out.println("Invalid password!");
            return false;
        }

        return checkNext(email, password);
    }
}
