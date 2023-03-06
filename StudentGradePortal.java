import java.util.Scanner;
import java.lang.String;
class StudentData
{
	// Scanner input = new Scanner(System.in);
	// private String CMS_id;
	// private String name;
	// private double[] arrayOfSubjects ;
	// private double programming,pre_calculas,english,ict,pak_study,islamiat,programming_lab,ict_lab,GPA;
	// private double s1,s2,s3,s4,s5,s6,s7,s8;


	private  String studentName;
	private  String address;
	private  String studentCMSID;
	private  static int noOfLabCourses = 2;
	private  static int noOfTheoryCourses  = 4;
	private  int[] labMarks ;
	private  int []theoryMarks;
	private  String[] nameOfLabCourses ; 
	private  String[] nameOfTheoryCourses ;
	//   String[] lab = nameOfLabCourses[noOfLabCourses], theory = nameOfTheoryCourses[noOfTheoryCourses]
	//   String studentCoursesArray [nameOfLabCourses[] + nameOfTheoryCourses] ;

	// Constructors
	// Default
	StudentData()
	{
		this.studentName = null ;
		this.address = null ;
		this.studentCMSID = null ;
		labMarks = new int[noOfLabCourses] ;
		theoryMarks = new int[noOfTheoryCourses] ;
		nameOfLabCourses = new String[noOfLabCourses] ;
		nameOfTheoryCourses = new String[noOfTheoryCourses] ;



	}
	// Parameterized
	StudentData(private String studentName;	private String address;	private String studentCMSID)
	{
		this.studentName = studentName ;
		this.address = address ;
		this.studentCMSID = studentCMSID ;

	}

	// Method to ask to initialize marks of subjects for theory and lab respectively

	public void EnterTheoryMarks(){

	} 

	// METHOD FOR CORRECT OUT OF RANGE MARKS (0-100)
	double WrongMarks100(double w_mark) 
	{
		while(w_mark<0 || w_mark>100)
		{
			System.out.println("\nERROR : You entered out of range marks.");
			System.out.println("Your entered marks should be lies between this (0-100) range.");
			System.out.print("Enter marks again : ");
			w_mark = input.nextDouble();
			System.out.println();
			
		}
		return w_mark;
	}
	//METHOD FOR CORRECT OUT OF RANGE MARKS (0-50)
	double WrongMarks50(double w_mark) 
	{
		while(w_mark<0 || w_mark>50)
		{
			System.out.println("\nERROR : You entered out of range marks.");
			System.out.println("Your entered marks should be lies between this (0-50) range.");
			System.out.print("Enter marks again : ");
			w_mark = input.nextDouble();
			System.out.println();
			
		}
		return w_mark;
	}
	
	//METHODS FOR UPDATING DATA 
	void setCMS()
	{
		System.out.print("Enter updated CMS-ID of the student : ");
		this.CMS_id = input.next();
	}
	void setName()
	{
		System.out.print("Enter updated NAME of the student : ");
		input.nextLine();
		this.name = input.nextLine();
	}
	void setProgramming()
	{
		System.out.print("Enter updated PROGRAMMING of the student : ");
		this.programming = input.nextDouble();
		
		this.programming = WrongMarks100(this.programming);
	}
	void setPrecalculas()
	{
		System.out.print("Enter updated PRE-CALCULAS of the student : ");
		this.pre_calculas = input.nextDouble();
		
		this.pre_calculas = WrongMarks100(this.pre_calculas);
	}
	void setEnglish()
	{
		System.out.print("Enter updated ENGLISH of the student : ");
		this.english = input.nextDouble();
		
		this.english = WrongMarks100(this.english);
	}
	void setICT()
	{
		System.out.print("Enter updated ICT of the student : ");
		this.ict = input.nextDouble();
		
		this.ict = WrongMarks100(this.ict);
	}
	void setPakistanStudies()
	{
		System.out.print("Enter updated PAKISTAN STUDIES of the student : ");
		this.pak_study = input.nextDouble();
		
		this.pak_study = WrongMarks50(this.pak_study);
	}
	void setIslamiat()
	{
		System.out.print("Enter updated ISLAMIAT of the student : ");
		this.islamiat = input.nextDouble();
		
		this.islamiat = WrongMarks50(this.islamiat);
	}
	void setProgammingLAB()
	{
		System.out.print("Enter updated PROGRAMMING-LAB of the student : ");
		this.programming_lab = input.nextDouble();
		
		this.programming_lab = WrongMarks50(this.programming_lab);
	}
	void setICTLAB()
	{
		System.out.print("Enter updated ICT-LAB of the student : ");
		this.ict_lab = input.nextDouble();
		
		this.ict_lab = WrongMarks50(this.ict_lab);
	}
	
