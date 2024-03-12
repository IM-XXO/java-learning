public class Rectangle extends Shape{

    private int width;
    private int length;

    public Rectangle (int width,int length){
        this.length = length;
        this.width = width;
    }

    @Override
    public Integer calculatePerimeter(){
        return (width + length)*2;
    }
    @Override
    public Integer calculateArea(){
        return (width * length);
    }

}
