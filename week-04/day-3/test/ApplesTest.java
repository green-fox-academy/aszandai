import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {


    @Test
    public void getApple_MatchingStrings() {
        String expected = "apple";
//        String expected = "not apple";
        String actual = getApple();
        System.out.println();
        assertEquals(expected, actual);
    }

    private String getApple() {
        return "apple";
    }


}