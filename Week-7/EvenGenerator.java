import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EvenGenerator implements ActionListener{

  private int evenNumber;

  public EvenGenerator(){
    evenNumber = 0;
  }

  public void actionPerformed(ActionEvent e){
      System.out.println(evenNumber);
      evenNumber = evenNumber + 2;
  }

}