	//METHOD FOR GET CURRENT OBJECT NAME
	String getName()
	{
		return name;
	}
	
	//METHOD FOR TAKE INPUT DATA FROM THE USER
	void setData()
	{
		System.out.print("Enter CMS-Id : ");
		CMS_id = input.next();
		
		System.out.print("Enter NAME : ");
		input.nextLine();
		name = input.nextLine();
		
		System.out.print("Enter PROGRAMMING marks : ");
		programming = input.nextDouble();
		this.programming = WrongMarks100(this.programming);
		
		System.out.print("Enter PRE-CALCULAS marks : ");
		pre_calculas = input.nextDouble();
		this.pre_calculas = WrongMarks100(this.pre_calculas);
		
		System.out.print("Enter ENGLISH marks : ");
		english = input.nextDouble();
		this.english = WrongMarks100(this.english);
		
		System.out.print("Enter ICT marks : ");
		ict = input.nextDouble();
		this.ict = WrongMarks100(this.ict);
		
		System.out.print("Enter PAKISTAN STUDIES marks : ");
		pak_study = input.nextDouble();
		this.pak_study = WrongMarks50(this.pak_study);
		
		System.out.print("Enter ISLAMIAT marks : ");
		islamiat = input.nextDouble();
		this.islamiat = WrongMarks50(this.islamiat);
		
		System.out.print("Enter PROGRAMMING-LAB marks : ");
		programming_lab = input.nextDouble();
		this.programming_lab = WrongMarks50(this.programming_lab);
		
		System.out.print("Enter ICT-LAB marks : ");
		ict_lab = input.nextDouble();
		this.ict_lab = WrongMarks50(this.ict_lab);
	}
	
	void default_value()
	{
		this.CMS_id = null;
		this.name = null;
		this.programming = 0.00;
		this.pre_calculas = 0.00;
		this.english = 0.00;
		this.ict = 0.00;
		this.pak_study = 0.00;
		this.islamiat = 0.00;
		this.programming_lab = 0.00;
		this.ict_lab = 0.00;
		
	}
	
	//METHOD FOR DELETE THE RECORD OF ANY OBJECT
	void deleteRecord(StudentData student[],int index,int size)
	{
		for(int i = index; i<size; i++)
		{
			if(i == size-1)
				student[i].default_value();
			
			else{
				student[i].CMS_id = student[i+1].CMS_id;
				student[i].name = student[i+1].name;
				student[i].programming = student[i+1].programming;
				student[i].pre_calculas = student[i+1].pre_calculas;
				student[i].english = student[i+1].english;
				student[i].ict = student[i+1].ict;
				student[i].pak_study = student[i+1].pak_study;
				student[i].islamiat = student[i+1].islamiat;
				student[i].programming_lab = student[i+1].programming_lab;
				student[i].ict_lab = student[i+1].ict_lab;
			}
			
		}
		
	}
	
