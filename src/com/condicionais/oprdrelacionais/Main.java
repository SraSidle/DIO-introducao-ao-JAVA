package com.condicionais.oprdrelacionais;

public class Main {
    public static void main(String[] args){
        int i1 = 3;
        int i2 = 5;
        float f1 = 3.14F;
        float f2 = 2.35F;
        // double d1 = 3.1416;
        // double d2 = 2.356789;
        // char c1 = 'B';
        // char c2 = 'I';
        String s1 = "Bianca";
        String s2 = "Aguiar";

        long l1 = 45976L;
        // long l2 = 90876L;
        byte bt1 = 12;
        byte bt2 = 15;
        Boolean b1 = true;
        Boolean b2 = false;

        System.out.println(s1 + " == " + s2 + " => " + (s1 == s2));
        System.out.println(i1 + " <= " + i2 + " => " + (i1 <= i2));
        System.out.println(l1 + " <= " + bt2 + " => " + (l1 <= bt1 ));
//System.out.println(b1 + " <= " + b2 + " => " + (b1 <= b2)); caso inválido, pois é ilógico true ser maior que false
        System.out.println(b1 + " != " + b2 + " = " + (b1 != b2));
        System.out.println(f1 + " >= " + f2 + " => " + (f1 > f2));

    }
}
