// Nama:Hafidza Tsamara Zahra
// NIM:254107020034
// Kelas:2G-TI
// No Absen:09

package Kuis;

class Kurir {
    private String nama;
    private double tarifPerKm;

    public Kurir(String nama, double tarifPerKm) {
        this.nama = nama;
        this.tarifPerKm = tarifPerKm;
    }

    public String getNama() {
        return nama;
    }

    public double getTarifPerKm() {
        return tarifPerKm;
    }
}