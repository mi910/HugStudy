
public class Task2_10 {

    public static void main(String[] args) {

        // ① 「みかん」、「りんご」、「ぶどう」、「メロン」の値を設定した配列 fruits を作成してください。
            String[] fruits ={"みかん","りんご","ぶどう","メロン"};
        
        // ② for文を使って①で作成した配列を出力しなさい。
        for(int i = 0; i < 4 ; i++){
            System.out.println(fruits[i]);
        }

        // ③ 以下のwhile文の処理について、何をしているのかコメントを記入してください。
        /*
        * [int型でiを初期化 while文を使用してiが50より小さいか等しくなるまで1から配列を出力している]
        */
        int i = 1;
        while(i <= 50) {
            System.out.print(i);
            i++;
        }
        System.out.println();


        /* ④ 行の最初に「段数」と「||」を追加したものを表示させるプログラムを作成しなさい。
        * 5 || 5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 |
        * 6 || 6 | 12 | 18 | 24 | 30 | 36 | 42 | 48 | 54 |
        * 7 || 7 | 14 | 21 | 28 | 35 | 42 | 49 | 56 | 63 |
        * 8 || 8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 |
        * 9 || 9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 |
        */

        for (int k = 5; k <= 9 ; k ++) {
            System.out.print( k + " ||");
            for (int j = 1; j <= 9; j++) {
                System.out.print(" " + k* j  + " |");
            }
            System.out.println();
        }
    }
}