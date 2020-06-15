package renshu6;
import java.util.Scanner;
public class practice_4 {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.println("数値を２つ入力してください：");
        int a = nc.nextInt();
        int b = nc.nextInt();
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);       
        }
        nc.close();
    }
}