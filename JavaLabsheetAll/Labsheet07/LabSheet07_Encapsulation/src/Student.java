public class Student 
{
	private String studentName;
	private int studentScore ;
	
	public void setName(String stdName)
	{
		this.studentName = stdName;
	}
	public String getName()
	{
		return studentName;
	}
	public void setScore(int stdScore)
	{
		this.studentScore = stdScore;
	}
	public int getScore()
	{
		return studentScore;
	}
	public boolean checkScore()
	{
		return studentScore >= 0 && studentScore <= 100;
	}
	public boolean isPass()
	{
		return studentScore >= 50;
	}
	public String findGrade() 
	{
        if (studentScore >= 80) {
        	return "A";
        }
        if (studentScore >= 75) {
        	return "B+";
        }
        if (studentScore >= 70) {
        	return "B";
        }
        if (studentScore >= 65) {
        	return "C+";
        }
        if (studentScore >= 60) {
        	return "C";
        }
        if (studentScore >= 55) {
        	return "D+";
        }
        if (studentScore >= 50) {
        	return "D";
        }
        return "F";
	}
}
