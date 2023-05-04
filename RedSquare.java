public class RedSquare extends Square {
    public RedSquare(float height) {
        super(height, "RED");
    }

    public void draw() {
        System.out.println("Dentro do quadrado" + getColor() + " de base" + getHeigth() + "no método draw()");
    }
}
