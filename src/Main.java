public class Main {
    public static void main(String[] args) {
        Lambda lambda = ((a, b, c) -> (Math.max(a, Math.max(b, c))));
        System.out.println(lambda.sum(1, 2, 3));
        Lambda lambda1 = ((a, b, c) -> (a + b + c / 3));
        System.out.println(lambda1.sum(1, 2, 3));
        Lambda lambda2 = ((a, b, c) -> (a + b + c));
        System.out.println(lambda2.sum(1, 2, 3));
    }
@FunctionalInterface
public interface Lambda{
    int sum(int a, int b, int c);
}
}
