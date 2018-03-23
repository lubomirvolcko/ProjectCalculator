import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setContentPane(new Calculator().getCALCULATOR());
        jframe.setVisible(true);
        jframe.setSize(250, 290);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
