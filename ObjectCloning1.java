package OOP;


class Department
{
	int deptId;
	String name;
	
	Department(int i,String n)
	{
		deptId=i;
		name=n;
	}
	
	Department(Department d)
	{
		this.deptId=d.deptId;
		this.name=d.name;
	}
	
	void display()
	{
		System.out.println("Dept id: "+ deptId);
		System.out.println("Dept name: "+ name);
	}
	
}

class Student
{
	int Id;
	String name;
	Department dept;
	
	Student(int i,String n,Department d)
	{
		Id=i;
		name=n;
		dept=d;
	}
	
	Student(Student s)
	{
		this.Id=s.Id;
		this.name=s.name;
		this.dept=s.dept;

	}
	
	void display()
	{
		System.out.println("Stu.Id is: "+Id);
		System.out.println("Stu.name is: "+name);
		dept.display();
	}
	
}
public class ObjectCloning1 
{
	public static void main(String[] args)
	{
		Department dept1=new Department(1,"Physics");
		Student s1=new Student(7205,"Sarath",dept1);
		
		
		Student s2=new Student(s1);
		
		
		dept1.name="Maths";
		
		s1.display();
		s2.display();
			
	}
}
