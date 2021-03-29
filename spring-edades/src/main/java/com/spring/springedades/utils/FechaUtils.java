package com.spring.springedades.utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FechaUtils {

    public static boolean isValid(int day, int month, int year) {
        if (day <= 0 || month <= 0 || year <= 0) {
            return false;
        } else if (month > 12 || year > 9999) {
            return false;
        } else {
            int maxValue;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    maxValue = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    maxValue = 30;
                    break;
                case 2:
                    maxValue = year % 4 == 0 ? 29 : 28;
                    break;
                default:
                    maxValue = 31;
            }
            return day <= maxValue;
        }
    }
}
