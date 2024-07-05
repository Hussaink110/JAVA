import java.awt.Color;

import javax.swing.JFrame;

public class brick_game {
    public static void main(String[] args) {
        JFrame obj=new JFrame();
        game_play game_Play = new game_play();

        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(game_Play);
        obj.setVisible(true);
    }

}