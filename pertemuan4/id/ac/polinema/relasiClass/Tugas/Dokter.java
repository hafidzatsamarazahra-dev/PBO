package pertemuan4.id.ac.polinema.relasiClass.Tugas;

public class Dokter {
    private String nama;
    private String spesialis;

    public Dokter(String nama, String spesialis) {
        this.nama = nama;
        this.spesialis = spesialis;
    }

    public void info() {
        System.out.println("Dokter: " + nama + " (" + spesialis + ")");
    }
}