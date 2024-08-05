package bai13;

import java.util.Scanner;

public class DocSoToiDa4ChuSo {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so co toi da 4 chu so: ");
        number = sc.nextInt();

        if(number<0 || number>9999){
            System.out.println("Nhap khong dung gioi han so");
        }else{
            int nghin,tram,chuc,donvi;

            nghin = number/1000;
            tram = (number%1000)/100;
            chuc = (number%100)/10;
            donvi = number%10;

            System.out.println("So "+number+" duoc doc la: ");
            switch (nghin){
                case 1:
                    System.out.print("Mot nghin ");
                    break;
                case 2:
                    System.out.print("Hai nghin ");
                    break;
                case 3:
                    System.out.print("Ba nghin ");
                    break;
                case 4:
                    System.out.print("Bon nghin ");
                    break;
                case 5:
                    System.out.print("Nam nghin ");
                    break;
                case 6:
                    System.out.print("Sau nghin ");
                    break;
                case 7:
                    System.out.print("Bay nghin ");
                    break;
                case 8:
                    System.out.print("Tam nghin ");
                    break;
                case 9:
                    System.out.print("Chin nghin ");
                    break;
            }

            switch (tram){
                case 0:
                    if(nghin!=0 && (chuc!=0 || donvi!=0))
                        System.out.print("Khong tram ");
                    break;
                case 1:
                    System.out.print("Mot tram ");
                    break;
                case 2:
                    System.out.print("Hai tram ");
                    break;
                case 3:
                    System.out.print("Ba tram ");
                    break;
                case 4:
                    System.out.print("Bon tram ");
                    break;
                case 5:
                    System.out.print("Nam tram ");
                    break;
                case 6:
                    System.out.print("Sau tram ");
                    break;
                case 7:
                    System.out.print("Bay tram ");
                    break;
                case 8:
                    System.out.print("Tam tram ");
                    break;
                case 9:
                    System.out.print("Chin tram ");
                    break;
            }

            switch (chuc){
                case 0:
                    if((nghin!=0 || tram!=0) && donvi!=0)
                        System.out.print("linh ");
                    break;
                case 1:
                    System.out.print("Muoi ");
                    break;
                case 2:
                    System.out.print("Hai muoi ");
                    break;
                case 3:
                    System.out.print("Ba muoi ");
                    break;
                case 4:
                    System.out.print("Bon muoi ");
                    break;
                case 5:
                    System.out.print("Nam muoi ");
                    break;
                case 6:
                    System.out.print("Sau muoi ");
                    break;
                case 7:
                    System.out.print("Bay muoi ");
                    break;
                case 8:
                    System.out.print("Tam muoi ");
                    break;
                case 9:
                    System.out.print("Chin muoi ");
                    break;
            }

            switch (donvi){
                case 0:
                    if(nghin==0 && tram==0 && chuc==0)
                        System.out.print("Khong ");
                    break;
                case 1:
                    System.out.print("Mot ");
                    break;
                case 2:
                    System.out.print("Hai ");
                    break;
                case 3:
                    System.out.print("Ba ");
                    break;
                case 4:
                    System.out.print("Bon ");
                    break;
                case 5:
                    if(chuc!=0)
                        System.out.print("lam ");
                    else
                        System.out.print("Nam ");
                    break;
                case 6:
                    System.out.print("Sau ");
                    break;
                case 7:
                    System.out.print("Bay ");
                    break;
                case 8:
                    System.out.print("Tam ");
                    break;
                case 9:
                    System.out.print("Chin ");
                    break;
            }
        }
    }
}
