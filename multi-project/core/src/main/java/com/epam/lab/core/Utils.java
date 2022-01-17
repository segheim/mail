package com.epam.lab.core;


import demos.StringUtil;

public class Utils {

    public boolean isAllPositiveNumbers(String... str) {
        StringUtil stringUtil = new StringUtil();
        for (int i = 0; i < str.length; i++) {
            if (!stringUtil.isPositiveNumber(str[i])) {
                System.out.println(str[i]);
                return false;
            }
        }
        return true;
    }
}
