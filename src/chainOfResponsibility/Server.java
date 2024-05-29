package chainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public class Server {
    Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public Server() { }

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean login(String email, String password) {
        if (middleware.check(email, password)) {
            // Do some stuff with authenticated user
            return true;
        }
        return false;
    }

    public void registerUser(String email, String password) {
        if (users.containsKey(email)) {
            System.out.println("User already exists");
            return;
        }
        users.put(email, password);
    }

    public boolean hasEmail(String email, String password) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
