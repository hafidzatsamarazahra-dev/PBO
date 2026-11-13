package sesi2;

public class CargoShipment extends Shipment implements Trackable {
    public CargoShipment(String code, int weight) {
        super(code, weight);
    }

    @Override
    public int calculateFee() {
        int fee = weight * 3000;
        return Math.max(fee, 30000);      // ada biaya minimum
    }

    @Override
    public String getTrackingStatus() {
        return code + ": dalam perjalanan (kargo darat)";
    }

    @Override
    public String getInfo() {
        return "[Kargo] " + super.getInfo();
    }
}
