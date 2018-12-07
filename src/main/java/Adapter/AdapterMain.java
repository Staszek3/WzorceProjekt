package Adapter;

public class AdapterMain {

    public static void main(String[] args) {
       DebitCard debitCard=new DebitCard();
       debitCard.takeMoney(100);

       PaybackCard paybackCard=new PaybackCard();
       paybackCard.payByPoints(100);

       CardAdapter cardAdapter= new DebitCardAdapter();
       cardAdapter.take(100);
    }
}
