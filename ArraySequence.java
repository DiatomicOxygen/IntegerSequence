import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  public ArraySequence(int [] other){
    currentIndex = 0;
    data = new int[other.length];
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
  }

  public void reset() {

  }

  public int length() {
    return 0;
  }

  public boolean hasNext() {
    return true;
  }

  public int next() {
    return 0;
  }
}
