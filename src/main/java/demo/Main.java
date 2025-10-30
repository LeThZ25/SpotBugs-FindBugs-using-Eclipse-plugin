package demo;

public class Main {
    public static void main(String[] args) {
        String role = getUserRole();

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