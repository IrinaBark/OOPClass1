package by.epam.book.agregate;

import by.epam.book.entity.Book;

public class Catalog {

	private Book[] catalog;
	private int number;

	public Catalog(int number) {
		catalog = new Book[number];
	}

	public Catalog() {
		this(5);
	}

	public Catalog(Book[] array) {
		catalog = array;
	}

	public Book[] getBooksByAuthor(String author) {

		Book[] array;
		int count = 0;

		author = author.toLowerCase();

		for (int i = 0; i < catalog.length; i++) {

			String s1 = catalog[i].getAuthor().toLowerCase();

			if (s1.contains(author)) {
				count++;
			}
		}
		array = new Book[count];
		count = 0;

		for (int i = 0; i < catalog.length; i++) {

			String s1 = catalog[i].getAuthor().toLowerCase();

			if (s1.contains(author)) {
				array[count] = catalog[i];
				count++;
			}
		}
		return array;
	}

	public Book[] getByYear(int year) {

		Book[] array;
		int count = 0;

		for (int i = 0; i < catalog.length; i++) {

			int yearI = catalog[i].getYear();

			if (yearI > year) {
				count++;
			}
		}
		array = new Book[count];
		count = 0;

		for (int i = 0; i < catalog.length; i++) {

			int yearI = catalog[i].getYear();

			if (yearI > year) {
				array[count] = catalog[i];
				count++;
			}
		}
		return array;
	}

	public Book[] getBooksByPubHouse(String pubHouse) {
		Book[] array;
		int count = 0;

		pubHouse = pubHouse.toLowerCase();

		for (int i = 0; i < catalog.length; i++) {

			String s1 = catalog[i].getPublicOffice().toLowerCase();

			if (s1.contains(pubHouse)) {
				count++;
			}
		}
		array = new Book[count];
		count = 0;

		for (int i = 0; i < catalog.length; i++) {

			String s1 = catalog[i].getPublicOffice().toLowerCase();

			if (s1.contains(pubHouse)) {
				array[count] = catalog[i];
				count++;
			}
		}
		return array;
	}

	public void print() {
		for (int i = 0; i < catalog.length; i++) {
			System.out.println(catalog[i]);
		}
	}
}
