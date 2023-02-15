public class ShapeFactory {
    public Shape getShape(int shapeCode){
//        if(shapeCode == 0)
//        {
//            return  new Square();
//        }
//        else{
//            return new Circle();
//        }
        
        switch (shapeCode){
            case 0 : 
                return  new Square();
            default:
                return new Circle();
        }
    }
}
