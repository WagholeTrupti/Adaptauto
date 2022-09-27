
public class ConstructorExample {
int rollno;
String name;
int age;
static String company="Capgemini";

	
	ConstructorExample(int r, String n)
	{
		rollno=r;
		name=n;
	}	
	
	ConstructorExample(int r, String n, int a)
	{
		rollno=r;
		name=n;
		age=a;
	}
	

		
	void display()
	{
		System.out.println("Student Details: "+rollno+" "+name+" "+" "+" "+company+" "+age);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ConstructorExample s1= new ConstructorExample(101,"Ram");
		ConstructorExample s2= new ConstructorExample(102, "Trupti",25);
		
		s1.display();
		s2.display();
		
	}

}
