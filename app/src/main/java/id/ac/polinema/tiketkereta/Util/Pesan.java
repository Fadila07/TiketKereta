package id.ac.polinema.tiketkereta.Util;

public class Pesan {
    public static final int GAJAYANA = 0;
    public static final int MATARMAJA = 1;
    public static final int MALABAR = 2;

    private int kereta;
    private int penumpang;
    private int total;

    public Pesan(int kereta, int penumpang){
        this.kereta = kereta;
        this.penumpang = penumpang;
        this.total = calculate();
    }

    public int getTotal(){
        return total;
    }

    private int calculate() {
        switch (kereta) {
            case GAJAYANA:
                return penumpang * 350000;
            case MATARMAJA:
                return penumpang * 110000;
            default:
                return 0;
        }
    }

}
