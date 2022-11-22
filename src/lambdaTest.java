public class lambdaTest {

    static Runnable r = () -> System.out.println("Test is success");

    public static void process(Runnable r) {
        r.run();
    }

    public static void main(String[] args) {
        process(r);
    }
}

