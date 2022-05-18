public class Main {
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    boolean result= true;
    if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
      result = true;
    } else result = false;
    return result;
  }
}