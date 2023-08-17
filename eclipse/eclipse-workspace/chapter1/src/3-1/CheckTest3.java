public class CheckTest3 {
  public static void main(String[] args){
     /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */
        int[] data = {3, 1, 2, 7, 5};

        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
        for(int i = 0; i < data.length; i++){ //int型のiを0で初期化。iがdata配列の要素数より小さい時iに1ずつ足していく
          System.out.print(data[i] + " ");  //data配列の要素を一つずつ取り出して表示する
        }
      System.out.println();
      for (int i = 0; i < data.length - 1; i++) { //int型のiを0で初期化。iがdata配列から1を引いた要素数より小さい時iに1ずつ足していく（配列が０番目からスタートするため）
          for (int j = data.length - 1; j > i; j--) { //int型のjにdata配列から1を引いた要素数で初期化。（配列が０番目からスタートするため）jがiより小さい時jから1ずつ引いていく
              /*
              * 問3
              * 以下、配列の添字を入れてソートを完成させなさい
              */
              if(data[j - 1] > data[j]){ //data配列jから1を引いた値(要素番号)がdata配列jより大きい時の条件
                int box = data[j];  //int型のboxをdata配列のjの値で初期化。

                data[j] = data[j - 1];  //data[j]にdata[j - 1]を代入

                data[j - 1] = box;  //data[j - 1]にboxを代入
              }
          }
      }
      for(int i = 0; i < data.length; i++){  //int型のiを0で初期化。iがdata配列の要素数より小さい時iに1ずつ足していく（配列番号0（1）から4（5）まで）
          System.out.print(data[i] + " ");  //data[i]で配列の上記で指定した配列要素を持ってきて表示させる
      }
  }
}