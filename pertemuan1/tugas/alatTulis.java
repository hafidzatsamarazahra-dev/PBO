package pertemuan1.tugas;

public class alatTulis {
    private String brand;
    private String warna;

    public void setBrand(String namaBrand) {
        brand = namaBrand;
    }

    public void setWarna(String namaWarna) {
        warna = namaWarna;
    }

    public void printInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Warna : " + warna);
    }
}