package by.epam.book.entity;

//2. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, 
//set- и get- методы и метод  toString(). Создать второй класс, агрегирующий массив или коллекцию типа Book, 
//с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль. 
//
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. 
//Найти и вывести: 
//a) список книг заданного автора; 
//b) список книг, выпущенных заданным издательством; 
//c) список книг, выпущенных после заданного года.
public class Book {

	private int id;
	private String title;
	private String author;
	private String publicOffice;
	private int year;
	private int pages;
	private int price;
	private String cover;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id < 0) {
			throw new RuntimeException("Invalid id!");
		}
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublicOffice() {
		return publicOffice;
	}

	public void setPublicOffice(String publicOffice) {
		this.publicOffice = publicOffice;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 9999 && year < 1000) {
			throw new RuntimeException("Invalid year");
		}
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		if (pages < 5 && pages > 100_000) {
			throw new RuntimeException("Invalid pages number!");
		}
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			throw new RuntimeException("Invalid price!");
		}
		this.price = price;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public Book() {
		this(0, "", "");
	}

	public Book(int id, String title, String author, String publicOffice, int year, int pages, int price,
			String cover) {
		this(id, title, author);
		this.publicOffice = publicOffice;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.cover = cover;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publicOffice=" + publicOffice
				+ ", year=" + year + ", pages=" + pages + ", price=" + price + ", cover=" + cover + "]";
	}

}
