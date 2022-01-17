package demos;

public class StringUtils {

    public boolean isPositiveNumber(String str) {
        if (org.apache.commons.lang3.StringUtils.isNumeric(str)) {
            return Integer.parseInt(str) > 0;
        } else
            return false;
    }
}
