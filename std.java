import java.util.Scanner;
import java.io.IOException;

class methods
{
	public static void clearScreen()			//CLS Method
	{  
    		try
		{
        		if (System.getProperty("os.name").contains("Windows"))
			{
            		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        		}

			else
			{
            		Runtime.getRuntime();
        		}

    		}

		catch (IOException | InterruptedException ex) {}
	}


	double per(double obtained, int total)		//Calculate Percentage Method
	{
		return ((obtained/total)*100);
	}

	double gpa(double percentage)				//Calculate GPA Method
	{
		if(percentage >= 93 && percentage <= 100)
		{
			return 4;
		}

		else if(percentage >= 87 && percentage < 93)
		{
			return 3.67;
		}

		else if(percentage >= 82 && percentage < 87)
		{
			return 3.33;
		}

		else if(percentage >= 77 && percentage < 82)
		{
			return 3;
		}

		else if(percentage >= 72 && percentage < 77)
		{
			return 2.67;
		}

		else if(percentage >= 68 && percentage < 72)
		{
			return 2.3;
		}

		else if(percentage >= 64 && percentage < 68)
		{
			return 2;
		}

		else if(percentage >= 60 && percentage < 64)
		{
			return 1.67;
		}

		else if(percentage >= 0 && percentage < 60)
		{
			return 0;
		}

		else 
			return 0;
	}
}

class student
{
	int no_Std=1;	

	String name;
	String fName;
	char gender;
	int age;
	String email;
	String cmsid;
	String dpt;
	String course;
	String sem;
	int no_courses;
	
	String[] courseName;
	int[] totalMarks;
	double[] obtMarks;

	double gpa;
	double per;
	double OBT = 0;
	int TOTAL = 0;
	
	int opt;		
	
	Scanner input = new Scanner(System.in);
	methods func = new methods();

	student()
	{
		no_Std=no_Std+1;
	}

