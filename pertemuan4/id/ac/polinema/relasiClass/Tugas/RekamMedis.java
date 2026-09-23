package pertemuan4.id.ac.polinema.relasiClass.Tugas;

public class RekamMedis {
    private String idRekam;
    private String tanggal;
    private Dokter dokter; // Aggregation
    private Resep resep;   // Composition

    public RekamMedis(String idRekam, String tanggal, Dokter dokter, String obat, String dosis) {
        this.idRekam = idRekam;
        this.tanggal = tanggal;
        this.dokter = dokter;
        this.resep = new Resep(obat, dosis);
    }

    public void cetakRekamMedis(Pasien pasien) {
        System.out.println("=== REKAM MEDIS KLINIK ===");
        System.out.println("ID Rekam : " + idRekam);
        System.out.println("Tanggal  : " + tanggal);
        pasien.info();
        dokter.info();
        resep.info();
        System.out.println("==========================");
    }
}