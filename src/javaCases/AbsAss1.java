package javaCases;
abstract  class Student{
	 
    protected String studentName;
 
    protected int[] testScores;
 
    protected String testResult;

    public Student(String studentName){
 
        this.studentName=studentName;
 
        this.testScores=new int[4];
 
        this.testResult=null;
 
    }
 
    public void setTestScore(int testNumber,int testScore){
 
        if(testNumber>=1 && testNumber<=4){
 
            this.testScores[testNumber-1]=testScore;
 
        }
 
    }
 
    public String getStudentName(){
 
      return studentName;
 
    }
 
    public void setStudentName(String studentName){
 
        this.studentName=studentName;
 
    }
 
    public void setTestResult(String testResult){
 
        this.testResult=testResult;
 
    }
 
    public int[] getTestScores(){
 
        return testScores;
 
    }
 
    public String getTestResult(){
 
        return testResult;
 
    }
 
    public abstract void generateResult();

}

class UndergraduateStudent extends Student{
 
   public UndergraduateStudent(String studentName){
 
     super(studentName);
 
   }
 
   @Override
 
   public void generateResult(){
 
      int sum=0;
 
      for (int score : testScores) {
 
        sum+=score;
 
      }   
 
      double average = sum / 4.0;

      if(average>=60){
 
        this.setTestResult("Pass");
 
      }else{
 
        this.setTestResult("Fail");
 
      }
 
   }
 
}

class GraduateStudent extends Student{
 
    public GraduateStudent(String studentName){
 
     super(studentName);
 
   }
 
   @Override
 
   public void generateResult(){
 
      int sum=0;
 
      for (int score : this.testScores) {
 
        sum+=score;
 
      }   
 
      double average =(double) sum/4.0;

      if(average>=70){
 
        this.setTestResult("Pass");
 
      }else{
 
        this.setTestResult("Fail");
 
      }
 
   }
 
}

class AbsAss1 {

    public static void main(String[] args) {
 
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
 
        undergraduateStudent.setTestScore(1, 70);
 
        undergraduateStudent.setTestScore(2, 69);
 
        undergraduateStudent.setTestScore(3, 71);
 
        undergraduateStudent.setTestScore(4, 55);
 
        undergraduateStudent.generateResult();
 
        System.out.println("Student name: "+undergraduateStudent.getStudentName());
 
        System.out.println("Result: "+undergraduateStudent.getTestResult());
 
        System.out.println();
 
        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
 
        graduateStudent.setTestScore(1, 70);
 
        graduateStudent.setTestScore(2, 69);
 
        graduateStudent.setTestScore(3, 71);
 
        graduateStudent.setTestScore(4, 55);
 
        graduateStudent.generateResult();
 
        System.out.println("Student name: "+graduateStudent.getStudentName());
 
        System.out.println("Result : "+graduateStudent.getTestResult());
 
        //Create more objects of the classes for testing your code
 
    }
 
}

 