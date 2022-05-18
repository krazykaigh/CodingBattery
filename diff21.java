public class Main {    
    public int diff21 (int n) {
        int result = 0;
        if (n > 21) {
          result = (n - 21)* 2;
        }
        else result = (21 -n);
        return result;
    }
}