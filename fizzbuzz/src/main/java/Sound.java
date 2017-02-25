/**
 * Created by hatoriz on 2/25/17.
 */
public class Sound {

    public Sound() {
    }

    public String makeASound(int i){

        if (i % 3 == 0) {
            return "Fizz";
        } else if ( i % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(i);
    }
}
