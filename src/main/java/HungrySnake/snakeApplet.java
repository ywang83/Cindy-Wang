package HungrySnake;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class snakeApplet extends Applet {
    private gameControl game;

    public void init()
    {
        game = new gameControl();
        game.setPreferredSize(new Dimension(640,480));
        game.setVisible(true);
        game.setFocusable(true);
        this.add(game);
        this.setVisible(true);
        this.setSize(new Dimension(640,480));
    }

    public void paint(Graphics g){
        this.setSize(new Dimension(640, 480));

    }

}
