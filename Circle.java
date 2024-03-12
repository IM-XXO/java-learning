public class Circle extends Shape{

    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public Double calculateArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public Double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}
