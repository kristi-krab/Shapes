import java.awt.*;
public class Rectangle extends Shape{
    void go(int a, int b, int c, int d){
        super.x = a;
        super.y = b;
        super.a = c;
        super.b = d;
    }
    @Override
    void draw(Graphics shapes, int x, int y, int a, int b) {
        shapes.drawRect(x,y,a,b);
    }
    @Override
    void equals() {
        super.equals();
    }
}
