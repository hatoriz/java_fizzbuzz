import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hatoriz on 2/25/17.
 */
public class SoundTest {

    Sound sound = new Sound();

//    @Before
//    public void setUp() throws Exception {
//        System.out.println("Setup anything");
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        System.out.println("Teardown");
//    }
    @Test
    public void testMakeASound_ModWith3ShowFizz() throws Exception {
        Assert.assertEquals(sound.makeASound(3), "Fizz");
    }

    @Test
    public void testMakeASound_ModWith5ShowBuzz() throws Exception {
        Assert.assertEquals(sound.makeASound(5), "Buzz");
    }

    @Test
    public void testMakeASound_ModWith15ShowFizzBuzz() throws Exception {
        Assert.assertEquals(sound.makeASound(15), "FizzBuzz");
    }

    @Test
    public void testMakeSound_Cover_1_to_100() throws Exception {
        for (int i = 1; i <= 100 ; i++) {
            if (i % 15 == 0){
                Assert.assertEquals(sound.makeASound(i),"FizzBuzz");
            } else if (i % 3 == 0) {
                Assert.assertEquals(sound.makeASound(i),"Fizz");
            } else if (i % 5 == 0) {
                Assert.assertEquals(sound.makeASound(i),"Buzz");
            }
        }
    }

}