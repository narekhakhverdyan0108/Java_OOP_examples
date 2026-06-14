public abstract class Delivery implements Deliverable{
    private String senderName;
    private String receiverName;
    protected double distance;
    protected String deliveryType;

    abstract void displayInfo();

    public Delivery(String senderName, String receiverName, double distance) {
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.distance = distance;
        deliveryType = getClass().getSimpleName();
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
