import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class PanelTester{
  public static void main(String[] args) {

    JFrame theWindow = new JFrame("Testing a JPanel!");

    SpecializedPanel thePanel = new SpecializedPanel();

    JButton pChanger = new JButton("Change it!");
    pChanger.addActionListener(new PanelChanger(thePanel));

    theWindow.setLayout(new FlowLayout());

    theWindow.add(thePanel);
    theWindow.add(pChanger);

    theWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theWindow.pack();
    theWindow.setVisible(true);
  }

}
