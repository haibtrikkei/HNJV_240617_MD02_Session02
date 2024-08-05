package bai5;

import java.util.Scanner;

public class MaxMin5So {
    public static void main(String[] args) {
        int a,b,c,d,e;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen a: ");
        a = sc.nextInt();
        System.out.println("Nhap so nguyen b: ");
        b = sc.nextInt();
        System.out.println("Nhap so nguyen c: ");
        c = sc.nextInt();
        System.out.println("Nhap so nguyen d: ");
        d = sc.nextInt();
        System.out.println("Nhap so nguyen e: ");
        e = sc.nextInt();

        int max,min;
        if(a>b){
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }

        if(max<c)
            max = c;
        if(max<d)
            max = d;
        if(max<e)
            max = e;

        if(min>c)
            min = c;
        if(min>d)
            min = d;
        if(min>e)
            min = e;

        System.out.println("Max cua ("+a+","+b+","+c+","+d+","+e+") la: "+max);
        System.out.println("Min cua ("+a+","+b+","+c+","+d+","+e+") la: "+min);
    }
}
