package QualityKioskTraining.UnitTestingAssignmnt;

public class ArbaazConcatString 
{
	public String Concatenate(String str1,String str2)   //concatenate function for two strings
	{
		String Res = str1+" "+str2; 
		if(Res.matches(".*\\d+.*")) {                             // checks the strings only contains numbers
			return "Please do not enter number in Strings, Try Again";
		}
		return Res;
	}
	
}