package chainOfResponsibility;

import java.util.Scanner;

public class ChainOfResponsibilityMain {
    public static void run() {
        Server server = new Server();
        Scanner scanner = new Scanner(System.in);
        server.registerUser("admin@gmail.com", "123");
        server.registerUser("normalUser@gmail.com", "123");

        Middleware middleware = Middleware.link(new ThrottlingMiddleware(2),
                new UserValidationMiddleware(server),
                new AuthenticationMiddleware());

        server.setMiddleware(middleware);

        boolean success;
        do {
            System.out.println("Enter email: ");
            String email = scanner.nextLine();
            System.out.println("Input password: ");
            String password = scanner.nextLine();
            success = server.login(email, password);
        } while (success);

    }
}
