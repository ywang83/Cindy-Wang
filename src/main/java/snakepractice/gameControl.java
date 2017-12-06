package snakepractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

public class gameControl extends JPanel implements KeyListener, ActionListener{

    private boolean play = false;
    private int score = 0;

    private LinkedList snake = new LinkedList<>();

    private Timer time;
    private int delay = 100;

    private int snakeX= 310;
    private int appleX= 100;
    private int appleY= 200;

//    private int move = 0;

    public gameControl(){
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        time = new Timer(delay,this);
        time.start();
    }

    public void paint(Graphics graphic){

        // fill the panel
        graphic.setColor(Color.white);
        graphic.drawRect(10,10,560,35);

        graphic.setColor(Color.lightGray);
        graphic.fillRect(10,60,560,435);

        // create the snake
        graphic.setColor(Color.green);
        graphic.fillRect(snakeX,400,100,20);

        // create the apple
        graphic.setColor(Color.yellow);
        graphic.fillOval(appleX,appleY,20,20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
//           snake.dir();

        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT){

        }
    }

    @Override
    public void keyTyped(KeyEvent e) { }
    @Override
    public void keyReleased(KeyEvent e) { }

}
