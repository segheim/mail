package demos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void isPositiveNumberTest() {
        StringUtil stringUtil = new StringUtil();
        String expected = "16";

        Assertions.assertTrue(stringUtil.isPositiveNumber(expected));
    }
}
