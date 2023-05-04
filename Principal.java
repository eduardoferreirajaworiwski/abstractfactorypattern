public class Principal {
    public static void main(String[] args) {
        AbstractFactory shapeBlueAbstractFactory = FactoryProducer.getFactory("BLUE");
        Shape shape1 = shapeBlueAbstractFactory.getCircle(1);
        shape1.draw();

        Shape shape2 = shapeBlueAbstractFactory.getCircle(2);
        shape2.draw();

        Shape shape3 = shapeBlueAbstractFactory.getCircle(3);
        shape3.draw();

        AbstractFactory shapeRedAbstractFactory = FactoryProducer.getFactory("RED");
        Shape shape4 = shapeBlueAbstractFactory.getCircle(4);
        shape4.draw();

        Shape shape5 = shapeBlueAbstractFactory.getCircle(5);
        shape5.draw();

        Shape shape6 = shapeBlueAbstractFactory.getCircle(6);
        shape6.draw();
    }
}
