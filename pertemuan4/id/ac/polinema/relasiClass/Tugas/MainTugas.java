package pertemuan4.id.ac.polinema.relasiClass.Tugas;

public class MainTugas {
    public static void main(String[] args) {
        Dokter drAndi = new Dokter("dr. Andi Sp.PD", "Penyakit Dalam");

        Pasien pasienBudi = new Pasien("Budi Santoso", "RM-0092");

        RekamMedis rm01 = new RekamMedis("RM2026-001", "24 September 2026", drAndi, "Paracetamol", "3x1 sehari");

        rm01.cetakRekamMedis(pasienBudi);
    }
}