package Adapter;

public class PaybackCard {
    public static final float AVAILABLE = 500;

    public boolean payByPoints(float amount){
        return amount<=AVAILABLE;
    }
}
