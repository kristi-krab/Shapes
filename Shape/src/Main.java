import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {

        BufferedImage conclusion = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics shapes = conclusion.createGraphics();

        Rectangle rectangle = new Rectangle();
        rectangle.go(30,60,40,30);

        Circle circle = new Circle();
        circle.go(30,10,40,40);

        Shape[] q = {rectangle,circle,};

        for(int i =0; i< q.length; i++){
            q[i].draw(shapes,q[i].x,q[i].y,q[i].a,q[i].b);
        }
        File result = new File("result.png");
        try{
            ImageIO.write(conclusion, "png", result);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}