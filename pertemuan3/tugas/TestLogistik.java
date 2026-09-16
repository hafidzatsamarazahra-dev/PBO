package pertemuan3.tugas;
import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan berat muatan baru yang ingin ditambah (kg): ");
        double muatanTambah1 = scanner.nextDouble();
        kontainerAlfa.tambahMuatan(muatanTambah1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan baru yang ingin ditambah (kg): ");
        double muatanTambah2 = scanner.nextDouble();
        kontainerAlfa.tambahMuatan(muatanTambah2);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin diturunkan (kg): ");
        double muatanTurun1 = scanner.nextDouble();
        kontainerAlfa.turunkanMuatan(muatanTurun1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin diturunkan (kg): ");
        double muatanTurun2 = scanner.nextDouble();
        kontainerAlfa.turunkanMuatan(muatanTurun2);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        scanner.close();
    }
}