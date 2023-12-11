import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class LabelChanger implements ActionListener{

  private JLabel theLabel;
  private boolean toggle;

  public LabelChanger(JLabel lab){
    theLabel = lab;
    toggle = true;
  }

  public void actionPerformed(ActionEvent e){
    if(toggle){
      theLabel.setIcon(new ImageIcon("dice2.gif"));
    }
    else{
      theLabel.setIcon(new ImageIcon("dice.gif"));
    }
    toggle = !toggle;
  }

}
