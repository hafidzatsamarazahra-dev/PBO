package pertemuan4.id.ac.polinema.relasiClass.Tugas;

public class Resep {
    private String obat;
    private String dosis;

    public Resep(String obat, String dosis) {
        this.obat = obat;
        this.dosis = dosis;
    }

    public void info() {
        System.out.println("Resep Obat: " + obat + " - Dosis: " + dosis);
    }
}