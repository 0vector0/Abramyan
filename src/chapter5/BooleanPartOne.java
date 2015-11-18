package chapter5;

public class BooleanPartOne {

	// Boolean1°. Дано целое число A. Проверить истинность высказывания: «Число
	// A является положительным».
	static void task1(int a) {
		System.out.println("Task1");
		if (a > 0) {
			System.out.println("Число А = " + a + " - положительное");
		}
		if (a < 0) {
			System.out.println("Число А = " + a + " - отрицательное");
		}
		if (a == 0) {
			System.out.println("Число А = " + a);
		}
	}

	// Boolean2. Дано целое число A. Проверить истинность высказывания: «Число A
	// является нечетным».
	static void task2(int a) {
		System.out.println("Task2");
		if (a % 2 == 0) {
			System.out.println("Число четное");
		} else {
			System.out.println("Число нечетное");
		}
	}

	// Boolean3. Дано целое число A. Проверить истинность высказывания: «Число A
	// является четным».
	static void task3(int a) {
		System.out.println("Task3");
		if (a % 2 != 0) {
			System.out.println("Число нечетное");
		} else {
			System.out.println("Число четное");
		}
	}

	// Boolean4. Даны два целых числа: A, B. Проверить истинность высказывания:
	// «Справедливы неравенства A > 2 и B ≤ 3».
	static boolean task4(int a, int b) {
		System.out.println("Task4");
		boolean bool = false;
		if (a > 2 && b <= 3) {
			bool = true;
		}
		return bool;
	}

	// Boolean5. Даны два целых числа: A, B. Проверить истинность высказывания:
	// «Справедливы неравенства A ≥ 0 или B < –2».
	static boolean task5(int a, int b) {
		System.out.println("Task5");
		boolean bool = false;
		if (a >= 0 && b < -2) {
			bool = true;
		}
		return bool;
	}

	// Boolean9. Даны два целых числа: A, B. Проверить истинность высказывания:
	// «Хотя бы одно из чисел A и B нечетное».
	static boolean task9(int a, int b) {
		System.out.println("Task9");
		boolean bool = false;
		if ((a % 2 != 0) || (b % 2 != 0)) {
			bool = true;
		}
		return bool;
	}

	// Boolean33. Даны целые числа a, b, c. Проверить истинность высказывания:
	// «Существует треугольник со сторонами a, b, c».
	// Треугольник существует только тогда, когда сумма любых двух его сторон
	// больше третьей.
	static void task33(int a, int b, int c) {
		System.out.println("Task33");
		System.out.println("Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.");
		System.out.println("A = " + a + " " + "B = " + b + " " + "C = " + c);
		if (a > 0 && b > 0 && c > 0) {
			if ((a + b > c) && (a + c > b) && (b + c > a)) {
				System.out.println("«Существует треугольник с такими сторонами");
			} else {
				System.out.println("«Не существует треугольника с такими сторонами");
			}
		} else {
			System.out.println("Сторона не может быть < 0");
		}
		// return bool;
	}

	// Boolean34. Даны координаты поля шахматной доски x, y (целые числа,
	// лежащие в диапазоне 1–8). Учитывая, что левое нижнее поле доски (1, 1)
	// является черным, проверить истинность высказывания: «Данное поле является
	// белым».
	// area = true - black
	// area = false - white
	static boolean blackOrWhite(int x, int y) {
		int t1 = 0;
		int t2 = 0;
		boolean area = false;
		if ((x > 8) || (y > 8)) {
			System.out.println("Одна из координат за пределами доски");
		} else {
			if (x > y) {
				t1 = x;
				t2 = y;
			} else {
				t1 = y;
				t2 = x;
			}

			if (t1 % t2 == 0) {
				//
				area = true;
			} else {
				//
				area = false;
			}

		}
		return area;
	}

	static void task34(int x, int y) {
		boolean area = blackOrWhite(x, y);
		if (area == true) {
			System.out.println("black");
		} else {
			System.out.println("white");
		}
	}

	static void task35(int x1, int y1, int x2, int y2) {
		boolean area1 = blackOrWhite(x1, y1);
		boolean area2 = blackOrWhite(x2, y2);
		if (area1 == area2) {
			System.out.println("Поля имеют одинаковый цвет");
		} else {
			System.out.println("Поля имеют разные цвета");
		}

	}

	static boolean task36(int x1, int y1, int x2, int y2) {
		boolean bool = false;
		if ((x1 > 8) || (y1 > 8) || (x2 > 8) || (y2 > 8)) {
			System.out.println("Одна из координат за пределами доски");
		} else {
			if ((x1 == x2) || (y1 == y2)) {
				bool = true;
				// System.out.println("Может");
			} else {
				// System.out.println("Не может");
				bool = false;
			}
		}
		return bool;
	}

