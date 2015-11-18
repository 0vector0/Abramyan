package chapter8;

public class ForPartOne {

	// For1. ���� ����� ����� K � N (N > 0). ������� N ��� ����� K.
	static void task1(int n, int k) {

		if (n > 0) {
			for (int i = 0; i < n; i++) {
				System.out.print(k + " ");
			}
		} else {
			System.out.println(n + " <= 0");
		}
	}

	// For2. ���� ��� ����� ����� A � B (A < B). ������� � ������� �����������
	// ��� ����� �����, ������������� ����� A � B (������� ���� ����� A � B),
	// � ����� ���������� N ���� �����.
	static void task2(int a, int b) {

		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
	}

	// For3. ���� ��� ����� ����� A � B (A < B). ������� � ������� �������� ���
	// ����� �����, ������������� ����� A � B (�� ������� ����� A � B), � �����
	// ���������� N ���� �����.
	static void task3(int a, int b) {
		int count = 0;
		for (int i = b - 1; i > a; i--) {
			System.out.print(i + " ");
			count = count + 1;
		}
		System.out.println(" ");
		System.out.println("count - " + count);
	}

	// For4. ���� ������������ ����� � ���� 1 �� ������. ������� ��������� 1,
	// 2, �, 10 �� ������.
	static void task4(float price) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ��. ������ ����� = ");
			System.out.format("%.2f%n", i * price);
		}
	}

	// For5�. ���� ������������ ����� � ���� 1 �� ������. ������� ��������� 0.1,
	// 0.2, �, 1 �� ������.
	static void task5(float price) {

		for (int i = 1; i <= 10; i++) {
			System.out.format("%.1f", (i * 0.1f));
			System.out.print(" ��. ������ ����� = ");
			System.out.format("%.2f%n", (i * price * 0.1f));
		}
	}

	// For6. ���� ������������ ����� � ���� 1 �� ������. ������� ��������� 1.2,
	// 1.4, �, 2 �� ������.
	static void task6(float price) {

		for (int i = 2; i <= 10; i = i + 2) {
			System.out.format("%.1f", ((i * 0.1f) + 1));
			System.out.print(" ��. ������ ����� = ");
			System.out.format("%.2f%n", (((i * 0.1f) + 1) * price));
		}
	}

	// For7. ���� ��� ����� ����� A � B (A < B). ����� ����� ���� ����� ����� ��
	// A �� B ������������.

	static int task7(int a, int b) {
		int sum = 0;

		for (int i = a; i <= b; i++) {
			sum = sum + i;
		}
		return sum;
	}

	// For8. ���� ��� ����� ����� A � B (A < B). ����� ������������ ���� �����
	// ����� �� A �� B ������������.
	static int task8(int a, int b) {
		int multiplication = 1;

		for (int i = a; i <= b; i++) {
			multiplication = multiplication * i;
		}
		return multiplication;
	}

	// For9. ���� ��� ����� ����� A � B (A < B). ����� ����� ��������� ����
	// ����� ����� �� A �� B ������������.
	static int task9(int a, int b) {
		int sum = 0;

		for (int i = a; i <= b; i++) {
			sum = sum + (i * i);
		}
		return sum;
	}

	// For10. ���� ����� ����� N (> 0). ����� ����� 1 + 1/2 + 1/3 + � + 1/N
	// (������������ �����).
	static double task10(int n) {
		double sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + (1 / (double) i);
		}
		return sum;
	}

	// For11. ���� ����� ����� N (> 0). ����� �����
	// 2^N+(N+1)^2+(N+2)^2+�+(2�N)^2 (����� �����).
	static int task11(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + (n + 1) * (n + 1);
		}
		return sum;
	}

	// For12�. ���� ����� ����� N (> 0). ����� ������������
	// 1.1 � 1.2 � 1.3 � � (N ������������)
	static double task12(int n) {
		double multi = 1;
		for (int i = 1; i <= n; i++) {
			multi = multi * (1 + (0.1 * i));
		}
		return multi;
	}

	// For13�. ���� ����� ����� N (> 0). ����� �������� ���������
	// 1.1 � 1.2 + 1.3 � � (N ���������, ����� ����������).
	// �������� �������� �� ������������.
	static double task13(int n) {
		double sum = 0;

		for (int i = 1; i <= n; i = i + 2) {
			sum = sum + (1 + (0.1 * i));
		}
		for (int i = 2; i <= n; i = i + 2) {
			sum = sum - (1 + (0.1 * i));
		}
		return sum;
	}

	// For14. ���� ����� ����� N (> 0). ����� ������� ������� �����, ���������
	// ��� ��� ���������� ��������� �������: 2N = 1 + 3 + 5 + � + (2�N � 1).
	// ����� ���������� � ����� ������� ���������� �������� ������� ��������
	// ����� (� ���������� ����� �������� �������� ���� ����� ����� �� 1
	// �� N).
	static void task14(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (2 * i - 1);
			System.out.print(i + "^2 = ");
			System.out.println(sum);
		}
	}

	// For15�. ���� ������������ ����� A � ����� ����� N (> 0). ����� A �
	// ������� N: AN = A�A� � �A (����� A ������������� N ���).

	static int task14(int a, int n) {
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * a;
		}
		return pow;
	}

	// For16�. ���� ������������ ����� A � ����� ����� N (> 0). ��������� ����
	// ����, ������� ��� ����� ������� ����� A �� 1 �� N.
	static void task16(int a, int n) {
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * a;
			System.out.println(a + "^" + i + " = " + pow);

		}
	}

	// For17. ���� ������������ ����� A � ����� ����� N (> 0). ��������� ����
	// ����, ����� ����� 1 + A + A^2 + A^3 + � + A^N.
	static int task17(int a, int n) {
		int sum = 1;
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * a;
			sum = sum + pow;

		}
		return sum;
	}

	// For18. ���� ������������ ����� A � ����� ����� N (> 0). ��������� ����
	// ����, ����� �������� ��������� 1 � A + A2 � A3 + � + (�1)N�AN.
	// �������� �������� �� ������������.
	static int task18(int a, int n) {
		int sum = 0;
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * a;
			pow = -1 * pow;
			sum = sum + pow;
		}
		return sum + 1;
	}

	// For19�. ���� ����� ����� N (> 0). ����� ������������
	// N! = 1�2���N (N����������). ����� �������� �������������� ������������,
	// ��������� ��� ������������ � ������� ������������ ���������� � �������
	// ��� ��� ������������ �����.
	static double task19(int n) {
		double factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	// For20�. ���� ����� ����� N (> 0). ��������� ���� ����, ����� �����
	// 1! + 2! + 3! + � + N! (��������� N! � N���������� � ����������
	// ������������ ���� ����� ����� �� 1 �� N: N! = 1�2���N). ����� ��������
	// �������������� ������������, ��������� ���������� � ������� ������������
	// ���������� � ������� ��������� ��� ������������ �����.
	static double task20(int n) {
		double factorial = 1;
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
			sum = sum + factorial;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int k = (int) (Math.random() * 10 - 5);
		// int n = (int) (Math.random() * 10);
		int k = 11;
		int n = 3;

		// task1
		System.out.println("Task1");
		System.out.println(n + " " + k);
		task1(n, k);
		System.out.println(" ");

		// task2
		int a = 2;
		int b = 4;
		System.out.println(" ");
		System.out.println("Task2");
		System.out.println(a + " " + b);
		task2(a, b);
		System.out.println(" ");

		// task3
		System.out.println(" ");
		System.out.println("Task3");
		System.out.println(a + " " + b);
		task3(a, b);
		System.out.println(" ");

		// task4
		float price = 12.35f;
		System.out.println(" ");
		System.out.println("Task4");
		task4(price);
		System.out.println(" ");

		// task5
		System.out.println(" ");
		System.out.println("Task5");
		task5(price);
		System.out.println(" ");

		// task6
		System.out.println(" ");
		System.out.println("Task6");
		task6(price);
		System.out.println(" ");

		// task7
		System.out.println(" ");
		System.out.println("Task7");
		System.out.println(a + " " + b);
		System.out.println(task7(a, b));
		System.out.println(" ");

		// task8
		System.out.println(" ");
		System.out.println("Task8");
		System.out.println(a + " " + b);
		System.out.println(task8(a, b));
		System.out.println(" ");

		// task9
		System.out.println(" ");
		System.out.println("Task9");
		System.out.println(a + " " + b);
		System.out.println(task9(a, b));
		System.out.println(" ");

		// task10
		System.out.println(" ");
		System.out.println("Task10");
		System.out.println(n);
		System.out.format("%.2f%n", task10(n));
		System.out.println(" ");

		// task11
		System.out.println(" ");
		System.out.println("Task11");
		System.out.println(n);
		System.out.println(task11(n));
		System.out.println(" ");

		// task12
		System.out.println(" ");
		System.out.println("Task12");
		System.out.println(n);
		System.out.format("%.2f%n", task12(n));
		System.out.println(" ");

		// task13
		n = 5;
		System.out.println(" ");
		System.out.println("Task13");
		System.out.println(n);
		System.out.format("%.2f%n", task13(n));
		System.out.println(" ");

		// task14
		System.out.println(" ");
		System.out.println("Task14");
		System.out.println(n);
		task14(n);
		System.out.println(" ");

		// task15
		a = 3;
		n = 4;
		System.out.println(" ");
		System.out.println("Task15");
		System.out.println(a + " " + n);
		System.out.println(task14(a, n));
		System.out.println(" ");

		// task16
		System.out.println(" ");
		System.out.println("Task16");
		System.out.println(a + " " + n);
		task16(a, n);
		System.out.println(" ");

		// task17
		System.out.println(" ");
		System.out.println("Task17");
		System.out.println(a + " " + n);
		System.out.println(task17(a, n));
		System.out.println(" ");

		// task18
		System.out.println(" ");
		System.out.println("Task18");
		System.out.println(a + " " + n);
		System.out.println(task18(a, n));
		System.out.println(" ");

		// task19
		n = 4;
		System.out.println(" ");
		System.out.println("Task19");
		System.out.println(n);
		System.out.println(task19(n));
		System.out.println(" ");

		// task20
		System.out.println(" ");
		System.out.println("Task20");
		System.out.println(n);
		System.out.println(task20(n));
		System.out.println(" ");
	}

}
