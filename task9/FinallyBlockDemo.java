public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            Method1();
        } catch (Exception e) {
            System.err.println("Exception caught in the main method: " + e.getMessage());
        }
    }

    public static void Method1() {
        try {
            Method2();
        } catch (Exception e) {
            System.err.println("Exception caught in Method1: " + e.getMessage());
        } finally {
            System.out.println("Finally block in Method1 executed.");
        }
    }

    public static void Method2() {
        try {
            Method3();
        } catch (Exception e) {
            System.err.println("Exception caught in Method2: " + e.getMessage());
        } finally {
            System.out.println("Finally block in Method2 executed.");
        }
    }

    public static void Method3() throws Exception {
        throw new Exception("Exception in Method3");
    }
}
