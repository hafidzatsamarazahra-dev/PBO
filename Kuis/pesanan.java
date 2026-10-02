// Nama:Hafidza Tsamara Zahra
// NIM:254107020034
// Kelas:2G-TI
// No Absen:09

package Kuis;

class Pesanan {
    private String kodePesanan;
    private double totalHargaMakanan;
    private Kurir kurir;

    public Pesanan(String kodePesanan, double totalHargaMakanan) {
        this.kodePesanan = kodePesanan;
        this.totalHargaMakanan = totalHargaMakanan;
    }

    public void setKurir(Kurir kurir) {
        this.kurir = kurir;
    }

    public double hitungTotalBiaya(Restoran restoran) {
        double jarak = restoran.getJarakTempuh();
        double biayaKirim = kurir.getTarifPerKm() * jarak;
        double totalKeseluruhan = totalHargaMakanan + biayaKirim;

        System.out.println("=== Rincian Pesanan " + kodePesanan + " ===");
        System.out.println("Restoran     : " + restoran.getNama());
        System.out.println("Jarak Tempuh : " + jarak + " km");
        System.out.println("Kurir        : " + kurir.getNama());
        System.out.println("Harga Makanan: Rp " + totalHargaMakanan);
        System.out.println("Biaya Kirim  : Rp " + biayaKirim);
        System.out.println("-----------------------------------");
        System.out.println("TOTAL  : Rp " + totalKeseluruhan);

        return totalKeseluruhan;
    }
}