public class Main {
    public boolean sleepIn(boolean weekday, boolean vacation) {
  boolean result = false;
  if (vacation) {
    result = true;
  }
  else if ((weekday) && (!vacation)) {
    result = false;
  }
  else result = true;
  return result;
}

}
