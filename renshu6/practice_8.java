package renshu6;
import java.util.Scanner;
public class practice_8 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.println("数値を3つ入力してください：");
        int a = nc.nextInt();
        int b = nc.nextInt();
        int c = nc.nextInt();
        if(a>b&&a>c&&b>c){
            System.out.println(a+" の方が1番大きい数値です");
            System.out.println(b+" の方が2番目に大きい数値");
            System.out.println(c+" の方が3番目に大きい数値");            
        }else if(a>b&&a>c&&b<c){
            System.out.println(a+" の方が1番大きい数値です");
            System.out.println(c+" の方が2番目に大きい数値");
            System.out.println(b+" の方が3番目に大きい数値");
        }
        if(b>a&&b>c&&a>c){
            System.out.println(b+" の方が1番大きい数値です");
            System.out.println(a+" の方が2番目に大きい数値");
            System.out.println(c+" の方が3番目に大きい数値");            
        }else if(b>a&&b>c&&a<c){
            System.out.println(b+" の方が1番大きい数値です");
            System.out.println(c+" の方が2番目に大きい数値");
            System.out.println(a+" の方が3番目に大きい数値");
        }
        if(c>a&&c>b&&b>a){
            System.out.println(c+" の方が1番大きい数値です");
            System.out.println(b+" の方が2番目に大きい数値");
            System.out.println(a+" の方が3番目に大きい数値");            
        }else if(c>a&&c>b&&b<a){
            System.out.println(c+" の方が1番大きい数値です");
            System.out.println(a+" の方が2番目に大きい数値");
            System.out.println(b+" の方が3番目に大きい数値");
        }
        nc.close();
    }
}