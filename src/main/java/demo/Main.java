package demo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demo SpotBugs CI running...");

        String role = getUserRole();
        if ("admin".equals(role)) {
            System.out.println("Full access granted");
        } else {
            System.out.println("Limited access");
        }
    }

    public static String getUserRole() {
        return "admin";
    }
}