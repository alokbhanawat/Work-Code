package Codes;


class Teacher{
	private String teacherName;
    private String subject;
    private double salary;
	     
    
        
    
         // Constructor
         public Teacher(String teacherName, String subject, double salary) {
        	 this.teacherName = teacherName;
             this.subject = subject;
             this.salary = salary;
        	 
        	 
         }
          
         public String getTeacherName() {
        	 return teacherName;
         }
         
         public String getSubject() {
             return subject;
         }

         public double getSalary() {
             return salary;
         }
         
         public void setTeacherName(String teacherName) {
        	 this.teacherName=teacherName;
         }
         
         public void setSubject(String subject) {
             this.subject = subject;
         }

         public void setSalary(double salary) {
             this.salary = salary;
         }
         
         public void displayDetails() {
             System.out.println("Teacher Name: " + teacherName);
             System.out.println("Subject: " + subject);
             System.out.println("Salary: " + salary);
             System.out.println("-----------------------------");
         }
     }

         
         


 class ArAss1 {

	public static void main(String[] args) {
		
		    Teacher t1 = new Teacher("Alex", "Java Fundamentals", 1200L);
	        Teacher t2 = new Teacher("John", "RDBMS", 800L);
	        Teacher t3 = new Teacher("Sam", "Networking", 900L);
	        Teacher t4 = new Teacher("Maria", "Python", 900L);
	        
	        Teacher[] teachers = { t1, t2, t3, t4 };
	        
	        for(Teacher t :teachers) {
	        	t.displayDetails();	     
	        	
	        }
	}

	}