	static boolean task37(int x1, int y1, int x2, int y2) {
		boolean bool = false;
		if ((x1 > 8) || (y1 > 8) || (x2 > 8) || (y2 > 8)) {
			System.out.println("Одна из координат за пределами доски");
		} else {
			if ((Math.abs(x2 - x1) <= 1) && (Math.abs(y2 - y1) <= 1)) {
				bool = true;
			}
			if ((x1 == x2) && (y1 == y2)) {
				bool = false;
			}

			// System.out.println(bool ? "может" : "не может");

		}
		return bool;
	}

	static boolean task38(int x1, int y1, int x2, int y2) {
		boolean bool = false;
		int xt = 0;
		int yt = 0;
		if ((x1 > 8) || (y1 > 8) || (x2 > 8) || (y2 > 8)) {
			System.out.println("Одна из координат за пределами доски");
		} else {
			xt = x1;
			yt = y1;
			while (xt <= 8 || yt <= 8) {
				xt++;
				yt++;
				if (xt == x2 && yt == y2) {
					bool = true;
				}
			}
			xt = x1;
			yt = y1;
			while (xt <= 8 || yt >= 1) {
				xt++;
				yt--;
				if (xt == x2 && yt == y2) {
					bool = true;
				}
			}
			xt = x1;
			yt = y1;
			while (xt >= 1 || yt <= 8) {
				xt--;
				yt++;
				if (xt == x2 && yt == y2) {
					bool = true;
				}
			}
			xt = x1;
			yt = y1;
			while (xt >= 1 || yt >= 1) {
				xt--;
				yt--;
				if (xt == x2 && yt == y2) {
					bool = true;
				}
			}
			// System.out.println(bool);
		}
		return bool;
	}

	static boolean task39(int x1, int y1, int x2, int y2) {

		boolean bool = false;

		if (task36(x1, y1, x2, y2) == true || task38(x1, y1, x2, y2)) {
			bool = true;
		}
		return bool;
	}

	static boolean task40(int x1, int y1, int x2, int y2) {
		boolean bool = false;
		int xt = 0;
		int yt = 0;
		if ((x1 > 8) || (y1 > 8) || (x2 > 8) || (y2 > 8)) {
			System.out.println("Одна из координат за пределами доски");
		} else {
			xt = x1;
			yt = y1;
			if ((xt + 2 == x2) && (yt + 1 == y2 || yt - 1 == y2)) {
				if (xt + 2 <= 8 && yt + 1 <= 8 && yt - 1 >= 1) {
					bool = true;
				}
			}
			xt = x1;
			yt = y1;
			if ((xt - 2 == x2) && (yt + 1 == y2 || yt - 1 == y2)) {
				if (xt - 2 >= 1 && yt + 1 <= 8 && yt - 1 >= 1) {
					bool = true;
				}
			}
			xt = x1;
			yt = y1;
			if ((yt + 2 == y2) && (xt + 1 == x2 || xt - 1 == x2)) {
				if (yt + 2 <= 8 && xt + 1 <= 8 && xt - 1 >= 1) {
					bool = true;
				}
			}
			xt = x1;
			yt = y1;
			if ((yt - 2 == y2) && (xt + 1 == x2 || xt - 1 == x2)) {
				if (yt - 2 >= 1 && xt + 1 <= 8 && xt - 1 >= 1) {
					bool = true;
				}
			}
		}
		return bool;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a = -1;
		//int b = 2;
		//int c = 3;
		// task1(a);
		// task2(a);
		// task3(a);

		// System.out.println(task4(a, b));
		// System.out.println(task5(a, b));
		// System.out.println("A = " + a + " " + "B = " + b);
		// System.out.print("«Хотя бы одно из чисел A и B нечетное». - it is " +
		// task9(a, b));

		// task33(a, b, c);

		int x1 = 7;
		int y1 = 2;
		int x2 = 6;
		int y2 = 4;
		// System.out.println("task 34");
		// task34(x1, y1);
		// task34(x2, y2);
		System.out.println("task 35");
		task35(x1, y1, x2, y2);
		// task36(x1, y1, x2, y2);
		// System.out.println(task38(x1, y1, x2, y2));

		// System.out.println(task36(x1, y1, x2, y2));
		// System.out.println(task38(x1, y1, x2, y2));
		// System.out.println(task39(x1, y1, x2, y2));
		System.out.println("task 40");
		System.out.println(task40(x1, y1, x2, y2));

	}

}
