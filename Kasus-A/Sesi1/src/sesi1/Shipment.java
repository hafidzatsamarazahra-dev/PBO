package sesi1;
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

    public abstract int calculateFee();

    public abstract String getInfo();
}
