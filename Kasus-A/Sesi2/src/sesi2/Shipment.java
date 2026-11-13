
package sesi2;

public abstract class Shipment {
    protected String code;
    protected int weight;

    public Shipment(String code, int weight) {
        this.code = code;
        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public int getWeight() {
        return weight;
    }

    public abstract int calculateFee();

    public int calculateMemberDiscount() {
    return 0;
    }

    public String getInfo() {
        return code + " | " + weight + " kg | Biaya: Rp"
                + calculateFee();
    }
}
