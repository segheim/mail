package demos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilTest {

    @Test
    public void isPositiveNumberTest() {
        String expected = "16";

        Assertions.assertTrue(StringUtil.isPositiveNumber(expected));
    }
}
