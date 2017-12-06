package snakepractice;

import snakepractice.HungrySnake;

import javax.swing.*;

public class Snakepractice {
  public static void main(final String[] args) {

    // Use GUI Form to create game window
    JFrame frame = new JFrame("Hungry Snake");
    frame.setContentPane(new HungrySnake().pan);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);

    // Use JFrame to creat game window
//    JFrame frame = new JFrame();
//    frame.setVisible(true);
//    frame.setTitle("Hungry Snake");
//    frame.setSize(600,400);
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    JPanel panel = new JPanel();
//    panel.setBackground(Color.LIGHT_GRAY);
//
//    JButton start = new JButton("Start Game");
//    start.setBounds(200,400,60,30);
////    start.addActionListener();
//
//    panel.add(start);
//    frame.add(panel);


//    graphic.setColor(Color.lightGray);
//    graphic.fillRect(0,0,3,592);
//    graphic.fillRect(0,0,692,3);
//    graphic.fillRect(691,0,3,592);

    // creat the snake
//    graphic.setColor(Color.green);
//    graphic.fillRect(snakeX,400,100,20);

  }

}

// create the snake
//        graphic.setColor(Color.green);
//                graphic.fillRect(snakeX,400,snake[0],20);
//
//                if(move==0){
//                snake[2]=50;
//                snake[1]=75;
//                snake[0]=100;
//                }