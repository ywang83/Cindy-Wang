package JFramePractice;

import JFramePractice.Direction;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

public class gameControl extends Panel implements Runnable{
    private LinkedList<Point> snake;
    private Point apple;

    private final int pointWidth = 15;
    private final int pointHeight = 15;

    private Graphics globalGraphics;
    private Thread runThread;

    private int direction = Direction.noDirection;

    public void paint(Graphics g) {
        globalGraphics = g.create();
        if (runThread == null) {
            runThread = new Thread(this);
            runThread.start();
        }

        snake = new LinkedList<>();
        apple = new Point(200, 10);
        snake.add(new Point(100, 100));
        snake.add(new Point(100, 115));
        snake.add(new Point(100, 130));

//        this.addKeyListener(this);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                move(evt);
            }
        });
    }

    public void Draw(Graphics g) {
        g.clearRect(0,0,600,480);
        DrawSnake(g);
        DrawApple(g);
    }

    public void DrawSnake(Graphics g) {

        for (Point p : snake) {
            g.setColor(Color.GREEN);
            g.fillRect(p.x, p.y, pointWidth, pointHeight);
            g.setColor(Color.black);
            g.drawRect(p.x, p.y, pointWidth, pointHeight);
        }
    }

    public void DrawApple(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(apple.x, apple.y, pointWidth, pointHeight);
    }

    @Override
    public void run() {
        while (true) {
//            move();
            Draw(globalGraphics);

            try {
                Thread.currentThread();
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public void move(KeyEvent evt) {
        Point head = snake.peekFirst();
        Point newPoint = head;
//        KeyEvent evt = null;
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_UP:
                newPoint = new Point(head.x, head.y - 15);
                break;
            case KeyEvent.VK_DOWN:
                newPoint = new Point(head.x, head.y + 15);
                break;
            case KeyEvent.VK_LEFT:
                newPoint = new Point(head.x - 15, head.y);
                break;
            case KeyEvent.VK_RIGHT:
                newPoint = new Point(head.x + 15, head.y);
                break;
        }
        snake.remove(snake.peekLast());
        snake.push(newPoint);
    }
}
