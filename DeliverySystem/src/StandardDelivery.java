public class StandardDelivery extends Delivery{
    public StandardDelivery(String senderName, String receiverName, double distance) {
        super(senderName, receiverName, distance);
        calculatePrice(distance);
    }

    @Override
    public double calculatePrice(double distance) {
        return distance * 200;
    }

    @Override
    public void deliver() {
        if (distance <= 0) {
            System.out.println("Standard delivery failed, distance must be possitive!");
        } else {
            System.out.println("Standard delivery done.");
        }
    }

    @Override
    public void displayInfo() {
        if (distance > 0) {
            System.out.println("Delivery type: " + deliveryType + ", Sender name: " + getSenderName()
                    + ", Receiver name: " + getReceiverName() + ", Distance: " + distance
                    + "km, Price: " + calculatePrice(distance) + "$");
        } else {
            System.out.println("Delivery type: " + deliveryType + ", Sender name: " + getSenderName()
                    + ", Receiver name: " + getReceiverName() + ", Distance: Invalid, Price: Invalid");
        }
    }
}
