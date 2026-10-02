// Nama:Hafidza Tsamara Zahra
// NIM:254107020034
// Kelas:2G-TI
// No Absen:09

package Kuis;

class Restoran {
    private String nama;
    private String alamat;
    private double jarakTempuh;

    public Restoran(String nama, String alamat, double jarakTempuh) {
        this.nama = nama;
        this.alamat = alamat;
        this.jarakTempuh = jarakTempuh;
    }

    public String getNama() {
        return nama;
    }

    public double getJarakTempuh() {
        return jarakTempuh;
    }
}