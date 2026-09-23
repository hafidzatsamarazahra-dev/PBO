package pertemuan4.id.ac.polinema.relasiClass.Tugas;

public class Pasien {
    private String nama;
    private String noRM;

    public Pasien(String nama, String noRM) {
        this.nama = nama;
        this.noRM = noRM;
    }

    public void info() {
        System.out.println("Pasien: " + nama + " [No. RM: " + noRM + "]");
    }
}