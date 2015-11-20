package chapter13Array;

public class ArrayPart2 {

	// Создание и заполение массива псевдослучайными числами > 0.
	public static int[] randomArray(int n) {
		int[] randomArray = new int[n];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (Math.random() * 100 + 1);
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

	// Array18. Дан массив A ненулевых целых чисел размера 10. Вывести значение
	// первого из тех его элементов AK, которые удовлетворяют неравенству
	// AK < A10. Если таких элементов нет, то вывести 0.
	static void task18(int n) {
		int[] a = randomArray(n);
		printArray(a);
		boolean b = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[9]) {
				System.out.print(a[i] + ", ");
				b = true;
			}
		}
		if (b == false) {
			System.out.println(0);
		}
	}

	// Array19. Дан целочисленный массив A размера 10. Вывести порядковый номер
	// последнего из тех его элементов AK, которые удовлетворяют двойному
	// неравенству A1 < AK < A10. Если таких элементов нет, то вывести 0.
	static void task19(int n) {
		int[] a = randomArray(n);
		printArray(a);
		boolean b = false;
		int number = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[0] < a[i] && a[i] < a[9]) {
				// System.out.print(a[i] + ", ");
				b = true;
				number = i;
				
			}
		}
		if (b == false) {
			System.out.println(0);
		} else {
			// первый элемент 1, последний 10
			System.out.println(number + 1); 
			//System.out.println(a[number]);
		}
	}

	public static void main(String[] args) {
		int n = 10;
		// task18
		System.out.println("task18");
		task18(n);
		System.out.println();

		// task19
		System.out.println();
		System.out.println("task19");
		task19(n);
	}

}
