package by.epam.book.main;

import java.util.Scanner;

import by.epam.book.agregate.Catalog;
import by.epam.book.entity.Book;

public class Main {

	public static void main(String[] args) {

		int numb;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ���������� ���� ��� �������� >");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("�������� ��������! ������� ���������� ���� (�����) >");
		}
		numb = sc.nextInt();

		Book[] ar = new Book[numb];

		init(ar);

		Catalog catal = new Catalog(ar);

		Catalog catal1 = new Catalog(catal.getBooksByAuthor("������"));
		catal1.print();
		
		System.out.println();

		Catalog catal2 = new Catalog(catal.getByYear(1950));
		catal2.print();
		
		System.out.println();
		
		Catalog catal3 = new Catalog(catal.getBooksByPubHouse("�����"));
		catal3.print();

	}

	public static void init(Book[] ar) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < ar.length; i++) {
			
			ar[i] = new Book();
			
			System.out.println("������� ����������������� ����� ����� " + (i + 1) + " >");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("�������� ����! ������� ����������������� ����� ����� (�����) >");
			}
			ar[i].setId(sc.nextInt());
			sc.nextLine();

			System.out.println("������� ��������� ����� " + (i + 1) + " >");
			ar[i].setTitle(sc.nextLine());

			System.out.println("������� ������ ����� " + (i + 1) + " >");
			ar[i].setAuthor(sc.nextLine());

			System.out.println("������� ������������ " + (i + 1) + " >");
			ar[i].setPublicOffice(sc.nextLine());

			System.out.println("������� ��� ������� ����� " + (i + 1) + " >");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("�������� ����! ������� ��� ������� ����� (�����) >");
			}
			ar[i].setYear(sc.nextInt());

			System.out.println("������� ���������� ������� � ����� " + (i + 1) + " >");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("�������� ����! ������� ���������� ������� � ����� (�����) >");
			}
			ar[i].setPages(sc.nextInt());

			System.out.println("������� ���� " + (i + 1) + " >");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("�������� ����! ������� ���� ����� (�����) >");
			}
			ar[i].setPrice(sc.nextInt());
			sc.nextLine();

			System.out.println("������� ��� ������� " + (i + 1) + " >");
			ar[i].setCover(sc.nextLine());
		}
	}
}
