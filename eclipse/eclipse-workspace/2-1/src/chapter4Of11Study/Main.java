package chapter4Of11Study;

//①FruitsConstants.javaをインポートしなさい。
import chapter4Of11Constants.java.*;
//②Fruits.javaをインポートしなさい。
import chapter4Of11Fruits.Fruits;

/**
 * 本問題では、基本的なJavaの構造と、importについて理解を深めていきましょう。
 *
 * 問①〜問③まであります。 全て回答し、問題にある画像と同じ表示になるようにしてください。
 *
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * ③ Fruits.javaのprintFruitsメソッドを呼び出しなさい。 また、問題の画像と同じ表示になるように
		 * printFruitsの引数にはFruitsConstantsに指定されている定数を設定してください。
		 */
		Fruits.printFruits(FruitsConstants.FRUITS_LEMON_04, FruitsConstants.FRUITS_COUNT_20);
	}

}
