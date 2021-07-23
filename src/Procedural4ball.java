import processing.core.PApplet;

public class Procedural4ball extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;
    public static int ball = 0;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        moveBall(ball,HEIGHT/5);
        moveBall(2*ball,2*HEIGHT/5);
        moveBall(3*ball,3*HEIGHT/5);
        moveBall(4*ball,4*HEIGHT/5);
        ball+=1;
    }

    private void moveBall(int movementX, int height) {
        ellipse(movementX,height,DIAMETER, DIAMETER);
    }
    
    public static void main(String[] args) {
        PApplet.main("Procedural4ball",args);
    }
}
