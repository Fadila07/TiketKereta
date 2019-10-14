package id.ac.polinema.tiketkereta.Util;

public class Pesan {

    private int kereta;
    private int penumpang;
    private int total;

    public Pesan(int kereta, int penumpang){
        this.kereta = kereta;
        this.penumpang = penumpang;
        this.total = calculate();
    }

    private int calculate() {
        int n = 0;
        switch (kereta) {
            case 0:
                n = penumpang * 350000; break;
            case 1:
                n = penumpang * 110000; break;
        }
        return n;
    }

    public int getTotal(){
        return total;
    }

}
