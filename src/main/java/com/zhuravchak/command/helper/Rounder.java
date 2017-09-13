package com.zhuravchak.command.helper;

/**
 * Created by Yaroslav on 13-Sep-17.
 */
public class Rounder {
    public static double round(double number, int digitsAfterDot){

        double date = 1.0;
        for(int i = 0; i<digitsAfterDot; i++ ){
            date = date*10;
        }
        number = Math.rint(date * number) / date;

        return number;
    }
}
