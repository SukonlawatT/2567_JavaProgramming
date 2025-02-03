
public class Student 
{

	private String studentName;
	private int studentScore;
	
	public void setName(String stdName) 
	{
		studentName = stdName;
	}
	public String getName() 
	{
		return studentName;
	}
	public void setScore(int stdScore) 
	{
		studentScore = stdScore;
	}
	public int getScore() 
	{
		return studentScore;
	}
	public boolean cheakScore() 
	{
		if (getScore() >= 00 && getScore() <= 100)
		{
			return true;
		}
		else
		{
			return false;
		}
		/*if (getScore() >= 00 && getScore() <= 100)
		{
			return true;
			return false;
		}*/
		/*return getScore() >= 00 && getScore() <= 100;*/
	}
	public boolean isPass() 
	{
		return getScore() >= 50;
		/*if(getScore()  >= 50)
		{
			return true;
		}
		else
		{
			return false;
		}*/
	}
	
}
