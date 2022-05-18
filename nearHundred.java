public class Main {
    public boolean nearHundred(int n) {
        boolean result;
        if (((n >= 90) && (n <= 110)) || ((n >= 190) && (n <= 210)))
        result = true;
        else result = false;
        return result;
    }
}