package by.home.maxzzzid;

import java.util.Scanner;

// Ќаписать класс, который принимает с клавиатуры 25 целых чисел и определ€ет наибольшее и наименьшее в этой серии чисел!
// записывать одинаковые числа в запросах не следует.
public class PoiskMinMaxIzSerii {
	public static void main (String[]args) {
		int chislo, max, min, max_pos=1, min_pos=1;
		Scanner scn = new Scanner(System.in);
			System.out.println("¬ведите первое целое число: ");
			chislo=scn.nextInt();
			max=chislo;
			min=chislo;
			for (int i=1; i<=25; i++) {
			System.out.println("¬ведите целое число: ");
			chislo=scn.nextInt();
			max=Math.max(max, chislo);
			if (chislo==max) max_pos=i;
			min=Math.min(min, chislo);
			if (chislo==min) min_pos=i;
			System.out.println("ћаксимальное число из введенных = "+max+" число находитс€ на "+max_pos+" позиции");
			System.out.println("ћинимальное число из введенных = "+min+" число находитс€ на "+min_pos+" позиции");	
		}

	}
}
