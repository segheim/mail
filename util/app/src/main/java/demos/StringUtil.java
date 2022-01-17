package demos;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {
    public boolean isPositiveNumber(String str) {
        if (StringUtils.isNumeric(str)) {
            return Integer.parseInt(str) > 0;
        } else
            return false;
    }
}
