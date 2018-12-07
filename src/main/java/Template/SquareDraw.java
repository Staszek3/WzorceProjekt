package Template;

public class SquareDraw extends AbstractDraw {

    private int size;

    public SquareDraw(int size) {
        this.size = size;
    }

    @Override
    public int getWith() {
        return size;
    }

    @Override
    public int getHeight() {
        return size;
    }
}