	void inputStudent()			// Inputs Student Data
	{
		System.out.print("---- Input Student Data ----\n\n");
		System.out.print("Enter CMS-ID: ");
		this.cmsid = input.nextLine();
		System.out.print("Enter Name: ");
		this.name = input.nextLine();
		System.out.print("Enter Father's Name: ");
		this.fName = input.nextLine();
		System.out.print("Enter Gender (M/F): ");
		this.gender = input.next().charAt(0);
		System.out.print("Enter Age: ");
		this.age = input.nextInt();
		System.out.print("Enter Email: ");
		input.nextLine();
		this.email = input.nextLine();

		do
		{	
			System.out.print("\n\n\t\t--------------------\n\t\tSELECT COURSE (1-13)\n");
	
			System.out.print("------------------------------------------------------------\n");
			System.out.print(" No.\tCourse Name\t\tDepartment\n------------------------------------------------------------\n");
			System.out.print(" 1.\tBBA        \t\tBusiness Administration\n");
			System.out.print(" 2.\tBBA (Agribusiness)\tBusiness Administration\n");
			System.out.print(" 3.\tBSA        \t\tBusiness Administration\n");
			System.out.print(" 4.\tBS-Economics\t\tBusiness Administration\n");
			System.out.print(" 5.\tBS-Computer Science\tComputer Science\n");
			System.out.print(" 6.\tBS-AI             \tComputer Science\n");
			System.out.print(" 7.\tBS Mathematics    \tMathematics\n");
			System.out.print(" 8.\tBS-Media   \t\tMedia & Communication\n");
			System.out.print(" 9.\tBS-Physical Education\tPhysical Education\n");
			System.out.print(" 10.\tBE         \t\tElectrical Engineering\n");
			System.out.print(" 11.\tBE-CSE     \t\tComputer System Engineering\n");
			System.out.print(" 12.\tB.Ed       \t\tEducation\n");
			System.out.print(" 13.\tB.Ed (Hons)\t\tEducation\n");
			System.out.print("------------------------------------------------------------\n");

			System.out.print("No. ");
			opt = input.nextInt();
			
			if(opt<1 || opt>13)
			{
				System.out.print("\n\n\tNOTE: PLEASE SELECT BETWEEN 1 TO 13!\n");
			}	
		}
				
		while(opt<1 || opt>13);

		switch(opt)
		{
			case 1: { this.course = "BBA"; this.dpt = "Business Administration"; break;}
			case 2: { this.course = "BBA (Agribusiness)"; this.dpt = "Business Administration"; break;}
			case 3: { this.course = "BSA"; this.dpt = "Business Administration"; break;}
			case 4: { this.course = "BS-Economics"; this.dpt = "Business Administration"; break;}
			case 5: { this.course = "BS-CS"; this.dpt = "Computer Science"; break;}
			case 6: { this.course = "BS-AI"; this.dpt = "Computer Science"; break;}
			case 7: { this.course = "BS Mathematics"; this.dpt = "Mathematics"; break;}
			case 8: { this.course = "BS-Media"; this.dpt = "Media & Communication"; break;}
			case 9: { this.course = "BS-Physical Education"; this.dpt = "Physical Education"; break;}
			case 10: { this.course = "BE"; this.dpt = "Electrical Engineering"; break;}
			case 11: { this.course = "BE-CSE"; this.dpt = "Computer System Engineering"; break;}
			case 12: { this.course = "B.Ed"; this.dpt = "Education"; break;}
			case 13: { this.course = "B.Ed (Hons)"; this.dpt = "Education"; break;}
		}

		do
		{
			System.out.print("Semester: "+this.course+"-");
			opt = input.nextInt();
			if(opt<1 || opt>8)
			{
				System.out.print("\n\tNOTE: PLEASE SELECT BETWEEN 1 TO 8!\n");
			}
		}

		while(opt<1 || opt>8);

		switch(opt)
		{
			case 1: {this.sem = "I"; break;}
			case 2: {this.sem = "II"; break;}
			case 3: {this.sem = "III"; break;}
			case 4: {this.sem = "IV"; break;}
			case 5: {this.sem = "V"; break;}
			case 6: {this.sem = "VI"; break;}
			case 7: {this.sem = "VII"; break;}
			case 8: {this.sem = "VIII"; break;}
		}

		System.out.print("No. Of Courses: ");
		this.no_courses = input.nextInt();

		courseName = new String[no_courses];
		totalMarks = new int[no_courses];
		obtMarks = new double[no_courses];

		for(int i=0; i<no_courses; i++)
		{
			System.out.print("\n\nCourse "+(i+1)+"\n-------------\n");
			System.out.print("Course Name: ");
			input.nextLine();
			this.courseName[i] = input.nextLine();
			System.out.print("Enter Obtained Marks: ");
			this.obtMarks[i] = input.nextDouble();
			this.OBT += this.obtMarks[i];
			System.out.print("Enter Total Marks: ");
			this.totalMarks[i] = input.nextInt();
			this.TOTAL += this.totalMarks[i];
		}
		 
		this.per = func.per(this.OBT, this.TOTAL);
		this.gpa = func.gpa(this.per);
	}

	void display()
	{
		System.out.println("\n---------- STUDENT INFO ----------\n");
		System.out.println("  CMS-ID       :\t"+ this.cmsid);
		System.out.println("  Name         :\t"+ this.name);
		System.out.println("  Father Name  :\t"+ this.fName);
		System.out.println("  Gender       :\t"+ this.gender);
		System.out.println("  Age          :\t"+ this.age);
		System.out.println("  Email        :\t"+ this.email);
		System.out.println("\n  Department   :\t"+ this.dpt);
		System.out.println("  Course       :\t"+ this.course);
		System.out.println("  Semester     :\t"+ this.sem);
		this.per = func.per(this.OBT, this.TOTAL);
		this.gpa = func.gpa(this.per);

		System.out.println("\n------- Acadamic Progress -------\n");		
	
		System.out.println("  CGPA          :\t"+ this.gpa);
	}
	
	
}

class std			// MAIN CLASS
{
	public static student[] s = new student[20];		// GLOBAL OBJECT OF STUDENTS
	public static student noS = new student();			// GLOBAL OBJECT OF STUDENTS TO CHECK TOTAL STUDENTS	
	public static Scanner input = new Scanner(System.in);
	public static methods cls = new methods();	

	int studentCount = 3;
		
	void stdEnroll()			// STUDENTS ENROLL METHOD
	{
		cls.clearScreen();

		System.out.println("\n======= ENROLL STUDENT =======\n");
	
		studentCount+=1;
		int newS = studentCount-1;
		s[newS] = new student();
		s[newS].inputStudent();
		System.out.println("\n 1 Student Enrolled Successfully!");
		System.out.println("------------------------------\n");

		System.out.print("Press [ENTER] key to continue...");
		input.nextLine();
		gInterface();
	}
		
