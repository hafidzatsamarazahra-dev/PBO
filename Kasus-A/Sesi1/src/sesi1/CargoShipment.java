package sesi1;
public class CargoShipment extends Shipment implements Trackable {

    public CargoShipment(String code, int weight) {
        super(code, weight);
    }

    @Override
    public int calculateFee() {
        int fee = weight * 3000;

        if (fee < 30000) {
            return 30000;
        }

        return fee;
    }

    @Override
    public String getTrackingStatus() {
        return code + ": dalam perjalanan (kargo darat)";
    }

    @Override
    public String getInfo() {
        return "[Kargo] " + code + " | " + weight
                + " kg | Biaya: Rp" + calculateFee();
    }
}