	//METHODS FOR GPA CALCULATION
	double calcSubGPA_100(double subject)
	{
		//CALCULATE EACH SUBJECT GPA (TOTAL = 100)
		if(subject>= 93 && subject<=100)
			return 4.00;
		else if(subject>=87 && subject<=92)
			return 3.67;
		else if(subject>=82 && subject<=86)
			return 3.33;
		else if(subject>=77 && subject<=81)
			return 3.00;
		else if(subject>=72 && subject<=76)
			return 2.67;
		else if(subject>=68 && subject<=71)
			return 2.3;
		else if(subject>=64 && subject<=67)
			return 2.0;
		else if(subject>=60 && subject<=63)
			return 1.67;
		else 
			return 0.00;
		
	}
	double calcSubGPA_50(double subject)
	{
		//CALCULATE EACH SUBJECT GPA (TOTAL = 50)
		if(subject>= 46 && subject<=50)
			return 4.00;
		else if(subject>=44 && subject<=45)
			return 3.67;
		else if(subject>=42 && subject<=43)
			return 3.33;
		else if(subject>=39 && subject<=41)
			return 3.00;
		else if(subject>=37 && subject<=38)
			return 2.67;
		else if(subject>=35 && subject<=36)
			return 2.3;
		else if(subject>=32 && subject<=34)
			return 2.0;
		else if(subject>=30 && subject<=31)
			return 1.67;
		else 
			return 0.00;
	}
	
	//CALCULATE GPA
	void calcGPA()
	{
		s1 = calcSubGPA_100(Math.round(programming));
		s2 = calcSubGPA_100(Math.round(pre_calculas));
		s3 = calcSubGPA_100(Math.round(english));
		s4 = calcSubGPA_100(Math.round(ict));
		s5 = calcSubGPA_50(Math.round(pak_study));
		s6 = calcSubGPA_50(Math.round(islamiat));
		s7 = calcSubGPA_50(Math.round(programming_lab));
		s8 = calcSubGPA_50(Math.round(ict_lab));
		
		GPA = (((s1*3)+(s2*0)+(s3*3)+(s4*3)+(s5*2)+(s6*2)+(s7*1)+(s8*1))/15.0);
	}
	
	//METHOD FOR GET CURRENT OBJECT'S GPA
	double getGPA()
	{
		calcGPA();
		return GPA;
	}
	
	//CRITERIA FOR FAILED STUDENTS
	void FailedSubject()
	{
		System.out.println("---------------------------------------------------");
		if(s1 == 0.00)
			System.out.println("THis students is failed in PROGRAMMING.");
		if(s2 == 0.00)
			System.out.println("This student is failed in PRE-CALCULAS.");
		if(s3 == 0.00)
			System.out.println("This student is failed in ENGLISH.");
		if(s4 == 0.00)
			System.out.println("This student is failed in ICT.");
		if(s5 == 0.00)
			System.out.println("This student is failed in PAKISTAN STUDIES.");
		if(s6 == 0.00)
			System.out.println("This student is failed in ISLAMIAT.");
		if(s7 == 0.00)
			System.out.println("This student is failed in PROGRAMMING LAB.");
		if(s8 == 0.00)
			System.out.println("This student is failed in ICT LAB.");
		if(s1 != 0.00 && s2 != 0.00 && s3 != 0.00 && s4 != 0.00 && s5 != 0.00 && s6 != 0.00 && s7 != 0.00 && s8 != 0.00)
			System.out.println("This student PASSED in all subjects.");
		System.out.println("-----------------------------------------------------");
	}
	
	//METHOD FOR DISPLY INFORMATION
	void DisplyDetails()
	{
		calcGPA();
		System.out.println("\n----------------------------------------------------");
		System.out.println("CMS-ID \t\t\t:\t\t"+this.CMS_id);
		System.out.println("NAME \t\t\t:\t\t"+this.name);
		System.out.println("PROGAMMING MARKS \t:\t\t"+this.programming);
		System.out.println("PRE-CALCULAS MARKS \t:\t\t"+this.pre_calculas);
		System.out.println("ENGLISH MARKS \t\t:\t\t"+this.english);
		System.out.println("ICT marks \t\t:\t\t"+this.ict);
		System.out.println("PAKISTAN STUDIES MARKS \t:\t\t"+this.pak_study);
		System.out.println("ISLAMIAT MARKS \t\t:\t\t"+this.islamiat);
		System.out.println("PROGRAMMING LAB MARKS \t:\t\t"+this.programming_lab);
		System.out.println("ICT LAB MARKS \t\t:\t\t"+this.ict_lab);
		System.out.println("\nGPA IS \t\t\t:\t\t"+this.GPA);
		FailedSubject();
		System.out.println();
	}
}

