package HungrySnake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Random;

public class gameControl extends Panel implements Runnable, KeyListener{

    private LinkedList<Point> snake;
    private Point apple;
    private int direction = gamePlay.noDirection;

    private Thread runThread;
    private Graphics globalGraphics;

    private final int pointWidth= 15;
    private final int pointHeight= 15;
    private final int gridWidth= 25;
    private final int gridHeight= 25;

    public void paint(Graphics g){
        this.setPreferredSize(new Dimension(640, 480));
        snake = new LinkedList<Point>();
//        apple = new Point(10,10);
        restart();
        placeApple();
        snake.add(new Point(3,1));
        snake.add(new Point(3,2));
        snake.add(new Point(3,3));
        g.fillRect(0,0,10,10);
        globalGraphics =g.create();
        this.addKeyListener(this);
        if(runThread==null){
            runThread = new Thread(this);
            runThread.start();
        }
    }

    public void Draw(Graphics g){
        g.clearRect(0,0,pointWidth*gridWidth,pointHeight*gridHeight);
//        DrawGrid(g);
        DrawSnake(g);
        DrawApple(g);
    }

    public void DrawSnake(Graphics g){
        for (Point p : snake) {
            g.setColor(Color.GREEN);
            g.fillRect(p.x * pointWidth, p.y * pointHeight, pointWidth, pointHeight);
            g.setColor(Color.black);
            g.drawRect(p.x * pointWidth, p.y * pointHeight, pointWidth, pointHeight);
        }
        g.setColor(Color.black);
    }

    public void DrawApple(Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(apple.x*pointWidth, apple.y*pointHeight, pointWidth, pointHeight);
        g.setColor(Color.black);
    }

    public void placeApple(){
        Random ran = new Random();
        int randomX = ran.nextInt(gridWidth);
        int randomY = ran.nextInt(gridHeight);
        Point randomPoint = new Point(randomX,randomY);
        while (snake.contains(randomPoint)){
            randomX = ran.nextInt(gridWidth);
            randomY = ran.nextInt(gridHeight);
            randomPoint = new Point(randomX,randomY);
        }
        apple = randomPoint;
    }


    public void restart(){
        snake.clear();
        snake.add(new Point(3,1));
        snake.add(new Point(3,2));
        snake.add(new Point(3,3));
        direction = gamePlay.noDirection;
    }

    public void move(){
        Point head = snake.peekFirst();
        Point newPoint = head;
        switch(direction){
            case gamePlay.up:
                newPoint = new Point(head.x, head.y-1);
                break;
            case gamePlay.down:
                newPoint = new Point(head.x, head.y+1);
                break;
            case gamePlay.left:
                newPoint = new Point(head.x-1, head.y);
                break;
            case gamePlay.right:
                newPoint = new Point(head.x+1, head.y);
                break;
        }

        snake.remove(snake.peekLast());

        if (newPoint.equals(apple)) {
            // hit the apple
            Point addPoint = (Point) newPoint.clone();
            switch (direction) {
                case gamePlay.up:
                    newPoint = new Point(head.x, head.y - 1);
                    break;
                case gamePlay.down:
                    newPoint = new Point(head.x, head.y + 1);
                    break;
                case gamePlay.left:
                    newPoint = new Point(head.x - 1, head.y);
                    break;
                case gamePlay.right:
                    newPoint = new Point(head.x + 1, head.y);
                    break;
            }
            snake.push(addPoint);
            placeApple();
        }
        else if (newPoint.x<0||newPoint.x>gridWidth){
            // out of bound, reset game
            restart();
            return;
        }
        else if (newPoint.y<0||newPoint.y>gridHeight){
            // out of bound, reset game
            restart();
            return;
        }
        else if (snake.contains(newPoint)){
            // ran into itself, reset game
            restart();
            return;
        }
        snake.push(newPoint);

    }

    @Override
    public void run() {
        while (true){
            move();
            Draw(globalGraphics);

            try
            {
                Thread.currentThread();
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                direction = gamePlay.up;
                break;
            case KeyEvent.VK_DOWN:
                direction = gamePlay.down;
                break;
            case KeyEvent.VK_LEFT:
                direction = gamePlay.left;
                break;
            case KeyEvent.VK_RIGHT:
                direction = gamePlay.right;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

//    public void DrawGrid(Graphics g){
//        g.drawRect(0,0,gridWidth*pointWidth, gridHeight*pointHeight);
//        for (int x = pointWidth; x<gridWidth*pointWidth; x+=pointWidth){
//            g.drawLine(x,0,x,pointHeight*gridHeight);
//        }
//        for (int y = pointHeight; y<gridHeight*pointHeight; y+=pointHeight){
//            g.drawLine(0,y,gridWidth*pointWidth,y);
//        }
//    }
}
