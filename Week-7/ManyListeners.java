import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;

public class ManyListeners{

  public static void main(String[] args) {

    JFrame theWindow = new JFrame("GUI Testing Window");
    theWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton quitter = new JButton("Quit");
    JButton printer = new JButton("Print");
    JButton evens = new JButton("Even Numbers");
    JButton jlChanger = new JButton("Label Changer");

    JLabel dice = new JLabel(new ImageIcon("dice.gif"));

    theWindow.setLayout(new BorderLayout());

    theWindow.add(quitter, BorderLayout.NORTH);
    theWindow.add(printer, BorderLayout.SOUTH);
    theWindow.add(evens, BorderLayout.EAST);
    theWindow.add(jlChanger, BorderLayout.WEST);

    theWindow.add(dice, BorderLayout.CENTER);

    quitter.addActionListener(new Quitter());
    printer.addActionListener(new Printer());
    evens.addActionListener(new EvenGenerator());
    jlChanger.addActionListener(new LabelChanger(dice));

    theWindow.pack();
    theWindow.setVisible(true);
  }

}