//HERE THIS IS THE MAIN CLASS
class StudentGradePortal
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int choice,select = 0,size = 5;
		String cont,search_name = "";
		
		StudentData []student = new StudentData[5];
		student[0] = new StudentData("023-22-7856","Karan",78,98.8,76.1,77.9,44,45.6,34.9,41);
		student[1] = new StudentData("023-22-9874","Kiran",87.9,94,98,76.9,45,43.8,43,41.7);
		
		for(int i=0; i<size; i++)
		{
			if(i>1)
				student[i] = new StudentData();
		}
		
		do		
		{
			System.out.println("\n\\**********************************************\\");
			System.out.println("\\ WELCOME IN STUDENT GRADE PORTAL(CS STUDENTS) \\");
			System.out.println("\\**********************************************\\\n\n");
			System.out.println("Press 1 for see the data of already enrolled students.");
			System.out.println("Press 2 for add new student data.");
			System.out.println("Press 3 for see the topper student details(from the enrolled students).");
			System.out.println("Press 4 for see the droped/Failed students(From the enrolled students).");
			System.out.println("Press 5 for update student's details.");
			System.out.println("Press 6 for delete the details OR record of any enrolled student.");
			System.out.println("Press 0 for exit the program.");
			
			System.out.print("\nEnter your choice : ");
			choice = input.nextInt();
			
			switch(choice)
			{
				case 0:
				break;
				
				case 1:
				{
					System.out.println("-------------------------------------------");
					for(int i=0; i<size; i++)
					{
						if(student[i].getName()!=null)
						System.out.println(student[i].getName());
					}
					System.out.println("-------------------------------------------\n");
					int count = 0;
					
					System.out.println("Enter the NAME of the student that you want to see complete details.");
					System.out.print("Otherwise press [ENTER] key for back in Main menu : ");
					input.nextLine();
					search_name = input.nextLine();
					
					if(search_name == "")
						break;
				
					for(int i=0; i<size; i++)
					{
						if(student[i].getName()!=null && search_name.compareTo(student[i].getName())==0)
						{
							student[i].DisplyDetails();
							count++;
						}
					}
					if(count == 0)
						System.out.println("Sorry! your search NOT FOUND.");
					break;
				}
			
				case 2:
				{
					for(int i=0; i<=size; i++)
					{
						if(i==size)
							System.out.println("SORRY! YOU CAN NOT ADD MORE STUDENT'S DATA(SECTION FULL)"); 
					
						else if(student[i].getName()!=null)
							continue;
					
						else
						{
						student[i].setData();
						System.out.println();
						break;
						}
					}
					break;
				}
			
				case 3:
				{
					double higest = student[0].getGPA();
					for(int i=1; i<size; i++)
					{
						if(higest<student[i].getGPA())
							higest = student[i].getGPA();
					}
					System.out.println("\n\\**********************************************\\");
					System.out.println("DETAILS OF TOPPER STUDENT...\n");
					System.out.println("\\**********************************************\\\n\n");
					for(int i=0; i<size; i++)
					{
						if(higest == student[i].getGPA())
							student[i].DisplyDetails();
							
					}
					break;
				}
			
				case 4:
				{
					System.out.println("\n\\**********************************************\\");
					System.out.println("DETAILS OF DROPED/FAILED STUDENTS...\n");
					System.out.println("\\**********************************************\\\n\n");
					int drop = 0;
					for(int i=0; i<size; i++)
					{
						if(student[i].getGPA() != 0.00 && student[i].getGPA()<2.2)
						{
							student[i].DisplyDetails();
							drop++;
						}
					}
					if(drop == 0)
						System.out.println("\nTHERE IS NO ANY FAILED/DROPED STUDENTS FOUND FROM THIS SECTION.\n");
					else{
						
						System.out.println("THERE ARE/IS "+drop+" DROPED/FAILED STUDENTS IN THIS SECTION.");
						System.out.println("----------------------------------------------------------------");
					}
					break;
				}
				
			
				case 5:
				{
					System.out.print("Enter name of the student that you want to update OR change any information : ");
					input.nextLine();
					String updated_name = input.nextLine();
					
					for(int i=0; i<size; i++)
					{
						
						if(student[i].getName() != null && updated_name.compareTo(student[i].getName()) == 0)
						{
							select++;
							System.out.println("Press 1 for update the CMS-ID of the student.");
							System.out.println("Press 2 for update the name of the student.");
							System.out.println("Press 3 for update the 	PROGRAMMING marks of the student.");
							System.out.println("Press 4 for update teh PRE-CALCULAS marks of the student.");
							System.out.println("Press 5 for update teh ENGLISH marks of the student.");
							System.out.println("Press 6 for update teh ICT marks of the student.");
							System.out.println("Press 7 for update teh PAKISTAN STUDIES marks of the student.");
							System.out.println("Press 8 for update teh ISLAMIAT marks of the student.");
							System.out.println("Press 9 for update teh PROGRAMMING-LAB marks of the student.");
							System.out.println("Press 10 for update teh ICT-LAB marks of the student.");
							
						
							System.out.print("\nEnter your choice : ");
							int choice_update = input.nextInt();
						
							switch(choice_update)
							{
								case 1:
								student[i].setCMS();
								break;
							
								case 2:
								student[i].setName();
								break;
							
								case 3:
								student[i].setProgramming();
								break;
							
								case 4:
								student[i].setPrecalculas();
								break;
							
								case 5:
								student[i].setEnglish();
								break;
							
								case 6:
								student[i].setICT();
								break;
							
								case 7:
								student[i].setPakistanStudies();
								break;
							
								case 8:
								student[i].setIslamiat();
								break;
							
								case 9:
								student[i].setProgammingLAB();
								break;
							
								case 10:
								student[i].setICTLAB();
								break;
							
								default:
								System.out.println("INVALID CHOICE");
							}
						}
					}
					if(select == 0)
					{
						System.out.println("SORRY! your searched student NOT FOUND.");
					}
					break;
				}
				
				case 6:
				{
					System.out.println("THESE ARE ENROLLED STUDENTS.");
					System.out.println("---------------------------------------");
					for(int i=0; i<size; i++)
					{
						if(student[i].getName()!=null)
							System.out.println(student[i].getName());
					}
					System.out.println("----------------------------------------");
					
					System.out.print("Enter the name of the student that you want to delete teh details OR record : ");
					input.nextLine();
					String del_name = input.nextLine();
					
					for(int i=0; i<size; i++)
					{
						if(student[i].getName() != null && del_name.compareTo(student[i].getName())==0)
							
							student[i].deleteRecord(student,i,size);
					}
					break;
				}
				
				
				default:
				System.out.println("INVALID CHOICE");
				
			}
				
			
			if(choice != 0)
			{	
				if(choice == 1 && search_name == "")
					cont = "";
				
				else
				{
					System.out.println("\nPress [ENTER] key for back in Main Menu.");
					System.out.print("Othewise, press any other button for exit the program immediately.");
					input.nextLine();
					cont = input.nextLine();
				}
			}
			else
				break;
			
		}
			
		while(cont.compareTo("")==0);
		System.out.println("HERE THE PROGRAM IS END!");
		
	}
}


