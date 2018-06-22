package com.example.hsbc.demo;


import java.util.ArrayList;
import java.util.List;

/**
 * 第一道题目
 *
 * @author lsh
 */

public class FirstSubject
{
    public static String fun(int num, String str)
    {
        if (num > 100)
        {
            return str;
        } else if (num % 3 == 0 && num % 5 == 0)
        {
            str += "fizzBuss" + "\n";
        }
        if (num % 3 == 0)
        {
            str += "fizz" + "\n";
        } else if (num % 5 == 0)
        {
            str += "buss" + "\n";
        } else
        {
            str += num + "\n";
        }
        return fun(++num, str);
    }

    public static String fun2(int num, String str)
    {
        if (num > 100)
        {
            return str;
        } else if (num % 3 == 0 || String.valueOf(num).contains("3"))
        {
            str += "fizz" + "\n";
        } else if (num % 5 == 0 || String.valueOf(num).contains("5"))
        {
            str += "buss" + "\n";
        } else
        {
            str += num + "\n";
        }
        return fun2(++num, str);
    }

    public static void main(String[] args)
    {
        //first requirements
        String funOne = fun(1, "");
        System.out.println(funOne);

        //second requirements
        String funTwo = fun2(1, "");
        System.out.println(funTwo);
    }


}