	void stdList()			// STUDENTS LIST METHOD
	{
		cls.clearScreen();
		
		int count=0;
		
		System.out.println("\n======= LIST OF STUDENTS =======\n");
		System.out.println("   CMS ID\t\tNAME");
		System.out.println("   ------\t\t----");
		for(int i=0; i<studentCount; i++)
		{
			System.out.println(" "+s[i].cmsid+"\t    "+s[i].name);
			count+=1;
		}
		
		System.out.println("\n\nTotal Students: "+count+"\n");
		System.out.println("--------------------------------\n");
		System.out.println("Press [S] key to search for more details...");
		System.out.print("Press [ENTER] key to Go Back...");
		input.nextLine();
		String opt2 = input.nextLine();	

		if(opt2.equals("S") || opt2.equals("s"))
		{
			stdSearch();
		}

		else if(opt2.equals(""))
		{
			gInterface();
		}

		else
		{
			System.out.println("\n\tUNKNOWN COMMAND");
		}
	}
	
	void stdSearch()			// STUDENTS SEARCH METHOD
	{
		int opt;
		String searchName;
		String searchCMS;
		int results=0;
		
		System.out.println("\n======= SEARCH STUDENT =======\n");
		
		System.out.println("  1. Search by Name");
		System.out.println("  2. Search by CMS-ID");

		System.out.print("\n  Select (1/2)... ");
		opt = input.nextInt();

		if(opt==1)
		{
			System.out.print("\n\n  Enter Name: ");
			input.nextLine();
			searchName = input.nextLine();
			
			cls.clearScreen();

			System.out.println("\n======= SEARCH STUDENT =======\n");
		
			System.out.println("  1. Search by Name");
			System.out.println("  2. Search by CMS-ID");

			System.out.print("\n  Select (1/2)... "+opt);
			System.out.println("\n\n  Enter Name: "+searchName);
			
			for(int i=0; i<studentCount; i++)
			{
				if(s[i].name.equals(searchName))
				{	
					results+=1;
					s[i].display();
				}
			}

			
			System.out.println("\n\t"+results+" RESULTS FOUND!\n\n");
		}

		else if(opt==2)
		{
			System.out.print("\n\n  Enter CMS-ID: ");
			input.nextLine();
			searchCMS = input.nextLine();

			cls.clearScreen();

			System.out.println("\n======= SEARCH STUDENT =======\n");
		
			System.out.println("  1. Search by Name");
			System.out.println("  2. Search by CMS-ID");

			System.out.print("\n  Select (1/2)... "+opt);
			System.out.println("\n\n  Enter CMS-ID: "+searchCMS);

			for(int i=0; i<studentCount; i++)
			{
				if(s[i].cmsid.equals(searchCMS))
				{
					results+=1;
					s[i].display();
				}
			}

			
			System.out.println("\n\t"+results+" RESULTS FOUND!\n\n");
		}

		else 
		{
			System.out.println("\n\n\tUNKNOWN COMMAND");
		}
		
		System.out.println("------------------------------\n");

		System.out.print("Press [ENTER] key to continue...");
		input.nextLine();
		gInterface();
	}

	void gInterface()			//GENERAL INTERFACE METHOD
	{
		cls.clearScreen();
		int opt;
		do
		{
			System.out.println("---- IBA SUKKUR ----\n");
			System.out.println("1. List Of Students");
			System.out.println("2. Search Student");
			System.out.println("3. Enroll Student");
			System.out.println("0. Exit Program");
			System.out.print("\nSelect Any Option... ");
			opt = input.nextInt();

			switch(opt)
			{		
				case 1: {stdList(); break;}
				case 2: {cls.clearScreen(); stdSearch(); break;}
				case 3: {stdEnroll(); break;}
			}

			if(opt > 3 || opt < 0)
			{
				System.out.println("\nUNKNOWN COMMAND!\n");
			}
		}

		while(opt<0 || opt>3);
	}

