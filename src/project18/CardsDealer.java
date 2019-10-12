package project18;

import java.util.Random;

public class CardsDealer {

	public static void main(String[] args) {
		Random random = new Random();
		String player1 = "";
		String player2 = "";
		String player3 = "";
		String player4 = "";

		for (int i = 0; i < TypeCard.NUMBER_PLAYER; i++) {
			if (i == 0) {
				// lấy ra 13 trong 52 số thẻ bài
				for (int j = 0; j < TypeCard.NUMBER_CARD; j++) {
					// sinh ra loại thẻ ngẫu nhiên
					int numberRandomToChooseNameCard = random.nextInt(TypeCard.NUMBER_TYPE_CARD);

					// sinh ra loại số thẻ ngẫu nhiên
					int numberRandomToChooseNumberCard = random.nextInt(TypeCard.ALL_TYPE.length);

					// kết hợp số thẻ ngẫu nhiên + loại thẻ ngẫu nhiên
					if (numberRandomToChooseNameCard == 0)
						player1 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.CLUBS + " ";
					else if (numberRandomToChooseNameCard == 1)
						player1 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.DIAMOND + " ";
					else if (numberRandomToChooseNameCard == 2)
						player1 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.HEART + " ";
					else
						player1 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.SPADES + " ";
				}
			} else if (i == 1) {
				// lấy ra 13 trong 52 số thẻ bài
				for (int j = 0; j < TypeCard.NUMBER_CARD; j++) {
					// sinh ra loại thẻ ngẫu nhiên
					int numberRandomToChooseNameCard = random.nextInt(TypeCard.NUMBER_TYPE_CARD);

					// sinh ra loại số thẻ ngẫu nhiên
					int numberRandomToChooseNumberCard = random.nextInt(TypeCard.ALL_TYPE.length);

					// kết hợp số thẻ ngẫu nhiên + loại thẻ ngẫu nhiên
					if (numberRandomToChooseNameCard == 0)
						player2 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.CLUBS + " ";
					else if (numberRandomToChooseNameCard == 1)
						player2 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.DIAMOND + " ";
					else if (numberRandomToChooseNameCard == 2)
						player2 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.HEART + " ";
					else
						player2 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.SPADES + " ";
				}
			} else if (i == 2) {
				// lấy ra 13 trong 52 số thẻ bài
				for (int j = 0; j < TypeCard.NUMBER_CARD; j++) {
					// sinh ra loại thẻ ngẫu nhiên
					int numberRandomToChooseNameCard = random.nextInt(TypeCard.NUMBER_TYPE_CARD);

					// sinh ra loại số thẻ ngẫu nhiên
					int numberRandomToChooseNumberCard = random.nextInt(TypeCard.ALL_TYPE.length);

					// kết hợp số thẻ ngẫu nhiên + loại thẻ ngẫu nhiên
					if (numberRandomToChooseNameCard == 0)
						player3 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.CLUBS + " ";
					else if (numberRandomToChooseNameCard == 1)
						player3 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.DIAMOND + " ";
					else if (numberRandomToChooseNameCard == 2)
						player3 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.HEART + " ";
					else
						player3 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.SPADES + " ";
				}
			} else {
				// lấy ra 13 trong 52 số thẻ bài
				for (int j = 0; j < TypeCard.NUMBER_CARD; j++) {
					// sinh ra loại thẻ ngẫu nhiên
					int numberRandomToChooseNameCard = random.nextInt(TypeCard.NUMBER_TYPE_CARD);

					// sinh ra loại số thẻ ngẫu nhiên
					int numberRandomToChooseNumberCard = random.nextInt(TypeCard.ALL_TYPE.length);

					// kết hợp số thẻ ngẫu nhiên + loại thẻ ngẫu nhiên
					if (numberRandomToChooseNameCard == 0)
						player4 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.CLUBS + " ";
					else if (numberRandomToChooseNameCard == 1)
						player4 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.DIAMOND + " ";
					else if (numberRandomToChooseNameCard == 2)
						player4 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.HEART + " ";
					else
						player4 += TypeCard.ALL_TYPE[numberRandomToChooseNumberCard] + TypeCard.SPADES + " ";
				}
			}
		}
		System.out.println("Player #1: " + player1);
		System.out.println("Player #2: " + player2);
		System.out.println("Player #3: " + player3);
		System.out.println("Player #4: " + player4);
	}
}
