package prototype;

import java.util.Objects;

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

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.width == width && shape2.heigth == heigth && Objects.equals(shape2.color, color);
    }

}
