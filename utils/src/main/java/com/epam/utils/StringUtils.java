package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static void main(String[] args) {
        System.out.println(isPositiveNumber("11.1"));
    }

    public static boolean isPositiveNumber(String str) {
         return NumberUtils.isCreatable(str) && Double.parseDouble(str) > 0;
    }
}
