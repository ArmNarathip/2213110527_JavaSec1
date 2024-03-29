import java.time.Year;

public class Book {

	private String title;
	private float price;
	private int publishyear;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
	public void setPublishyear(int year) {
		publishyear = year;
	}
	public int getPublishyear() {
		return this.publishyear;
	}
	public int getTotalYear() {
		return (Year.now().getValue())-publishyear;
	}
	public String ToString() {
		return String.format("Title:"+title+" published for "+getTotalYear()+" year ("+price+" baht).");
	}
}
