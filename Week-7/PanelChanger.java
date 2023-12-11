import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;

public class PanelChanger implements ActionListener{

  private JPanel thePanel;
  private boolean toggle;

  public PanelChanger(JPanel panel){
    thePanel = panel;
    toggle = true;
  }

  public void actionPerformed(ActionEvent e){
    thePanel.setBackground(Color.RED);
  }

}
