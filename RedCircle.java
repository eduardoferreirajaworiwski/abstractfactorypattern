public class RedCircle extends Circle {
    public RedCircle(float ray) {
        super(ray, "RED");
    }

    public void draw() {
        System.out.println("Dentro do círculo" + getColor() + " de base" + getRay() + "no método draw()");
    }
}