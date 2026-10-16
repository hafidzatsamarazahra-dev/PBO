package UTS;

public class Main {
    public static void main(String[] args) {

        Driver budi = new Driver("Budi", 2500);
        Driver sari = new Driver("Sari", 4000);
        Promo hemat = new Promo("HEMAT20", 20);

        PesananMotor p1 = new PesananMotor("P-001 -", "Dina", 3.0);
        p1.tugaskan(budi);
        System.out.println(p1.info());
        System.out.println("Tarif P-001: " + p1.hitungTarif());
        System.out.println("P-001 dengan promo: " + p1.hitungTotal(hemat));
        p1.tugaskan(sari);
        System.out.println("P-001 ganti driver, dengan promo: " + p1.hitungTotal(hemat));

        PesananMobil p2 = new PesananMobil("P-002 -", "Raka", 10.5, 4);
        p2.tugaskan(sari);
        System.out.println(p2.info());
        System.out.println("P-002 tanpa promo: " + p2.hitungTotal(null));
    }
}
 
// Jawaban tugas 3
// Bagian pesanan yang dipakai ulang adalah atribut dasar(id,namaPenumpang,jarakKm,driver),constructor lewat super(),method tugaskan(),dan method hitungTotal()
// Method yang di override adalah hitungTarif() dan info()
// Rumus tarif tidak disalin karena bisa memanggil super.hitungTarif() terlebih dahulu untuk mengambil hasil perhitungan dasar lalu memodifikasinya sesuai aturan subclass