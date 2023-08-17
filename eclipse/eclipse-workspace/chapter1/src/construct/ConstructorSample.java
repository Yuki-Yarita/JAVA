package construct;

public class ConstructorSample {
    String str = "";  // 変数 str を宣言して、初期値を空文字列に設定
    
    // コンストラクタ（特別なメソッド）
    public ConstructorSample(String str) {
        // コンストラクタはクラスが作られるときに実行されるメソッド
        // 引数で受け取った文字列を表示する
        System.out.println(str);
    }
}