package by.home.maxzzzid;

import java.util.Scanner;

// �������� �����, ������� ��������� � ���������� 25 ����� ����� � ���������� ���������� � ���������� � ���� ����� �����!
// ���������� ���������� ����� � �������� �� �������.
public class PoiskMinMaxIzSerii {
	public static void main (String[]args) {
		int chislo, max, min, max_pos=1, min_pos=1;
		Scanner scn = new Scanner(System.in);
			System.out.println("������� ������ ����� �����: ");
			chislo=scn.nextInt();
			max=chislo;
			min=chislo;
			for (int i=1; i<=25; i++) {
			System.out.println("������� ����� �����: ");
			chislo=scn.nextInt();
			max=Math.max(max, chislo);
			if (chislo==max) max_pos=i;
			min=Math.min(min, chislo);
			if (chislo==min) min_pos=i;
			System.out.println("������������ ����� �� ��������� = "+max+" ����� ��������� �� "+max_pos+" �������");
			System.out.println("����������� ����� �� ��������� = "+min+" ����� ��������� �� "+min_pos+" �������");	
		}

	}
}
