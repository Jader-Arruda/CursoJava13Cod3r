package controle;

public class Continue {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			if (i == 6)
				continue;

			if (i % 2 == 1) {
				continue;

			}

			System.out.println(i);

		}
	}

}
