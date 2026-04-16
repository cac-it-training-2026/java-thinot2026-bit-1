package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] itemNames = new String[5];
		int[] prices = new int[5];

		// 1. 商品名の入力
		for (int i = 0; i < itemNames.length; i++) {
			System.out.print("商品 " + (i + 1) + " を入力してください: > ");
			itemNames[i] = reader.readLine();
		}

		// 2. 単価の入力
		System.out.println("各商品の単価を順に入力してください:");
		for (int i = 0; i < prices.length; i++) {
			System.out.print(itemNames[i] + "の単価: > ");
			prices[i] = Integer.parseInt(reader.readLine());
		}

		// 3. 登録商品一覧の出力
		System.out.println("登録商品一覧");
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "：" + prices[i] + " 円");
		}

	}

}
