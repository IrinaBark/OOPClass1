package by.epam.book.main;

import java.util.Scanner;

import by.epam.book.agregate.Catalog;
import by.epam.book.entity.Book;

public class Main {

	public static void main(String[] args) {

		int numb;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество книг для каталога >");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Неверное значение! Введите количество книг (число) >");
		}
		numb = sc.nextInt();

		Book[] ar = new Book[numb];

		init(ar);

		Catalog catal = new Catalog(ar);

		Catalog catal1 = new Catalog(catal.getBooksByAuthor("Пушкин"));
		catal1.print();
		
		System.out.println();

		Catalog catal2 = new Catalog(catal.getByYear(1950));
		catal2.print();
		
		System.out.println();
		
		Catalog catal3 = new Catalog(catal.getBooksByPubHouse("Эксмо"));
		catal3.print();

	}

	public static void init(Book[] ar) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < ar.length; i++) {
			
			ar[i] = new Book();
			
			System.out.println("Введите идентификационный номер книги " + (i + 1) + " >");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Неверный ввод! Введите идентификационный номер книги (число) >");
			}
			ar[i].setId(sc.nextInt());
			sc.nextLine();

			System.out.println("Введите заголовок книги " + (i + 1) + " >");
			ar[i].setTitle(sc.nextLine());

			System.out.println("Введите автора книги " + (i + 1) + " >");
			ar[i].setAuthor(sc.nextLine());

			System.out.println("Введите издательство " + (i + 1) + " >");
			ar[i].setPublicOffice(sc.nextLine());

			System.out.println("Введите год издания книги " + (i + 1) + " >");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Неверный ввод! Введите год издания книги (число) >");
			}
			ar[i].setYear(sc.nextInt());

			System.out.println("Введите количество страниц в книге " + (i + 1) + " >");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Неверный ввод! Введите количество страниц в книге (число) >");
			}
			ar[i].setPages(sc.nextInt());

			System.out.println("Введите цену " + (i + 1) + " >");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Неверный ввод! Введите цену книги (число) >");
			}
			ar[i].setPrice(sc.nextInt());
			sc.nextLine();

			System.out.println("Введите тип обложки " + (i + 1) + " >");
			ar[i].setCover(sc.nextLine());
		}
	}
}
