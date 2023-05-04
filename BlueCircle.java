public class BlueCircle extends Circle {
    public BlueCircle(float ray) {
        super(ray, "BLUE");
    }

    public void draw() {
        System.out.println("Dentro do círculo" + getColor() + " de base" + getRay() + "no método draw()");
    }
}
