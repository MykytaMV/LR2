package Books;


public class Book {
	private int ID;
	private String Name;
	private String Author;
	private String PublishingHouse;
	private int Year;
	private int Pages;
	private double Price;
	
	public Book(int iD, String name, String author, String publishingHouse, int year, int pages, double price) {
		setID(iD);
		Name = name;
		Author = author;
		PublishingHouse = publishingHouse;
		setYear(year);
		setPages(pages);
		setPrice(price);
	}

	public Book() {
		ID = 0;
		Name = "none";
		Author = "none";
		PublishingHouse = "none";
		Year = 0;
		Pages = 0;
		Price = 0;

	}

	public Book setAll(int iD, String name, String author, String publishingHouse, int year, int pages, double price) {
		setID(iD);
		Name = name;
		Author = author;
		PublishingHouse = publishingHouse;
		setYear(year);
		setPages(pages);
		setPrice(price);
		return this;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		if(iD < 0)
			ID = -iD;
		else
			ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getPublishingHouse() {
		return PublishingHouse;
	}
	public void setPublishingHouse(String publishingHouse) {
		PublishingHouse = publishingHouse;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		if(year < 0)
			Year = -year;
		else
			Year = year;
	}
	public int getPages() {
		return Pages;
	}
	public void setPages(int pages) {
		if(pages < 0)
			Pages = -pages;
		else
			Pages = pages;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		if(price < 0)
			Price = price;
		else
			Price = price;
	}
	
	
	@Override
	public String toString() {
		return "ID: " + Integer.toString(ID) + ", Назва: " + Name + ", Автор: " + Author + ", Видавництво: " + PublishingHouse + ", Рік видання: " + Integer.toString(Year) + ", Кількість сторінок: " + Integer.toString(Pages) + ", Ціна: " + Double.toString(Price);
	}

}
