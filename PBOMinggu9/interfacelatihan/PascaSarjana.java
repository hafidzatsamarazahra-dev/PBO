package PBOMinggu9.interfacelatihan;

public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
 public PascaSarjana(String nama) {
 super(nama);
 }
 @Override
 public void lulus() {
 System.out.println("Aku sudah menyelesaikan TESIS");
 }
 @Override
 public void meraihIPKTinggi() {
 System.out.println("IPK-ku lebih dari 3,71");
 }
 @Override
 public void membuatPublikasiIlmiah() {
    System.out.println("Aku sudah membuat publikasi ilmiah");
 }
 @Override
 public void menjuaraiKompetisi() {
    System.out.println("Aku sudah menjuarai kompetisi");
 }
}