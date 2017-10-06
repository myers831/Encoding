package com.example.admin.encoding;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * Created by Admin on 10/6/2017.
 */

public class Encode {
    public static char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static void main(String[] args) {

        System.out.println(f("Errors in strategy cannot be correct through tactical maneuvers"));

        for(int i = 0; i < g("Hello there! Apple!").length; i++){
            System.out.println(g("Hello there! Apple!")[i][0] + ": " + g("Hello there! Apple!")[i][1]);
        }


    }

    public static String f(String s){


        char[] result = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < abc.length; j++){
                if(s.charAt(i) == ' '){
                    result[i] = ' ';
                }
                if(Character.toLowerCase(s.charAt(i)) == abc[j]){
                    result[i] = abc[(abc.length - 1) - j];
                }
            }
        }

        return new String(result);
    }

    public static String[][] g(String s) {

        int count = 0;
        String[][] dic = new String[abc.length][abc.length];

        for(int i = 0; i < abc.length; i++){
            for(int j = 0; j < s.length(); j++){
                if(abc[i] == Character.toLowerCase(s.charAt(j))){
                    count++;
                }
            }
            dic[i][0] = String.valueOf(abc[i]);
            dic[i][1] = String.valueOf(count);
            count = 0;
        }

        return dic;
    }
}