/*
 * static void bubbleSort(int arr[], int n)
    {
        // Base case
        if (n == 1)
            return;
      
        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
      
        // Largest element is fixed,
        // recur for remaining array
        bubbleSort(arr, n-1);
    }
 */

class Student{
    String studentName, address, studentCMSID;
    int noOfLabCourses, noOfTheoryCourses ;
    int labMarks [], theoryMarks [] ;
    String nameOfLabCourses[];
    String nameOfTheoryCourses[] ;
    String lab [] = nameOfLabCourses[];
    String theory [] = nameOfTheoryCourse[] ;
    String studentCoursesArray [lab.length + theory.length] ;


    Student(){
        this.studentName = null;
        this.noOfLabCourses = 0;
        this.address = null ;
        this.studentCMSID = null ;
        this.noOfTheoryCourses = 0 ;

    }

    Student(String name,
            String address,
            String studentCMSID,
            int noOfLabCourses,
            int noOfTheoryCourses){
        this.studentName = studentName;
        this.noOfLabCourses = noOfLabCourses;
        this.address = address ;
        this.studentCMSID = studentCMSID ;
        this.noOfTheoryCourses = noOfTheoryCourses ;

    }

    void deleteRecord(StudentData student[],int index,int size)
	{
		for(int i = index; i<size; i++)
		{
			if(i == size-1)
				student[i].default_value();
			
			else{
				student[i].CMS_id = student[i+1].CMS_id;
				student[i].name = student[i+1].name;
				student[i].programming = student[i+1].programming;
				student[i].pre_calculas = student[i+1].pre_calculas;
				student[i].english = student[i+1].english;
				student[i].ict = student[i+1].ict;
				student[i].pak_study = student[i+1].pak_study;
				student[i].islamiat = student[i+1].islamiat;
				student[i].programming_lab = student[i+1].programming_lab;
				student[i].ict_lab = student[i+1].ict_lab;
			}
			
		}
		
	}
	
