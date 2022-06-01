public class Main {
    public boolean posNeg(int a, int b, boolean negative) {
        boolean result;
        if ((!negative) && (((a > 0) && (b < 0))) && (((a < 0) || (b > 0)))){
          result = true;
        }
        else if ((negative) && ((a < 0) && (b < 0)))
          result = true;
        else result = false;
        return result;
      }
}