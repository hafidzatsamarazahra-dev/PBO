package PBOMinggu9.interfacelatihan;

public class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        Sarjana sarjanaCumlaude = new Sarjana("Andi");
        PascaSarjana pascaSarjanaCumlaude = new PascaSarjana("Budi");

        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(pascaSarjanaCumlaude);
    }
}