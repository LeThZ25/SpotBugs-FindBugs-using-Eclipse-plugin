package demo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demo SpotBugs CI running...");

        String role = getUserRole();
        // BUG CỐ TÌNH: dùng '==' thay vì .equals()
        if (role == "admin") {
            System.out.println("Full access granted");
        } else {
            System.out.println("Limited access");
        }
    }

    public static String getUserRole() {
        return new String("admin");
    }
}