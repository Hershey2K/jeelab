package Lab4;

abstract class Item
{
	int uid;
	String title;
	int copies;
	
	public Item() { }
	
	public void addItem(int uid,String title,int copies)
	{
		this.uid=uid;
		this.title=title;
		this.copies=copies;
	}
	
	@Override
	public String toString() {
		return "Item [uid=" + uid + ", title=" + title + ", copies=" + copies + "]";
	}

	public void setUid(int id)
	{
		this.uid=id;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setCopies(int copies)
	{
		this.copies=copies;
	}
	
	public int getUid()
	{
		return this.uid;
	}
	public String getTitle()
	{
		return this.title;
	}
	public int getCopies()
	{
		return this.copies;
	}
	
	public void printItem()
	{
		System.out.println("Item : "+this.uid+" - "+this.title+" * "+this.copies);
	}
	
}

abstract class WrittenItem extends Item
{
	String author;
	
	public WrittenItem() { }
	
	public WrittenItem(int uid,String title,int copies,String author)
	{
		super();
		this.author=author;
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public String getAuthor()
	{
		return this.author;
	}
}

class Book extends WrittenItem
{
	public Book() { }
}

class Journal extends WrittenItem
{
	int yearPublished;
	
	public Journal() { }
	
	
}

abstract class MediaItem extends Item
{
	int runtime;
	
	public MediaItem() { }
	
	public MediaItem(int uid,String title,int copies,int runtime)
	{
		super();
		this.runtime=runtime;
	}
	
	public void setRuntime(int runtime)
	{
		this.runtime=runtime;
	}
	public int getRuntime()
	{
		return this.runtime;
	}
	
}

class Video extends MediaItem
{
	String director;
	String genre;
	int yearReleased;
}

class CD extends MediaItem
{
	String artist;
	String genre;
}

public class Exercise3 
{
	public static void main(String args[])
	{
		
	}
}
