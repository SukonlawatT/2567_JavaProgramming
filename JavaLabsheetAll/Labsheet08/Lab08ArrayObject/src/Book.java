
public class Book 
{
	private String title;
	private Author author;
	private int page;
	
	Book(String title, Author author, int page)
	{
		this.title = title;
		this.author = author;
		this.page = page;
	}
	Book(String title, Author author)
	{
		this(title, author, 0);
	}
	Book()
	{
		this(null,null);
	}
	public String getTitle()
	{
		return this.title;
	}
	public Author getauthor()
	{
		return this.author;
	}
	public void setPage(int page)
	{
		this.page = page;
	}
	public int getPage()
	{
		return this.page;
	}
	public String toString()
	{
		return getTitle()+" has "+getPage()+" pages write by "+author;
	}

}
