package HungrySnake;


import javax.swing.*;
import java.awt.*;

public class Main {
  public static void main(final String[] args) {

    JFrame frame = new JFrame("Hungry Snake");
    gameControl game = new gameControl();

//    game = new gameControl();
    game.setPreferredSize(new Dimension(480,400));
    game.setVisible(true);
    game.setFocusable(true);
    frame.add(game);
    frame.setVisible(true);
    frame.setSize(new Dimension(480,480));
  }

}
