/**
 * Created by hatoriz on 2/25/17.
 */
public class Sound {

    public Sound() {
    }

    public String makeASound(int i){

        if (i% 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if ( i % 5 == 0) {
            return "Buz";
        }
        return Integer.toString(i);
    }
}
