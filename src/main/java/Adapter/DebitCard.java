package Adapter;

public class DebitCard {

    public static final float AVAILABLE = 1000;

    public boolean takeMoney(float a) {
        return a<=AVAILABLE;
    }
}
