package com.stp.Misc;

public class LeapYear {

    public boolean leapyear(int year){

        boolean is_leap_year = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
            is_leap_year = true;
        }

        else
            is_leap_year = false;

        System.out.println("Result: ");
        if (!is_leap_year)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");

        return is_leap_year;
    }
}
