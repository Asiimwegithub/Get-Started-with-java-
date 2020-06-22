public class student{
String 	Name;
String DOB;
int current;


int currentYear;
public student(String Nme, String Date, int crrnt)
{
	Name=Nme;
	DOB=Date;
	current=crrnt;
	 
}
public int cage()
{
	//converting A string to integer
	int DOBYear= Integer.parseInt(DOB.substring(6));
	int Age = (current-DOBYear);
	return Age;//Returning age as an integer.
}
public void Display()
{
	System.out.println("Name: "+Name);
	System.out.println("DOB: "+DOB);
	System.out.println("current"+current);
}
public static void main(String[]args){
	student student1 = new student("Asimwe", "11/09/1997", 2019);//object of students
	student1.Display();
	System.out.println("Age: "+student1.cage());
}
}
