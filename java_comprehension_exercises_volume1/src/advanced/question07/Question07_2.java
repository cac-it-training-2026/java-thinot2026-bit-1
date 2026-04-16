package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 50, 250, 100 };

		// TODO: 実装ここから
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 1. 購入個数を格納する配列の作成
		int[] amounts = new int[5];
		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の購入数: > ");
			amounts[i] = Integer.parseInt(reader.readLine());
		}

		// 2. 小計と合計金額の計算・出力
		int totalSum = 0;
		for (int i = 0; i < itemNames.length; i++) {
			int subtotal = prices[i] * amounts[i];
			totalSum += subtotal;
			System.out.println(itemNames[i] + "：" + subtotal + " 円");
		}

		System.out.println("合計金額：" + totalSum + " 円");
	}
}
