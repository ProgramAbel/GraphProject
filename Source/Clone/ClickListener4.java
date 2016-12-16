import java.awt.event.ActionEvent; import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.lang.Object;
import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
/**
   An action listener that prints a message.
*/
public class ClickListener4 implements ActionListener {
//Highscores

JFrame menu;

public ClickListener4(JFrame f) {
  menu = f;
}


public void actionPerformed(ActionEvent event) {
  JFrame frame = new JFrame();
  final int FRAME_WIDTH = 700;
  final int FRAME_HEIGHT = 700;
  frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
  frame.setTitle("Chromatic Craziness: high scores");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  // JButton back = new JButton;
  // frame.add(back);


  try{
  BufferedImage img = ImageIO.read(new File("resources/background5.jpeg"));
  ImageIcon icon = new ImageIcon(img);
  JLabel contentPane = new JLabel();
  contentPane.setIcon(icon);
  contentPane.setLayout(new BorderLayout());
  frame.setContentPane(contentPane);
  frame.getContentPane().setBackground(Color.BLACK);
  Container c = frame.getContentPane();

  } catch(IOException e) {e.printStackTrace();}

  JPanel backbutt = new JPanel();
  frame.add(backbutt, BorderLayout.PAGE_END);
  backbutt.setBackground(Color.black);

  JPanel scores = new JPanel();

  JButton back = new JButton("BACK");
  ActionListener listener = new ClickMenu(menu);
  back.addActionListener(listener);

  backbutt.add(back);
  backbutt.setVisible(true);

    frame.setVisible(true);

    back.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
           frame.dispose();
        }
    });

}
}
