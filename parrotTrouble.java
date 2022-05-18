public class Main {
    public boolean parrotTrouble(boolean talking, int hour) {
        boolean trouble;
        if (talking && ((hour < 7)||(hour >20)) )
          trouble = true;
        else trouble = false;
        return trouble;
      }    
}
