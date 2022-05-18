/* Given two int values, return their sum. Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8 */

public class Main {
    public int sumDouble(int a, int b) {
        int result = 0;
        if (a == b) {
        result = (a+b) * 2;
        }
        else result = (a + b);
        return result;
    }
}