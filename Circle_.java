public class Circle_ extends Shape_{
    private int radius;
    public Circle_(int radius){
        this.radius = radius;
    }
    @Override
    public Number perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public Number area() {
        return Math.PI*radius*radius;
    }
}
