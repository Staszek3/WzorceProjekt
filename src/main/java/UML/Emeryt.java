package UML;

import java.math.BigDecimal;

public class Emeryt extends Osoba implements BadanieLekarskie {
    private BigDecimal emerytura;

    public Emeryt(BigDecimal emerytura) {
        this.emerytura = emerytura;
    }
    public void getIncom(){};

    public void getEmerytura(){};

    @Override
    public void zrobBadanieLekarskie() {

    }
}
