package chapter7case;

public class CasePart1 {

	// Case1. Дано целое число в диапазоне 1–7. Вывести строку — название дня
	// недели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и
	// т. д.).
	static String case1(int n) {
		String day;
		switch (n) {
		case 1:
			day = "понедельник";
			break;
		case 2:
			day = "вторник";
			break;
		case 3:
			day = "среда";
			break;
		case 4:
			day = "четверг";
			break;
		case 5:
			day = "пятница";
			break;
		case 6:
			day = "субота";
			break;
		case 7:
			day = "воскресение";
			break;
		default:
			day = "число больше 7 или менше 1";
			break;
		}
		return day;
	}

	// Case2. Дано целое число K. Вывести строку-описание оценки,
	// соответствующей числу K (1 — «плохо», 2 — «неудовлетворительно», 3 —
	// «удовлетворительно», 4 — «хорошо», 5 — «отлично»). Если K не лежит в
	// диапазоне 1–5, то вывести строку «ошибка».
	static String case2(int n) {
		String score;
		switch (n) {
		case 1:
			score = "плохо";
			break;
		case 2:
			score = "неудовлетворительно";
			break;
		case 3:
			score = "удовлетворительно";
			break;
		case 4:
			score = "хорошо";
			break;
		case 5:
			score = "отлично";
			break;

		default:
			score = "ошибка";
			break;
		}
		return score;
	}

	// Case3. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —
	// февраль и т. д.). Вывести название соответствующего времени года («зима»,
	// «весна», «лето», «осень»).
	static String case3(int n) {
		String season;
		switch (n) {
		case 12:
		case 1:
		case 2:
			season = "зима";
			break;
		case 3:
		case 4:
		case 5:
			season = "весна";
			break;
		case 6:
		case 7:
		case 8:
			season = "лето";
			break;
		case 9:
		case 10:
		case 11:
			season = "осень";
			break;

		default:
			season = "ошибка";
			break;
		}
		return season;
	}

	// Case4. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —
	// февраль и т. д.). Определить количество дней в этом месяце для
	// невисокосного года.
	static int case4(int n) {
		int numDays = 0;
		switch (n) {
		case 2:
			numDays = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break;

		default:
			System.out.print("ошибка ");
			break;
		}
		return numDays;
	}

	// Case5. Арифметические действия над числами пронумерованы следующим
	// образом: 1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление.
	// Дан номер действия N (целое число в диапазоне 1–4) и вещественные числа A
	// и B (В не равно 0). Выполнить над числами указанное действие и вывести
	// результат.
	static int case5(int a, int b, int operation) {
		int result = 0;

		switch (operation) {
		case 1:
			result = a + b;
			System.out.print(a + " + " + b + " = ");
			break;
		case 2:
			result = a - b;
			System.out.print(a + " - " + b + " = ");
			break;
		case 3:
			result = a * b;
			System.out.print(a + " * " + b + " = ");
			break;
		case 4:
			if (b == 0) {
				System.out.print("деление на ");
			} else {
				result = a / b;
				System.out.print(a + " / " + b + " = ");
				break;
			}
		default:
			System.out.print("ошибка ");
			break;
		}
		return result;
	}

	// Case6. Единицы длины пронумерованы следующим образом:
	// 1 — дециметр,
	// 2 — километр,
	// 3 — метр,
	// 4 — миллиметр,
	// 5 — сантиметр.
	// Дан номер единицы длины (целое число в диапазоне 1–5) и длина отрезка в
	// этих единицах (вещественное число). Найти длину отрезка в метрах.
	
	

	public static void main(String[] args) {

		// case1
		int n = 4;
		System.out.println("Case1");
		System.out.print(n + " - ");
		System.out.println(case1(n));
		System.out.println(" ");

		// case2
		n = 3;
		System.out.println("Case2");
		System.out.print(n + " - ");
		System.out.println(case2(n));
		System.out.println(" ");

		// case3
		n = 12;
		System.out.println("Case3");
		System.out.print(n + " - ");
		System.out.println(case3(n));
		System.out.println(" ");

		// case4
		n = 15;
		System.out.println("Case4");
		System.out.print(n + " - ");
		System.out.println(case4(n));
		System.out.println(" ");

		// case5
		int a = 5;
		int b = 0;
		int operation = 4;
		System.out.println("Case5");
		System.out.println(a + " " + b);
		System.out.println(case5(a, b, operation));
		System.out.println(" ");
	}

}