	//METHODS FOR GPA CALCULATION
	double calcSubGPA_100(double subject)
	{
		//CALCULATE EACH SUBJECT GPA (TOTAL = 100)
		if(subject>= 93 && subject<=100)
			return 4.00;
		else if(subject>=87 && subject<=92)
			return 3.67;
		else if(subject>=82 && subject<=86)
			return 3.33;
		else if(subject>=77 && subject<=81)
			return 3.00;
		else if(subject>=72 && subject<=76)
			return 2.67;
		else if(subject>=68 && subject<=71)
			return 2.3;
		else if(subject>=64 && subject<=67)
			return 2.0;
		else if(subject>=60 && subject<=63)
			return 1.67;
		else 
			return 0.00;
		
	}
	double calcSubGPA_50(double subject)
	{
		//CALCULATE EACH SUBJECT GPA (TOTAL = 50)
		if(subject>= 46 && subject<=50)
			return 4.00;
		else if(subject>=44 && subject<=45)
			return 3.67;
		else if(subject>=42 && subject<=43)
			return 3.33;
		else if(subject>=39 && subject<=41)
			return 3.00;
		else if(subject>=37 && subject<=38)
			return 2.67;
		else if(subject>=35 && subject<=36)
			return 2.3;
		else if(subject>=32 && subject<=34)
			return 2.0;
		else if(subject>=30 && subject<=31)
			return 1.67;
		else 
			return 0.00;
	}
	
	//CALCULATE GPA
	void calcGPA()
	{
		s1 = calcSubGPA_100(Math.round(programming));
		s2 = calcSubGPA_100(Math.round(pre_calculas));
		s3 = calcSubGPA_100(Math.round(english));
		s4 = calcSubGPA_100(Math.round(ict));
		s5 = calcSubGPA_50(Math.round(pak_study));
		s6 = calcSubGPA_50(Math.round(islamiat));
		s7 = calcSubGPA_50(Math.round(programming_lab));
		s8 = calcSubGPA_50(Math.round(ict_lab));
		
		GPA = (((s1*3)+(s2*0)+(s3*3)+(s4*3)+(s5*2)+(s6*2)+(s7*1)+(s8*1))/15.0);
	}
	
	//METHOD FOR GET CURRENT OBJECT'S GPA
	double getGPA()
	{
		calcGPA();
		return GPA;
	}
	
