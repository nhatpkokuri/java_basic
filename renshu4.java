/**
 * renshu4
 */
public class renshu4 {

    public static void main(String[] args) {
        String A = "男性、営業職、魚が嫌い、夏より冬が好き、猫派";
        String B = "男性、エンジニア、魚が好き、夏より冬が好き、犬派";
        String C = "男性、営業職、魚が嫌いだが肉は好き、夏より冬が好き、猫派";
        String D = "女性、エンジニア、魚が好き、冬より夏が好き、犬派";
        String E = "女性、エンジニア、魚が好き、冬より夏が好き、猫派";
        String F = "女性、営業職、魚が嫌いだが肉は好き、夏より冬が好き、犬派";
        if(A.equals("男性、営業職、魚が嫌い、夏より冬が好き、猫派")){
            System.out.println("Aさん");
        }else{
            System.out.println("エラー");
        }
        if(B.equals("男性、エンジニア、魚が好き、夏より冬が好き、犬派")){
            System.out.println("Bさん");
        }else{
            System.out.println("エラー");
        }
        if(C.equals("男性、営業職、魚が嫌いだが肉は好き、夏より冬が好き、猫派")){
            System.out.println("Cさん");
        }else{
            System.out.println("エラー");
        }
        if(D.equals("女性、エンジニア、魚が好き、冬より夏が好き、犬派")){
            System.out.println("Dさん");
        }else{
            System.out.println("エラー");
        }
        if(E.equals("女性、エンジニア、魚が好き、冬より夏が好き、猫派")){
            System.out.println("Eさん");
        }else{
            System.out.println("エラー");
        }
        if(F.equals("女性、営業職、魚が嫌いだが肉は好き、夏より冬が好き、犬派")){
            System.out.println("Fさん");
        }else{
            System.out.println("エラー");
        }
    }
}