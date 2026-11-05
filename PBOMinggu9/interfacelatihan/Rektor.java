package PBOMinggu9.interfacelatihan;

public class Rektor {
    public void beriSertifikatMawapres(IBerprestasi m) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES. Selamat!");
        System.out.println("Bagaimana Anda bisa berprestasi?");
        m.menjuaraiKompetisi();
        m.membuatPublikasiIlmiah();
        System.out.println("----------------------------------------");
    }
}