import java.util.ArrayList;
import java.util.List;

public class DeliverySystem {
    public static void main(String[] args) {
        Delivery standardDelivery = new StandardDelivery("Narek Hakhverdyan", "Martin Mkhitaryan", -4);
        Delivery expressDelivery = new ExpressDelivery("Martin Mkhitaryan", "Narek Hakhverdyan", 10);

        List<Delivery> deliveries = new ArrayList<>();
        deliveries.add(standardDelivery);
        deliveries.add(expressDelivery);

        for (Delivery delivery : deliveries) {
            delivery.deliver();
        }

        System.out.println("Data after delivery:");
        for (Delivery delivery : deliveries) {
            delivery.displayInfo();
        }
    }
}
