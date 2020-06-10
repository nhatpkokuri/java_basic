import java.util.Scanner;
public class trycatch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("数値入力ください");
            int num = sc.nextInt();
            System.out.println("入力した　" + num + " です");
            sc.close();
        } catch (Exception e) {
            System.out.println("エラーが発生します。もう一度数値入力ください");

        }
    }
}