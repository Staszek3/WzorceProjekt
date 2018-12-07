package Template;

public abstract class AbstractDraw {
    public void draw() {
        for (int i = 0; i < getWith(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

        public abstract int getWith ();
        public abstract int getHeight();
    }

