public class CounterModel{
  private int x;

  public CounterModel(){
    x = 0;
  }

  public void inc(){
    x = x + 1;
  }

  public int read(){
    return x;
  }
}
