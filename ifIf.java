import java.util.Scanner;
public class ifIf {
    public static void main(String[] args) {
        // && and || or
        Scanner sc = new Scanner(System.in);
        System.out.println("数値を入力ください　：");
        int c = sc.nextInt();
        if(c>50&&c<100){
            System.out.println("入力数値 は５１～９９の数値です！");

        }else{
            if (c>100) {
               System.out.println("入力数値 は１００以上の数値です！"); 
            }else{
               System.out.println("入力数値 は０～10の数値です！");
            }
        }
        sc.close();
    }
}