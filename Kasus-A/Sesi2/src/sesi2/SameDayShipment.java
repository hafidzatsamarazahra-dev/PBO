
package sesi2;

public class SameDayShipment extends Shipment implements Trackable {

    public SameDayShipment(String code, int weight) {
        super(code, weight);
    }

    @Override
    public int calculateFee() {
        return weight * 12000 + 25000;
    }

    @Override
    public String getTrackingStatus() {
        return code + ": dalam perjalanan (hari ini)";
    }

    @Override
    public int calculateMemberDiscount() {
        return super.calculateMemberDiscount()
                + (calculateFee() * 15 / 100);
    }

    @Override
    public String getInfo() {
        return "[Same Day] " + super.getInfo();
    }
}
