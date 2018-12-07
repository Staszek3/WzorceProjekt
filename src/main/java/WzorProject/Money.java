package WzorProject;

import java.util.Objects;

public class Money {

    private float kwota;

    public enum Currency{
        Euro,
        PLN,
        Dolar
    }
    private Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    public float getKwota() {
        return kwota;
    }

    public void setKwota(float kwota) {
        this.kwota = kwota;
    }

    public Money(Currency currency, float kwota) {
        this.kwota = kwota;
        this.currency=currency;
    }

    public void getMoneyValiu(){
        getKwota();
        getCurrency();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return Float.compare(money.getKwota(), getKwota()) == 0 &&
                getCurrency() == money.getCurrency();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKwota(), getCurrency());
    }

    @Override
    public String toString() {
        return "Money{" +
                "kwota=" + kwota +
                ", currency=" + currency +
                '}';
    }
}
