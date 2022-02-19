import processing.core.PApplet;


public class Processing4BallsOOP extends PApplet {

    public static final int HEIGHT = 600;
    public static final int WIDTH = 800;
    public static final int DIAMETER = 10;

    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;
    public static void main(String[] args) {
        PApplet.main("Processing4BallsOOP",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1=new Ball(0,HEIGHT/5);
        ball2=new Ball(0,HEIGHT*2/5);
        ball3=new Ball(0,HEIGHT*3/5);
        ball4=new Ball(0,HEIGHT*4/5);
    }

    @Override
    public void draw() {
        ellipse(ball1.x,ball1.y,DIAMETER,DIAMETER);
        ellipse(ball2.x,ball2.y,DIAMETER,DIAMETER);
        ellipse(ball3.x,ball3.y,DIAMETER,DIAMETER);
        ellipse(ball4.x,ball4.y,DIAMETER,DIAMETER);
        ball1.changeX(1);
        ball2.changeX(2);
        ball3.changeX(4);
        ball4.changeX(8);
    }

}
