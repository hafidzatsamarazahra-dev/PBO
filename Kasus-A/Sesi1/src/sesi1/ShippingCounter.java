package sesi1;

public class ShippingCounter {
    private Shipment[] items = new Shipment[10];
    private int count = 0;

    public void addShipment(Shipment item) {
        items[count] = item;
        count++;
    }

    public int getTotalFee() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].calculateFee();
        }
        return total;
    }

    public void printAll() {
        System.out.println("=== Daftar Paket ===");
        for (int i = 0; i < count; i++) {
            System.out.println(items[i].getInfo());
        }
    }

    
    public void printTrackingReport() {
        System.out.println("=== Laporan Pelacakan ===");

        for (int i = 0; i < count; i++) {
            if (items[i] instanceof Trackable) {
                Trackable tracked = (Trackable) items[i];
                System.out.println(tracked.getTrackingStatus());
            }
        }
    }

    public int getTotalInsurance() {
        int total = 0;

        for (int i = 0; i < count; i++) {
            if (items[i] instanceof Insurable) {
                Insurable insured = (Insurable) items[i];
                total += insured.calculateInsurance();
            }
        }

        return total;
    }

}
