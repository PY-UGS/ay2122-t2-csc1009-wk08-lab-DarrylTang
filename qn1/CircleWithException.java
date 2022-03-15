import java.text.DecimalFormat;

public class CircleWithException {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    float radius;

    public CircleWithException(float radius) throws IllegalArgumentException {
        this.radius = radius;

        if (radius <= 0) {
            throw new IllegalArgumentException("Radius has to be a positive number");
        }

    }

    // getter and setter
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    // calc area
    public String getArea() throws Exception {
        double area = Math.PI*(radius*radius);
        if (area > 1000) {
            throw new Exception("Area is too big");
        }
        return df.format(area);
    }

    // calc diameter
    public String getPerimeter() {
        return df.format(2*Math.PI*radius);
    }
}
