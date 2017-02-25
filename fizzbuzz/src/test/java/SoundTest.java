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
    public void testMakeASound_1() throws Exception {
        Assert.assertEquals(sound.makeASound(1), "1");
    }

    @Test
    public void testMakeASound_2() throws Exception {
        Assert.assertEquals(sound.makeASound(2), "2");
    }

    @Test
    public void testMakeASound_ModWith3ShowFizz() throws Exception {
        Assert.assertEquals(sound.makeASound(3), "Fizz");
    }

    @Test
    public void testMakeASound_4() throws Exception {
        Assert.assertEquals(sound.makeASound(4), "4");
    }

    @Test
    public void testMakeASound_ModWith5ShowBuzz() throws Exception {
        Assert.assertEquals(sound.makeASound(5), "Buzz");
    }
}