
package sesi2;

public class RegularShipment extends Shipment {

    public RegularShipment(String code, int weight) {
        super(code, weight);
    }

    @Override
    public int calculateFee() {
        return weight * 5000;
    }

    @Override
    public String getInfo() {
        return "[Reguler] " + super.getInfo();
    }
}
