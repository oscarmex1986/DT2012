import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class SpecializedPanel extends JPanel{

    public SpecializedPanel(){
      setBackground(Color.MAGENTA);
      setPreferredSize(new Dimension(100,100));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("vero", 10, 10);
    }


}