	//CRITERIA FOR FAILED STUDENTS
	void FailedSubject()
	{
		System.out.println("---------------------------------------------------");
		if(s1 == 0.00)
			System.out.println("THis students is failed in PROGRAMMING.");
		if(s2 == 0.00)
			System.out.println("This student is failed in PRE-CALCULAS.");
		if(s3 == 0.00)
			System.out.println("This student is failed in ENGLISH.");
		if(s4 == 0.00)
			System.out.println("This student is failed in ICT.");
		if(s5 == 0.00)
			System.out.println("This student is failed in PAKISTAN STUDIES.");
		if(s6 == 0.00)
			System.out.println("This student is failed in ISLAMIAT.");
		if(s7 == 0.00)
			System.out.println("This student is failed in PROGRAMMING LAB.");
		if(s8 == 0.00)
			System.out.println("This student is failed in ICT LAB.");
		if(s1 != 0.00 && s2 != 0.00 && s3 != 0.00 && s4 != 0.00 && s5 != 0.00 && s6 != 0.00 && s7 != 0.00 && s8 != 0.00)
			System.out.println("This student PASSED in all subjects.");
		System.out.println("-----------------------------------------------------");
	}
	
	//METHOD FOR DISPLY INFORMATION
	void DisplyDetails()
	{
		calcGPA();
		System.out.println("\n----------------------------------------------------");
		System.out.println("CMS-ID \t\t\t:\t\t"+this.CMS_id);
		System.out.println("NAME \t\t\t:\t\t"+this.name);
		System.out.println("PROGAMMING MARKS \t:\t\t"+this.programming);
		System.out.println("PRE-CALCULAS MARKS \t:\t\t"+this.pre_calculas);
		System.out.println("ENGLISH MARKS \t\t:\t\t"+this.english);
		System.out.println("ICT marks \t\t:\t\t"+this.ict);
		System.out.println("PAKISTAN STUDIES MARKS \t:\t\t"+this.pak_study);
		System.out.println("ISLAMIAT MARKS \t\t:\t\t"+this.islamiat);
		System.out.println("PROGRAMMING LAB MARKS \t:\t\t"+this.programming_lab);
		System.out.println("ICT LAB MARKS \t\t:\t\t"+this.ict_lab);
		System.out.println("\nGPA IS \t\t\t:\t\t"+this.GPA);
		FailedSubject();
		System.out.println();
	}

    static void bubbleSort(int arr[], int n)
    {
        // Base case
        if (n == 1)
            return;
      
        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
      
        // Largest element is fixed,
        // recur for remaining array
        bubbleSort(arr, n-1);
    }



}

/*
 * Things to do:
 * 
 *  Make a Student Grade Portal
 * 
 *  Variables
 * 
 *  String studentName;
 *  String address;
 *  String studentCMSID;
 *  int noOfLabCourses ;
 *  int noOfTheoryCourses ;
 *  int labMarks [noOfLabCourses], theoryMarks [noOfTheoryCourses] ;
 *  String nameOfLabCourses[noOfLabCourses], nameOfTheoryCourses[noOfTheoryCourses]
 *  String lab = nameOfLabCourses[noOfLabCourses], theory = nameOfTheoryCourses[noOfTheoryCourses]
 *  String studentCoursesArray [nameOfLabCourses[] + nameOfTheoryCourses] ;
 * 
 *  Constructors
 *  //Default
 *  // Parameterized
 *  
 *  Methods
 * 
 *  // See all students record ( Pass + Fail)
 *  // Add new Student
 *  // Update Student Record
 *  // Delete Student Record
 *  // formaula to calculate gpa
 *  // calculate if a person is pass or fail
 * 
 *  Classes
 * 
 * 	1) Students
 *  2) Subjects
 * 	3) Main Class
 * 
 *  main class => StudentGradePortal
 *  supporting class => Student - to hold all the information regarding student
 * 
 *  Objects
 * 
 *  Student object 
 * 
 *  
 * 
 *  
 * 
 *  
 * 
 */
