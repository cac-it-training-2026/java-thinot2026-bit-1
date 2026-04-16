package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 50, 250, 100 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//在庫数
		int[] stocks = new int[5];
		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の在庫数: > ");
			stocks[i] = Integer.parseInt(reader.readLine());
		}

		// 2. 購入数の入力（在庫チェック付き）

		for (int i = 0; i < itemNames.length; i++) {
			while (true) {
				System.out.print(itemNames[i] + "の購入数: > ");
				int inputAmount = Integer.parseInt(reader.readLine());

				if (inputAmount <= stocks[i]) {
					amounts[i] = inputAmount;
					break; // 在庫内であればループを抜ける
				} else {
					System.out.println("在庫を超えています。もう一度入力してください。");
				}
			}
		}

		// 3. 購入数、在庫数、合計金額の表示
		int totalSum = 0;
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "：購入 " + amounts[i] + " 個");
			System.out.println("在庫 " + stocks[i] + " 個");
			totalSum += prices[i] * amounts[i];
		}

		System.out.println("合計金額：" + totalSum + " 円");

	}
}
