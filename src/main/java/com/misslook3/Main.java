package com.misslook3;

public class Main {
    public static void main(String[] args) {
        byte byte1 = -128;
        byte byte2 = 127;
        System.out.println("min.byte + max.byte" + "=" + (byte1 + byte2));

        short short1 = -32768;
        short short2 = 32767;
        System.out.println("min.short + max.short" + "=" + (short1 + short2));

        int int1 = -2147483648;
        int int2 = 2147483647;
        System.out.println("min.int(-2in31) + max.int(2in31-1)" + "=" + (int1 + int2));

        long long1 = -922337203685477600l;
        long long2 = 214748364121111113l;
        System.out.println("min.long(-2in63) + long(random)" + "=" + (long1 + long2));

        float float1 = 0.1f;
        float float2 = 0.03f;
        System.out.println("0.1f + 0.03f" + "=" + (float1 + float2));

        double double1 = 0.001d;
        double double2 = 0.002d;
        System.out.println("0.001d + 0.002d / 0.03f" + "=" + (double1 + double2 / float2));

        char char2 = 'a';
        System.out.println("1 character = " + char2);

//        boolean
        if (float1 > float2) {
            System.out.println("float1 > float2");
        } else if (float1 < float2) {
            System.out.println("float1 < float2");
        }
//        int + double
        int int11 = 11;
        System.out.println(("11 + 0.001d = ") + (int11 + double1));

    }
}