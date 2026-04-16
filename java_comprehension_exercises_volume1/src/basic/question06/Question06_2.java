package basic.question06;

import java.io.IOException;

public class Question06_2 {

	public static void main(String[] args) throws IOException {

		String[] studentName = { "かなこ", "ゆうた", "あい", "はるひ", "かずき" };

		// 拡張 for 文を使用して全要素を出力
		for (String name : studentName) {
			System.out.println(name);
		}
	}
}