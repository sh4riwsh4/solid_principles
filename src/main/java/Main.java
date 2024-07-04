import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        Payment payment = new CreditCardPayment();
        OrderService orderService = new OrderService(notification, payment);

        String jwtTokenAdmin = JWT.generateToken("user@example.com", Arrays.asList("admin"));
        System.out.println("Admin JWT Token Oluşturuldu: " + jwtTokenAdmin);

        String jwtTokenUser = JWT.generateToken("user@example.com", Arrays.asList("user"));
        System.out.println("User JWT Token Oluşturuldu: " + jwtTokenUser);

        System.out.println("Admin Token ile order oluşturmaya çalışırken:");
        orderService.createOrder(jwtTokenAdmin);

        System.out.println("User Token ile order oluşturmaya çalışırken:");
        orderService.createOrder(jwtTokenUser);

        System.out.println("Admin Token ile order silmeye çalışırken:");
        orderService.deleteOrder(jwtTokenAdmin);

        System.out.println("User Token ile order silmeye çalışırken:");
        orderService.deleteOrder(jwtTokenUser);

        System.out.println("Geçersiz bir Token ile order silmeye çalışırken:");
        orderService.deleteOrder("invalid-jwt-token");
    }
}
