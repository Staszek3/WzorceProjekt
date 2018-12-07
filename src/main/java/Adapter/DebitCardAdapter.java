package Adapter;

public class DebitCardAdapter implements CardAdapter {
    private DebitCard debitCard;

    public DebitCardAdapter() {
        this.debitCard = debitCard;
    }

    @Override
    public boolean take(float amonut) {

        return debitCard.takeMoney(amonut);
    }
}
