package demos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void isPositiveNumberTest() {
        StringUtils stringUtils = new StringUtils();
        String expected = "16";

        Assertions.assertTrue(stringUtils.isPositiveNumber(expected));
    }
}
