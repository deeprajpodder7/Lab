package Rough;
/*In this example, you have a base class Teacher and a sub class ITTeacher. Since 
class ITTeacher extends the designation and college properties and work () method from 
base class, we need not to declare these properties and method in sub class.
Here we have college Name, designation and work () method which are common to all the 
teachers so we have declared them in the base class, this way the child classes like Math 
Teacher, Music Teacher and PhysicsTeacher do not need to write this code and can be used 
directly from base class.*/


class Teacher {
	   String designation = "Teacher";
	   String collegeName = "Regent";
	   void work(){
		System.out.println("Teaching");
	   }
	}

class ITTeacher extends Teacher{
	 

}
	
	
	class PhysicsTeacher extends Teacher{
		
	
		
	}
		
		 class MusicTeacher extends Teacher{
			 
		 }
		 
		  class MathTeacher extends Teacher{
			  
		  }
		  
public class Test2{
	public static void main(String args[]){
		ITTeacher obj = new ITTeacher();
		PhysicsTeacher obj2=new PhysicsTeacher();
		MusicTeacher obj3=new MusicTeacher();
		MathTeacher obj4=new MathTeacher();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		obj.work();
		
		System.out.println(obj2.collegeName);
		System.out.println(obj2.designation);
		obj2.work();
		
		System.out.println(obj3.collegeName);
		System.out.println(obj3.designation);
		obj3.work();
		
		System.out.println(obj4.collegeName);
		System.out.println(obj4.designation);
		obj4.work();
	}
}
			
			
			
		