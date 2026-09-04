package pertemuan1.tugas;

public class HP {
    private String brand;
    private int baterai = 100;

    public void setBrand(String namaBrand) {
        brand = namaBrand;
    }

    public void pemakaianBaterai(int pemakaian) {
        baterai -= pemakaian;

        if (baterai < 0) {
            baterai = 0;
        }
    }

    public void printInfo() {
        System.out.println("==== HANDPHONE ===");
        System.out.println("Brand : " + brand);
        System.out.println("baterai : " + baterai + "%");
    }
}