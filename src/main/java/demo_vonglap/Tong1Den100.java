package demo_vonglap;

public class Tong1Den100 {
    public static void main(String[] args) {
        int tong_for = 0;
        for(int i = 1; i<=100; i++){
            tong_for = tong_for + i;
        }

        int tong_while = 0;
        int index = 1;
        while(index<=100){
            tong_while += index;  // tong_while = tong_while+index;
            index++;
        }

        int tong_do_while = 0;
        int cs = 1;
        do{
            tong_do_while += cs;
            cs++;
        }while(cs<=100);

        System.out.println("Tong voi vong for: "+tong_for);
        System.out.println("Tong voi vong while: "+tong_while);
        System.out.println("Tong voi do while: "+tong_do_while);
    }
}
