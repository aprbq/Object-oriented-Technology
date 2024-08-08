package week05.lab.lab3;

public class RectangleDrawing {
    public static void main(String[] args) {
        RectangleDrawing rd = new RectangleDrawing();
        rd.drawRectangle(5);
        System.out.println();

        rd.drawRectangle(6, 4);
        System.out.println();

        rd.drawRectangle(7, 3, '#');
        System.out.println();

        rd.drawRectangle(4, 6, '@');
    }

    public void drawRectangle(int lenght) {
        System.out.println("A Square");
        for (int i=1; i<=lenght; i++) {
            for (int j=1; j<=lenght; j++) {
                if (j==1 || i==1 || i==lenght || j==lenght) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public void drawRectangle(int lenght, int width) {
        System.out.println("A Rectangle");
        for (int i=0; i<width; i++) {
            for (int j=0; j<lenght; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    public void drawRectangle(int lenght, int width, char ch) {
        if (ch == '#') {
            System.out.println("A Parallelogram");

            for (int i = 1; i <= width; i++) {

            for (int j = 1; j <= width - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= lenght; k++) {
                System.out.print(ch+ " ");
            }

            System.out.println();
        }
        } else {
            drawRectangle(lenght,width);
        }
        
    }
}