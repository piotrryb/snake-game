package pl.game.snake;

import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame{
    private Snake() {
        add(new Board());
        setResizable(false);
        pack();
        setTitle("Snake by PR");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}
