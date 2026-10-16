package UTS;

public class PesananMotor extends Pesanan {
    public static final int TARIF_MINIMUM = 8000;

    public PesananMotor(String id, String namaPenumpang, double jarakKm) {
        super(id, namaPenumpang, jarakKm);
    }

    @Override
    public int hitungTarif() {
        int tarifDasar = super.hitungTarif();
        if (tarifDasar < TARIF_MINIMUM) {
            return TARIF_MINIMUM;
        }
        return tarifDasar;
    }

    @Override
    public String info() {
        return super.info() + " [Motor]";
    }
}