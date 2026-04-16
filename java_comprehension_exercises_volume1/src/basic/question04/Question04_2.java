package basic.question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第7章 配列
 */

public class Question04_2 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 1. 配列の初期化
		int[] ageGroup = { 23, 33, 26, 21, 25, 22 };

		// 2. メッセージ出力
		System.out.println("4 番目の人の年齢を入力してください。");

		// 3. 入力値を数値に変換
		String input = reader.readLine();
		int temporaryAge = Integer.parseInt(input);

		// 4. 配列の4番目（インデックスは3）に代入
		ageGroup[3] = temporaryAge;

		// 5. 4番目の要素を出力
		System.out.println("4 番目の人の年齢は" + ageGroup[3] + "歳です。");

		// 6. 配列の長さを出力
		System.out.println("人数は" + ageGroup.length + "人です。");

	}

}
