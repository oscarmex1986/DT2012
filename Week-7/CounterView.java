import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.BorderFactory;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;

public class CounterView extends JPanel{

  private CounterModel c;

  public CounterView(CounterModel cm){
    c = cm;
    setPreferredSize(new Dimension(150,100));
    setFont(new Font(Font.SANS_SERIF,Font.BOLD,50));
    setBackground(Color.MAGENTA);
    setOpaque(true);
    Border b = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
    Border tb = BorderFactory.createTitledBorder(b, "The counter");
    setBorder(tb);
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.drawString("" + c.read(),40,70);
  }
}
