package pertemuan1.tugas;

public class pensil extends alatTulis {
    private String type;
    private boolean mudahDihapus;

    public void setType(String pencilType) {
        type = pencilType;
    }

    public void setMudahDihapus(boolean value) {
        mudahDihapus = value;
    }

    @Override
    public void printInfo() {
        System.out.println("==== PENSIL ====");
        super.printInfo();
        System.out.println("Tipe pensil : " + type);
        System.out.println("Mudah dihapus : " + mudahDihapus);
        System.out.println("Jenis alat tulis : Pensil");
    }
}