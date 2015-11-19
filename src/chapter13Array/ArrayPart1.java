package chapter13Array;

public class ArrayPart1 {

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
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
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
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

	// Array3. Дано целое число N (> 1), а также первый член A и разность D
	// арифметической прогрессии. Сформировать и вывести массив размера N,
	// содержащий N первых членов данной прогрессии:
	// A , A + D, A + 2·D, A + 3·D, … .
	static void task3(int n, int a, int d) {
		int[] array = new int[n];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {

			sum = sum + (a + i * d);
			array[i] = sum;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

	public static void main(String[] args) {
		int n = 10;
		// task1
		System.out.println("task1");
		task1(n);
		System.out.println(" ");

		// task2
		System.out.println(" ");
		System.out.println("task2");
		task2(n);
		System.out.println(" ");

		// task3
		int a = 3;
		int d = 4;
		System.out.println(" ");
		System.out.println("task3");
		task3(n, a, d);
		System.out.println(" ");
	}

}
