package study;
/**
* 本課題では、基本的なJavaの構造と、importについて理解を深めていきましょう。
*
* 問①〜問③まであります。
* 全て回答し、課題にある画像と同じ表示になるようにしてください。
*
*/


//①FruitsConstants.javaをインポートしなさい
	import study.constants.FruitsConstants;
//②Fruits.javaをインポートしなさい。
	import study.fruits.Fruits;
	
public class Task2_19 {
    public static void main(String[] args) {
    /* ③ Fruits.javaのprintFruitsメソッドを呼び出しなさい。
    * また、実行結果がターミナルと同じ表示になるように
    * printFruitsの引数にはFruitsConstantsに指定されている定数を設定してください。
    */
    Fruits.printFruits(FruitsConstants.FRUITS_LEMON_04, FruitsConstants.FRUITS_COUNT_20);


    }
}
