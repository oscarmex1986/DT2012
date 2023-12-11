import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CounterController implements ActionListener{

  private CounterModel c;
  private CounterView cv;

  public CounterController(CounterModel cm, CounterView cv){
    c = cm;
    this.cv = cv;
  }

  public void actionPerformed(ActionEvent e){
    c.inc();
    cv.repaint();
  }
}
