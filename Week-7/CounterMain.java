import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CounterMain{
  public static void main(String[] cmdLn){
    JFrame f = new JFrame("Counter");
    JButton count = new JButton("INC");

    CounterModel c = new CounterModel();
    CounterView cv = new CounterView(c);

    count.addActionListener(new CounterController(c, cv));

    f.setLayout(new BorderLayout());
    f.add(count, BorderLayout.SOUTH);
    f.add(cv, BorderLayout.CENTER);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);

  }
}
