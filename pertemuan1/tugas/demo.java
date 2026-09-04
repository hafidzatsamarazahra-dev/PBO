package pertemuan1.tugas;

public class demo {
    public static void main(String[] args) {

        HP hp1 = new HP();
        tas tas1 = new tas();
        pensil pensil1 = new pensil();
        pulpen pulpen1 = new pulpen();

        hp1.setBrand("Redmi");
        hp1.pemakaianBaterai(20);
        hp1.printInfo();

        System.out.println();

        tas1.setBrand("Palo Alto");
        tas1.addItem(10);
        tas1.printInfo();

        System.out.println();

        pensil1.setBrand("Faber-Castel");
        pensil1.setWarna("Hitam");
        pensil1.setType("2B");
        pensil1.setMudahDihapus(true);
        pensil1.printInfo();

        System.out.println();

        pulpen1.setBrand("Standard");
        pulpen1.setWarna("Merah");
        pulpen1.setWarnaTinta("Merah");
        pulpen1.setIsiUlang(true);
        pulpen1.printInfo();
    }
}