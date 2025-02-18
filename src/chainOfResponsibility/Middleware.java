package chainOfResponsibility;

public abstract class Middleware {
    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean check(String email, String password);

    public boolean checkNext(String email, String password) {
        if (null == next) {
            return true;
        }
        return next.check(email, password);
    }
}
