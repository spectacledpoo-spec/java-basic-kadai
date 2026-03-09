package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 myDict = new Dictionary_Chapter21();

        // 辞書に単語を追加
        myDict.addWords();

        // 調べたい単語を配列にする
        String[] words = {"apple", "banana", "grape", "orange"};

        // 検索を実行
        myDict.searchWords(words);
    }
}