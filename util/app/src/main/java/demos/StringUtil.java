package demos;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {

    public static boolean isPositiveNumber(String str) {
        return StringUtils.isNumeric(str) ? Integer.parseInt(str) > 0 : false;
    }
}
