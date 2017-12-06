package snake;


import JFramePractice.gameControl;

import javax.swing.*;
import java.awt.*;

public class Main {
  public static void main(final String[] args) {

    JFrame frame = new JFrame("Hungry Snake");
    gameControl game = new gameControl();

//    game = new gameControl();
    game.setPreferredSize(new Dimension(640,480));
    game.setVisible(true);
    game.setFocusable(true);
    frame.add(game);
    frame.setVisible(true);
    frame.setSize(new Dimension(640,480));
  }

}
