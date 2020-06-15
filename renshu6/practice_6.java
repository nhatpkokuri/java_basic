package renshu6;
import java.util.Scanner;
public class practice_6 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.println("数値を２つ入力してください：");
        int a = nc.nextInt();
        int b = nc.nextInt();
        if(a>b){
            System.out.println(a+" の方が大きいです。");
            System.out.println(b+" の方が小さいです。");

        }else{
            System.out.println(a+" の方が小さいです。");
            System.out.println(b+" の方が大きいです。");       
        }
        nc.close();
    }
}