import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
       int boardWidth = 800;
       int boardHeight = boardWidth;
       int tileSize = 25;

       JFrame frame = new JFrame("Snake");
       frame.setVisible(true);
       frame.setSize(boardWidth, boardHeight); // it is a window which is 600x600 pixels
       frame.setLocationRelativeTo(null);
       frame.setResizable(false);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}
