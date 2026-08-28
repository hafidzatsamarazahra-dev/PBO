package pertemuan1.tugas;

public class tas {
    private String brand;
    private int kapasitas;

    public void setBrand(String namaBrand) {
        brand = namaBrand;
    }

    public void addItem(int item) {
        kapasitas += item;
    }

    public void printInfo() {
        System.out.println("==== TAS ====");
        System.out.println("Brand : " + brand);
        System.out.println("kapasitas : " + kapasitas + " items");
    }
}