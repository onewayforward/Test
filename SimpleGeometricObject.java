
public class SimpleGeometricObject {
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;
	
	public SimpleGeometricObject()
	{
		this("white",false);
	}
	public SimpleGeometricObject(String color,boolean filled)
	{
		this.color = color;
		this.filled = filled;
		dateCreated = new java.util.Date();
	}
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public boolean isFilled(){
		return this.filled;
	}
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	public String toString(){
		return "created on " + dateCreated + "\ncolor: " + color + 
				" and filled " + filled;
	}
}
