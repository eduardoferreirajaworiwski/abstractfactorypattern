public class RedRectangle extends Rectangle {
    public RedRectangle(float base) {
        super(base, "RED");
    }

    public void draw() {
        System.out.println("Dentro do retangulo" + getColor() + " de base" + getBase() + "no método draw()");
    }
}
