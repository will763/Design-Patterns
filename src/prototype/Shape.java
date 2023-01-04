package prototype;

public abstract class Shape {
    public int width;
    public int heigth;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.width = target.width;
            this.heigth = target.heigth;
            this.color = target.color;
        }
    }
}
