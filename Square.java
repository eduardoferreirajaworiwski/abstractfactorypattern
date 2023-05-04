public abstract class Square extends Shape {
    private float height;

    public Square(float height, String color) {
        super(color);
        this.height = height;
    }

    public float getHeigth() {
        return height;
    }

    public void setHeigth(float height) {
        this.height = height;
    }

}
