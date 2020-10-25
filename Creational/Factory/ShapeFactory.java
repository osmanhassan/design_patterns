public class ShapeFactory {

    public IShape getShape(String shapeName){
        if(shapeName.trim().toLowerCase().equals("triangle"))
            return new Triangle();
        else if(shapeName.trim().toLowerCase().equals("rectangle"))
            return new Rectangle();
        else if(shapeName.trim().toLowerCase().equals("circle"))
            return new Circle();
        else
            return new IShape() {
                @Override
                public String getShape() {
                    return "No Shape";
                }
            };

    }

}
