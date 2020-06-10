import java.util.Scanner;
public class javaSwitch {
    public static void main(String[] args) {
        System.out.println("季節の名前入力ください　：");
        Scanner sc = new Scanner(System.in);
        
        String like = sc.next();
        
        switch(like){
        case"春":
            System.out.println("英語で Spring");
            break;
        case"夏":
            System.out.println("英語で Summer");
            break;
        case"秋":
            System.out.println("英語で Autumn");
            break;
        case"冬":
            System.out.println("英語で Winter");
            break;
    
        default:
            System.out.println("季節しゃない！");
            break;
        }
        sc.close();
    }
}