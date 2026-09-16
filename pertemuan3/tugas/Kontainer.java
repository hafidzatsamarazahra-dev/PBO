package pertemuan3.tugas;

public class Kontainer {
    private String kodeKontainer;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni;

    public Kontainer(String kodeKontainer, String namaPemilik, double kapasitasMaksimal) {
        this.kodeKontainer = kodeKontainer;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0.0;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(double berat) {
        if (this.beratMuatanSaatIni + berat > this.kapasitasMaksimal) {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        } else {
            this.beratMuatanSaatIni += berat;
        }
    }

    public void turunkanMuatan(double berat) {
        double batasMaksimalTurun = 0.5 * this.beratMuatanSaatIni;

        if (berat > batasMaksimalTurun) {
            System.out.println("Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!");
        } else {
            this.beratMuatanSaatIni -= berat;
        }
    }
}