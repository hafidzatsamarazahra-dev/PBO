
package sesi2;

public class ShippingCounter {

    private Shipment[] items = new Shipment[10];
    private int count = 0;
    private PaymentMethod paymentMethod;

    public ShippingCounter(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void addShipment(Shipment item) {
        items[count] = item;
        count++;
    }

    public int getCount() {
        return count;
    }

    public Shipment getItem(int index) {
        return items[index];
    }

    public int getTotalFee() {
        int total = 0;

        for (int i = 0; i < count; i++) {
            total += items[i].calculateFee();
        }

        return total;
    }

    public int checkout() {
        return paymentMethod.charge(getTotalFee());
    }

    public int getMemberDiscount(Shipment item) {
        return item.calculateMemberDiscount();
    }
}
