import java.util.List;
public class OrderService {
    private Notification notification;
    private Order order;
    private Payment payment;

    public OrderService(Notification notification, Payment payment) {
        this.notification = notification;
        this.payment = payment;
        this.order = new Order();
    }

    public void createOrder(String jwtToken) {
        if (JWT.validateToken(jwtToken) && (hasRole(jwtToken, "admin") || hasRole(jwtToken, "user"))) {
            order.createOrder();
            notification.notifyCustomer();
        } else {
            System.out.println("Geçersiz bir işlem yaptınız. Yetkiniz bu işleme izin vermiyor.");
        }
    }

    public void updateOrder() {
        order.updateOrder();
        notification.notifyCustomer();
    }

    public void deleteOrder(String jwtToken) {
        if (JWT.validateToken(jwtToken) && hasRole(jwtToken, "admin")) {
            order.deleteOrder();
            notification.notifyCustomer();
        } else {
            System.out.println("Geçersiz bir işlem yaptınız. Yetkiniz bu işleme izin vermiyor.");
        }
    }

    public void processPayment(double amount) {
        payment.pay(amount);
    }

    private boolean hasRole(String token, String role) {
        List<String> roles = JWT.getRolesFromToken(token);
        return roles != null && roles.contains(role);
    }
}