	public static void main(String args[])
	{	
		s[0] = new student();
		s[0].cmsid = "023-22-0199";
		s[0].name = "Khan Muhammad";
		s[0].fName = "Abdul Razaque";
		s[0].gender = 'M';
		s[0].age = 18;
		s[0].email = "khanmuhammadbsaif22@iba-suk.edu.pk";
		s[0].dpt = "Computer Science";
		s[0].course = "BS-AI";
		s[0].sem = "II";
		s[0].no_courses = 4;
		s[0].totalMarks = new int[s[0].no_courses];
		s[0].obtMarks = new double[s[0].no_courses];
		s[0].courseName = new String[s[0].no_courses];
		s[0].courseName[0] = "Pre-Calculus";
		s[0].obtMarks[0] = 78.6;
		s[0].totalMarks[0] = 100;
		s[0].courseName[1] = "Programming Fundamentals";
		s[0].obtMarks[1] = 49;
		s[0].totalMarks[1] = 50;
		s[0].courseName[2] = "English";
		s[0].obtMarks[2] = 47;
		s[0].totalMarks[2] = 50;
		s[0].courseName[3] = "Pak Study";
		s[0].obtMarks[3] = 32.3;
		s[0].totalMarks[3] = 50;
		s[0].OBT = s[0].obtMarks[0]+s[0].obtMarks[1]+s[0].obtMarks[2]+s[0].obtMarks[3];
		s[0].TOTAL = s[0].totalMarks[0]+s[0].totalMarks[1]+s[0].totalMarks[2]+s[0].totalMarks[3];
		
		s[1] = new student();
		s[1].cmsid = "023-22-0137";
		s[1].name = "Ayesha";
		s[1].fName = "Ashraf Ali";
		s[1].gender = 'F';
		s[1].age = 19;
		s[1].email = "ayeshabba21@iba-suk.edu.pk";
		s[1].dpt = "Business Administration";
		s[1].course = "BBA";
		s[1].sem = "III";
		s[1].no_courses = 4;
		s[1].totalMarks = new int[s[1].no_courses];
		s[1].obtMarks = new double[s[1].no_courses];
		s[1].courseName = new String[s[1].no_courses];
		s[1].courseName[0] = "Business Mathematics & Statistics";
		s[1].obtMarks[0] = 89;
		s[1].totalMarks[0] = 100;
		s[1].courseName[1] = "Business Economics";
		s[1].obtMarks[1] = 49;
		s[1].totalMarks[1] = 50;
		s[1].courseName[2] = "Introduction to Operations Research";
		s[1].obtMarks[2] = 39.5;
		s[1].totalMarks[2] = 50;
		s[1].courseName[3] = "Pak Study";
		s[1].obtMarks[3] = 48.3;
		s[1].totalMarks[3] = 50;
		s[1].OBT = s[1].obtMarks[0]+s[1].obtMarks[1]+s[1].obtMarks[2]+s[1].obtMarks[3];
		s[1].TOTAL = s[1].totalMarks[0]+s[1].totalMarks[1]+s[1].totalMarks[2]+s[1].totalMarks[3];

		s[2] = new student();
		s[2].cmsid = "023-22-0069";
		s[2].name = "Ahmed Ali";
		s[2].fName = "Ali Muhammad";
		s[2].gender = 'M';
		s[2].age = 21;
		s[2].email = "ahmedalibscs21@iba-suk.edu.pk";
		s[2].dpt = "Computer Science";
		s[2].course = "BS-CS";
		s[2].sem = "III";
		s[2].no_courses = 4;
		s[2].totalMarks = new int[s[2].no_courses];
		s[2].obtMarks = new double[s[2].no_courses];
		s[2].courseName = new String[s[2].no_courses];
		s[2].courseName[0] = "Object Oriented Programming";
		s[2].obtMarks[0] = 81;
		s[2].totalMarks[0] = 100;
		s[2].courseName[1] = "Data Structure";
		s[2].obtMarks[1] = 33.7;
		s[2].totalMarks[1] = 50;
		s[2].courseName[2] = "Cyber Security";
		s[2].obtMarks[2] = 39.5;
		s[2].totalMarks[2] = 50;
		s[2].courseName[3] = "English";
		s[2].obtMarks[3] = 46.3;
		s[2].totalMarks[3] = 50;
		s[2].OBT = s[2].obtMarks[0]+s[2].obtMarks[1]+s[2].obtMarks[2]+s[2].obtMarks[3];
		s[2].TOTAL = s[2].totalMarks[0]+s[2].totalMarks[1]+s[2].totalMarks[2]+s[2].totalMarks[3];
		
		std user = new std();
		System.out.println();
		user.gInterface();
	}
}