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
    currentIndex = 0;
  }

  public int length() {
    return data.length;
  }

  public boolean hasNext() {
    return currentIndex < data.length;
  }

  public int next() {
    if (hasNext()) {
      currentIndex ++;
      return data[currentIndex-1];
    }
    throw new NoSuchElementException();
  }

  public ArraySequence(IntegerSequence otherseq) {
    otherseq.reset();
    data = new int[otherseq.length()];
    for (int i = 0; i < otherseq.length(); i ++) {
      data[i] = otherseq.next();
    }
    otherseq.reset();
    currentIndex = 0;
  }
}
