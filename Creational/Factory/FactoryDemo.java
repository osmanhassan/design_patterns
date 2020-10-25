public class FactoryDemo {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape shape = shapeFactory.getShape("Circle");
        System.out.println(shape.getShape());
        shape = shapeFactory.getShape("Triangle");
        System.out.println(shape.getShape());
        shape = shapeFactory.getShape("Hexagon");
        System.out.println(shape.getShape());
        shape = shapeFactory.getShape("Rectangle");
        System.out.println(shape.getShape());

    }
}
