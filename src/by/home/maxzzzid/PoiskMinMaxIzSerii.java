package by.home.maxzzzid;

import java.util.Scanner;

// Написать класс, который принимает с клавиатуры 25 целых чисел и определяет наибольшее и наименьшее в этой серии чисел!
// записывать одинаковые числа в запросах не следует.
public class PoiskMinMaxIzSerii {
	public static void main (String[]args) {
		int chislo, max, min, max_pos=1, min_pos=1;
		Scanner scn = new Scanner(System.in);
			System.out.println("Введите первое целое число: ");
			chislo=scn.nextInt();
			max=chislo;
			min=chislo;
			for (int i=1; i<=25; i++) {
			System.out.println("Введите целое число: ");
			chislo=scn.nextInt();
			max=Math.max(max, chislo);
			if (chislo==max) max_pos=i;
			min=Math.min(min, chislo);
			if (chislo==min) min_pos=i;
			System.out.println("Максимальное число из введенных = "+max+" число находится на "+max_pos+" позиции");
			System.out.println("Минимальное число из введенных = "+min+" число находится на "+min_pos+" позиции");	
		}

	}
}
