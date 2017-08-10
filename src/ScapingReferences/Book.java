package ScapingReferences;


public class Book implements BookReadOnly {
	private int id;
	private String title;
	private String author;
	private Price price;
	
	/* (non-Javadoc)
	 * @see ScapingReferences.BookReadOnly#getId()
	 */
	@Override
	public int getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see ScapingReferences.BookReadOnly#getTitle()
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/* (non-Javadoc)
	 * @see ScapingReferences.BookReadOnly#getAuthor()
	 */
	@Override
	public String getAuthor() {
		return author;
	}

	public Book(int id, String title, String author, Double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = new Price(price);
	}
	
	/* (non-Javadoc)
	 * @see ScapingReferences.BookReadOnly#toString()
	 */
	@Override
	public String toString() {
		return title + " by " + author;
	}
	
	//TODO: Check if price is immutable
	/* (non-Javadoc)
	 * @see ScapingReferences.BookReadOnly#getPrice()
	 */
	@Override
	public Price getPrice() {
		return this.price;
	}
	
	public void setPrice(Double price) {
		this.price = new Price(price);
	}
	
}
