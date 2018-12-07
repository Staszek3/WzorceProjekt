package Adapter;

public class PaybackClassAdapter implements CardAdapter {
    private PaybackCard debitCard;

    public PaybackClassAdapter() {
        this.debitCard = debitCard;
    }

    @Override
    public boolean take(float amonut) {
        return debitCard.payByPoints(amonut);
    }
}
