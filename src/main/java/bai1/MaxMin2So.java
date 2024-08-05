package bai1;
import java.util.Scanner;
public class MaxMin2So{
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen a: ");
        a = sc.nextInt();
        System.out.println("Nhap so nguyen b: ");
        b = sc.nextInt();


        int max,min;
        if(a>b){
            max = a;
            min = b;
        }else{
            min = a;
            max = b;
        }
        System.out.println("Max cua "+a+" va "+b+" la: "+max);
        System.out.println("Min cua "+a+" va "+b+" la: "+min);
    }
}