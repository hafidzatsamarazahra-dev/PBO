// Nama:Hafidza Tsamara Zahra
// NIM:254107020034
// Kelas:2G-TI
// No Absen:09

package Kuis;

public class MainPesanan {
    public static void main(String[] args) {

        Restoran resto = new Restoran("Geprek Sa'i", "Jl. Suhat", 4.5);
        Kurir kurirA = new Kurir("Arya", 2000); 

        Pesanan p1 = new Pesanan("Nomor 102", 50000);

        p1.setKurir(kurirA);

        p1.hitungTotalBiaya(resto);
    }
}