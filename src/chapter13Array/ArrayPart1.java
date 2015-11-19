package chapter13Array;

//Array1 - Array10

public class ArrayPart1 {

	// Создание и заполение массива псевдослучайными числами.
	static int[] randomArray(int n) {
		int[] randomArray = new int[n];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (Math.random() * 100);
		}
		return randomArray;
	}

	// вывод массива
	static void printArray(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + ", ");
		}
		System.out.println();
	}

	// Array1. Дано целое число N (> 0). Сформировать и вывести целочисленный
	// массив размера N, содержащий N первых положительных нечетных чисел:
	// 1, 3, 5, … .
	static void task1(int n) {
		int[] array = new int[n];
		int a = 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = a;
			a = a + 2;
		}
		printArray(array);
	}

	// Array2. Дано целое число N (> 0). Сформировать и вывести целочисленный
	// массив размера N, содержащий степени двойки от первой до N-й: 2, 4, 8,
	// 16, … .
	static void task2(int n) {
		int[] array = new int[n];
		int pow = 2;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j <= i; j++) {
				pow = pow * 2;
			}
			array[i] = pow;
			pow = 2;
		}
		printArray(array);
	}

	// Array3. Дано целое число N (> 1), а также первый член A и разность D
	// арифметической прогрессии. Сформировать и вывести массив размера N,
	// содержащий N первых членов данной прогрессии:
	// A , A + D, A + 2·D, A + 3·D, … .
	static void task3(int n, int a, int d) {
		int[] array = new int[n];
		array[0] = a;
		for (int i = 1; i < array.length; i++) {
			array[i] = a + d * i;
		}
		printArray(array);
	}

	// Array4. Дано целое число N (> 1), а также первый член A и знаменатель Q
	// геометрической прогрессии. Сформировать и вывести массив размера N,
	// содержащий N первых членов данной прогрессии:
	// A, A·D, A·D2, A·D3, … .
	static void task4(int n, int a, int q) {
		int[] array = new int[n];
		array[0] = a;
		for (int i = 1; i < array.length; i++) {
			array[i] = a * (int) (Math.pow(q, i));
		}
		printArray(array);
	}

	// Array5. Дано целое число N (> 2). Сформировать и вывести целочисленный
	// массив размера N, содержащий N первых элементов последовательности
	// чисел Фибоначчи FK:F1=1,F2=1,FK=FK–2+FK–1,K=3,4,….
	static void task5(int n) {
		int[] ar = new int[n];
		ar[0] = ar[1] = 1;
		for (int i = 2; i < ar.length; i++) {
			ar[i] = ar[i - 1] + ar[i - 2];
		}
		printArray(ar);
	}

	// Array6. Даны целые числа N (> 2), A и B. Сформировать и вывести
	// целочисленный массив размера N, первый элемент которого равен A, второй
	// равен B, а каждый последующий элемент равен сумме всех предыдущих.
	static void task6(int n, int a, int b) {
		int[] ar = new int[n];
		ar[0] = a;
		ar[1] = b;
		int sum = a + b;
		for (int i = 2; i < ar.length; i++) {
			ar[i] = sum;
			sum = sum + ar[i];
		}
		printArray(ar);
	}

	// Array7º. Дан массив размера N. Вывести его элементы в обратном порядке.
	static void task7(int n) {

		int[] ar = randomArray(n);
		// заполняем массив
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 100);
		}
		printArray(ar);

		// меняем местами
		int t;
		for (int i = 0; i < ar.length / 2; i++) {
			t = ar[i];
			ar[i] = ar[ar.length - 1 - i];
			ar[ar.length - 1 - i] = t;
		}
		printArray(ar);
		System.out.println();
	}

	// Array8. Дан целочисленный массив размера N. Вывести все содержащиеся в
	// данном массиве нечетные числа в порядке возрастания их индексов, а также
	// их количество K.
	static int task8(int n) {
		int[] ar = randomArray(n);
		int count = 0;
		printArray(ar);
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 != 0) {
				System.out.print(i + ", ");
				count++;
			}
		}
		System.out.println();
		return count;
	}

	// Array9. Дан целочисленный массив размера N. Вывести все содержащиеся в
	// данном массиве четные числа в порядке убывания их индексов, а также их
	// количество K.
	static int task9(int n) {
		int[] ar = randomArray(n);
		int count = 0;
		printArray(ar);
		for (int i = ar.length - 1; i >= 0; i--) {
			if (ar[i] % 2 != 0) {
				System.out.print(i + ", ");
				count++;
			}
		}
		System.out.println();
		return count;
	}

	// Array10. Дан целочисленный массив размера N. Вывести вначале все
	// содержащиеся в данном массиве четные числа в порядке возрастания их
	// индексов, а затем — все нечетные числа в порядке убывания их индексов.
	static void task10(int n) {
		int[] ar = randomArray(n);
		printArray(ar);
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				System.out.print(ar[i] + ", ");
			}
		}
		System.out.println();
		for (int i = ar.length - 1; i >= 0; i--) {
			if (ar[i] % 2 != 0) {
				System.out.print(ar[i] + ", ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int n = 10;
		// task1
		System.out.println("task1");
		task1(n);

		// task2
		System.out.println(" ");
		System.out.println("task2");
		task2(n);

		// task3
		int a = 3;
		int d = 4;
		System.out.println(" ");
		System.out.println("task3");
		task3(n, a, d);

		// task4
		int q = 5;
		System.out.println(" ");
		System.out.println("task4");
		task4(n, a, q);

		// task5
		// int q = 5;
		System.out.println(" ");
		System.out.println("task5");
		task5(n);

		// task6
		a = 3;
		int b = 4;
		System.out.println(" ");
		System.out.println("task6");
		task6(n, a, b);

		// task7
		System.out.println();
		System.out.println("task7");
		task7(n);

		// task8
		System.out.println("task8");
		System.out.println(task8(n));
		System.out.println();

		// task9
		System.out.println("task9");
		System.out.println(task9(n));
		System.out.println();

		// task10
		System.out.println("task10");
		task10(n);
		System.out.println();

	}

}
