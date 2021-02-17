package blackjack;

public class BlackJack {

	public static void main(String[] args) {
		System.out.println(blackJack(10, 21));
		System.out.println(blackJack(20, 18));
		System.out.println(blackJack(1, 22));
		System.out.println(blackJack(22, 23));

	}

	public static int blackJack(int a, int b) {
		if (a > 21 && b > 21) {
			return 0;
		} else if (a > 21) {
			return b;
		} else if (b > 21) {
			return a;
		} else {
			if (21 - a < 21 - b) {
				return a;
			} else {
				return b;
			}

		}

	}

}