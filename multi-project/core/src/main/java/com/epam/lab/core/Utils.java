package com.epam.lab.core;


import demos.StringUtil;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length; i++) {
            if (!StringUtil.isPositiveNumber(str[i])) {
                return false;
            }
        }
        return true;
    }
}
