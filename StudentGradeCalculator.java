class Student{
    // This class should contain student private data and methods used to access our data
    // Variables
    private  String studentName;
	private  String address;
	private  String studentCMSID;
    // Constructors
    Student(){
        this.studentName = null ;
        this.address = null ;
        this.studentCMSID = null ;
    }

    Student(String studentName, String address, String studentCMSID){
        this.studentName = studentName ;
        this.address = address ;
        this.studentCMSID = studentCMSID ;
    }

    // Methods
    // View Student Personal Data - over ride toString method for this

    public String toString(){
        return ("This is the name : " + studentName + "\n This is Student Address : " + address + " This is the CMS ID : " + studentCMSID ) ;
    }

    

    

}

class Subjects {
    private  int noOfLabCourses ;
	private  int noOfTheoryCourses;
    private int totalCourses  = noOfLabCourses + noOfTheoryCourses ;
    private  int[] labMarks  =  new int[noOfLabCourses] ;
	private  int[] theoryMarks = new int[noOfTheoryCourses];
	private  String[] nameOfLabCourses = new String[noOfLabCourses] ; 
	private  String[] nameOfTheoryCourses = new String[noOfTheoryCourses];



}

class StudentGradeCalculator {
    public static void main(String args []) {

    }
}

//Functional Dependency

/*
 * To get studentGrades
 * To enter student Data correctly ==> Data Validation
 */