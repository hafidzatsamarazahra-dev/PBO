package sesi2;

public class MainAwal {
    public static void main(String[] args) {
        ShippingCounter counter = new ShippingCounter();
        Shipment a = new RegularShipment("RG-001", 3);
        Shipment b = new ExpressShipment("EX-001", 2, 1000000);
        Shipment c = new CargoShipment("CG-001", 5);
        counter.addShipment(a);
        counter.addShipment(b);
        counter.addShipment(c);

        counter.printReceipt();
        System.out.println("Diskon member EX-001: Rp" + counter.getMemberDiscount(b));
        System.out.println("Diskon member CG-001: Rp" + counter.getMemberDiscount(c));
        System.out.println("Bayar tunai: Rp" + counter.pay("CASH"));
        System.out.println("Bayar e-wallet: Rp" + counter.pay("EWALLET"));
    }
}
