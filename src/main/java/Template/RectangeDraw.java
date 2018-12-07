package Template;

public class RectangeDraw extends AbstractDraw {

    private int weith;
    private int heigt;

    public RectangeDraw(int weith, int heigt) {
        this.weith = weith;
        this.weith = heigt;
    }

    @Override
    public int getWith() {
        return weith;
    }

    @Override
    public int getHeight() {
        return heigt;
    }
}
