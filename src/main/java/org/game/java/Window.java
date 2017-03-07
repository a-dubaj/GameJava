package org.game.java;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andrzejdubaj on 07.03.2017.
 */
public class Window extends Canvas {

    private static final long serialVersionUID = -2015122009233523593L;

    public Window(int width, int height, String title, Game game) {
        JFrame frame = new JFrame(title);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(game);
        frame.setVisible(true);
        game.start();
    }
}
