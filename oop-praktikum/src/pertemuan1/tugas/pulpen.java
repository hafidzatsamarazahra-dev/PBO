package pertemuan1.tugas;

public class pulpen extends alatTulis {
    private String warnaTinta;
    private boolean isiUlang;

    public void setWarnaTinta(String warna) {
        warnaTinta = warna;
    }

    public void setIsiUlang(boolean value) {
        isiUlang = value;
    }

    @Override
    public void printInfo() {
        System.out.println("==== PULPEN ====");
        super.printInfo();
        System.out.println("Warna tinta : " + warnaTinta);
        System.out.println("Bisa diisi ulang : " + isiUlang);
        System.out.println("Tipe alat tulis : Pulpen");
    }
}