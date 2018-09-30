package Hometask03;

public class Task02 {

	public static void main(String[] argresult) {

		double result = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0)
				result -= 1 / i;
			else
				result += 1 / i;

		}
		System.out.println("Выражения ровно = " + result);
	}

}
