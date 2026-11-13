package sesi2;

public class ExpressShipment extends Shipment implements Trackable, Insurable {
    private int declaredValue;

    public ExpressShipment(String code, int weight, int declaredValue) {
        super(code, weight);
        this.declaredValue = declaredValue;
    }

    @Override
    public int calculateFee() {
        return weight * 8000 + 10000;
    }

    @Override
    public String getTrackingStatus() {
        return code + ": dalam perjalanan (prioritas)";
    }

    @Override
    public int getInsuranceFee() {
        return declaredValue / 100;      // asuransi 1% dari nilai
    }

    @Override
    public String getInfo() {
        return "[Ekspres] " + super.getInfo();
    }
}
