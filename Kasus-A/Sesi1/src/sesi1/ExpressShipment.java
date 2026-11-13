package sesi1;
public class ExpressShipment extends Shipment implements Trackable, Insurable {

    private int itemValue;

    public ExpressShipment(String code, int weight, int itemValue) {
        super(code, weight);
        this.itemValue = itemValue;
    }

    @Override
    public int calculateFee() {
        return weight * 8000 + 10000;
    }

    @Override
    public int calculateInsurance() {
        return itemValue / 100;
    }

    @Override
    public String getTrackingStatus() {
        return code + ": dalam perjalanan (prioritas)";
    }

    @Override
    public String getInfo() {
        return "[Ekspres] " + code + " | " + weight
                + " kg | Biaya: Rp" + calculateFee();
    }
}
