package sesi2;

public class ShippingCounter {
    private Shipment[] items = new Shipment[10];
    private int count = 0;

    public void addShipment(Shipment item) {
        items[count] = item;
        count++;
    }

    public int getCount() {
        return count;
    }

    public Shipment getItem(int index) {
        return items[index];
    }

    public int getTotalFee() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].calculateFee();
        }
        return total;
    }

    // [1] mencetak struk
    public void printReceipt() {
        System.out.println("=== Struk Loket ===");
        for (int i = 0; i < count; i++) {
            System.out.println(items[i].getInfo());
        }
        System.out.println("Total: Rp" + getTotalFee());
    }

    // [2] pembayaran
    public int pay(String method) {
        int total = getTotalFee();
        if (method.equals("CASH")) {
            return total;
        } else if (method.equals("EWALLET")) {
            return total + 1000;
        } else {
            return -1;      // metode tidak dikenal
        }
    }

    // [3] diskon member
    public int getMemberDiscount(Shipment item) {
        int fee = item.calculateFee();
        if (item instanceof ExpressShipment) {
            return fee * 10 / 100;
        } else if (item instanceof CargoShipment) {
            return fee * 5 / 100;
        } else {
            return 0;
        }
    }
}
