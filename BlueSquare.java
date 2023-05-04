public class BlueSquare extends Square {
    public BlueSquare(float height) {
        super(height, "BLUE");
    }

    public void draw() {
        System.out.println("Dentro do quadrado" + getColor() + " de base" + getHeigth() + "no método draw()");
    }
}
