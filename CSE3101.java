import java.util.*;
import java.io.*;



class ems //Parent class ems extended by admin and student.
{
 void syllabus()throws IOException , FileNotFoundException     //syllabus function which shows syllabus for different subjects.
{
 ems e1 = new ems();
 int slly=0;
 Scanner sn4 = new Scanner(System.in);
 System.out.println("---------Welcome To Syllabus---------");
 System.out.println("Subjects are= \n1. Java \n2. Python \n3. Maths \n4. English \n5. OS \n6. Networking \n7. Go to Main Menu");
 System.out.println("Enter your Choice in Numeric=");
 int a2=sn4.nextInt();
 if(a2==1)
   {
   System.out.println("************\nJava syllabus\n************");
   System.out.println("1. Basics of Java \n2. OOPS Conecpts \n3. String Handling \n4. Exception Handling \n5. Nested Classes \n6. Multithreading");
   System.out.println("Enter 1 to get Syllabus Menu");
   slly=sn4.nextInt();
   e1.syllabus();
   }
   else if(a2==2)
   {
   System.out.println("************\nPython syllabus\n***********");
   System.out.println("1. Basics of Python \n2. OOPS Conecpts \n3. String Handling \n4. Exception Handling \n5. Nested Classes \n6. Multithreading");
   System.out.println("Enter 1 to get Syllabus Menu");
   slly=sn4.nextInt();
   e1.syllabus();
   }
   else if(a2==3)
   {
   System.out.println("************\nJava syllabus\n*************");
   System.out.println("1. Arithmetic\n2. Algebra\n3. Trigonometry\n4. Geometry\n5. Mensuration\n6. Statistics");
   System.out.println("Enter 1 to get Syllabus Menu");
   slly=sn4.nextInt();
   e1.syllabus();
   }
   else if(a2==4)
   {
   System.out.println("*************\nEnglish syllabus\n************");
   System.out.println("1. Spotting Errors Questions\n2. Sentence Arrangement Questions\n3. Synonyms & Antonyms\n4. Selecting Words\n5. Ordering of Sentence\n6. Comprehension Questions\n7. Ordering of words in a sentence");
   System.out.println("Enter 1 to get Syllabus Menu");
   slly=sn4.nextInt();
   e1.syllabus();
   }
   else if(a2==5)
   {
   System.out.println("*************\nOS syllabus\n**************");
   System.out.println("1. OPERATING SYSTEM OVERVIEW  \n2. PROCESS MANAGEMENT  \n3. STORAGE MANAGEMENT  \n4. FILE SYSTEMS AND I/O SYSTEMS \n5. CASE STUDY");
   System.out.println("Enter 1 to get Syllabus Menu");
   slly=sn4.nextInt();
   e1.syllabus();
   }
   else if(a2==6)
   {
   System.out.println("*************\nNetworking syllabus\n**************");
   System.out.println("1. Network Fundamentals\n2. Network Access\n3. Ip Connections\n4. IP Services\n5. Security Fundamentals\n6. Automation");
   System.out.println("Enter 1 to get Syllabus Menu");
   slly=sn4.nextInt();
   e1.syllabus();
   }
   else if(a2==7)
   {
   }
   else
   {
   System.out.println("Wrong choice Enter again");
   e1.syllabus();
   }
 }
void datesheet()throws IOException , FileNotFoundException         //datesheet functuons shows datesheet for all subject with seating and timing.
 {
 Scanner sn6 = new Scanner(System.in);
 System.out.println("--------Welcome to DateSheet--------");
 System.out.println("Subject            Type               Seating               Date              Timing");
 System.out.println("Java\t        Theory and MCQ       Room 526-34          5th Jan,20      12:00 - 1:00pm");
 System.out.println("Python\t        Theory and MCQ       Room 262-52          8th Jan,20      12:00 - 1:00pm");
 System.out.println("Maths\t             MCQ             Room 337-23          12th Jan,20     10:00 - 12:00am");
 System.out.println("Os\t        Theory and MCQ       Room 884-56          15th Jan,20     12:00 - 1:00pm");
 System.out.println("English\t             MCQ             Room 545-14          18th Jan,20     10:00 - 12:00pm");
 System.out.println("Network         Theory and MCQ       Room 766-33          21st Jan,20     12:00 - 1:00pm");
 System.out.println("Enter 1 to get Main Menu");
 int men1=sn6.nextInt();
  }
}




class studen extends ems              //studen class extends ems and has addional function required by students.
{
int imc=0;
public void syllabus()throws IOException , FileNotFoundException   // syllabus function
 {
 user u4 =new user();
 ems e2=new ems();
 e2.syllabus();
 u4.check3();
 }
public void datesheet()throws IOException , FileNotFoundException    // datesheet function
 {
 user u6 =new user();
 ems e3 =new ems();
 e3.datesheet();
 u6.check3();
 }
void getsampleq()throws IOException , FileNotFoundException       // getsampleq function so that student can se sample questions from teacher.
 {
 user u8 =new user();
 System.out.println("----------Welcome to Get Sample Questions----------");
 System.out.println("Note: You can only get Sample Questions If Adminstrator has Submited Them");
 FileInputStream o1 = new FileInputStream("sampleq.txt");
 FileOutputStream o2 = new FileOutputStream("solvedq.txt");
 BufferedReader br=new BufferedReader(new InputStreamReader(o1));
 BufferedWriter bw1=new BufferedWriter(new OutputStreamWriter(o2));
 Scanner sn9 =new Scanner(System.in);
 String rea ="";
 int i=0;
 while((rea=br.readLine()) != null)
   {
   i=i+1;
   System.out.println("Q"+i+". "+rea);
   }
 br.close();
 System.out.println("\nEnter the Ans For above Questions");
 for(int ij1=0;ij1<i;ij1++)
    {
    System.out.println("Enter the Ans no."+(ij1+1)+"=");
    String ans=sn9.nextLine();
    bw1.write(ans);
    bw1.newLine();
    }
 bw1.close();
 System.out.println("Your Ans is Submitted enter 1 to get to Main Menu");
 int a8=sn9.nextInt();
 u8.check3();
 }
void getresult()throws IOException , FileNotFoundException        //getresult function which can show result to student.
 {
 System.out.println("---------Welcome to View Result--------");
 Scanner sn13=new Scanner(System.in);
 user u13=new user();
 FileInputStream o6=new FileInputStream("result.txt");
 BufferedReader br3=new BufferedReader(new InputStreamReader(o6));
 String stre=null;
 int ij6=0;
 while((stre=br3.readLine())!=null)
     {
     ij6=ij6+1;
     System.out.println(ij6+". "+stre);
     }
 br3.close();
 System.out.println("Your Ans is Submitted enter 1 to get to Main Menu");
 int a13=sn13.nextInt();
 u13.check3();
 }
void onlinetest()throws IOException , FileNotFoundException         //onlinetest function by which students can take a online test.
 {
 System.out.println("---------Welcome to Online Test---------");
 Scanner sn15=new Scanner(System.in);
 user u15 =new user();
 studen s9=new studen();
 System.out.println("Subject are= \n1. Java\n2. Python\n3. Go to Main Menu");
 System.out.println("Enter your choice in numeric=");
 int onli=sn15.nextInt();
 int imcq=0,ians=0,icon=0;
  if(onli==1)
    {
    System.out.println("Java Test\n Its MCQ baised");
    System.out.println("Enter 1 to Continue");
    icon=sn15.nextInt();
    System.out.println("1. What is the range of short data type in Java?\n1. -128 to 127\n2. -32768 to 32767\n3. -2147483648 to 2147483647\4. None of the mentioned");
    System.out.println("Enter your Choice in numeric=");
    ians=sn15.nextInt();
    imcq=s9.checkmcq(ians,2);
    System.out.println("Enter 1 to Continue");
    icon=sn15.nextInt();
    System.out.println("2. What is the range of byte data type in Java?\n1. -128 to 127\n2. -32768 to 32767\n3. -2147483648 to 2147483647\n4. None of the mentioned");
    System.out.println("Enter your Choice in numeric=");
    ians=sn15.nextInt();
    imcq=s9.checkmcq(ians,1);
    System.out.println("Enter 1 to Continue");
    icon=sn15.nextInt();
    System.out.println("3. An expression involving byte, int, and literal numbers is promoted to which of these?\n1. int\n2. long\n3. byte\n4. float");
    System.out.println("Enter your Choice in numeric=");
    ians=sn15.nextInt();
    imcq=s9.checkmcq(ians,1);
    System.out.println("Enter 1 to Continue");
    icon=sn15.nextInt();
    System.out.println("4. Which of these literals can be contained in float data type variable?\n1. -1.7e+308\n2. -3.4e+038\n3. +1.7e+308\n4. -3.4e+050");
    System.out.println("Enter your Choice in numeric=");
    ians=sn15.nextInt();
    imcq=s9.checkmcq(ians,2);
    System.out.println("Enter 1 to Continue");
    icon=sn15.nextInt();
    System.out.println("5. Which data type value is returned by all transcendental math functions?\n1. int\n2. float\n3. double\n4. long");
    System.out.println("Enter your Choice in numeric=");
    ians=sn15.nextInt();
    imcq=s9.checkmcq(ians,3);
    System.out.println("%%%-You Scored "+imcq+" out of 5-%%%");
    System.out.println("Enter 1 to get to MCQ Menu");
    icon=sn15.nextInt();
    s9.onlinetest();
    }
  else if(onli==2)
    {
    System.out.println("Python Test\n Its MCQ baised");
    System.out.println("Enter 1 to Continue");
    icon=sn15.nextInt();
    System.out.println("1. Is Python case sensitive when dealing with identifiers?\n1. yes\n2. no\n3. machine dependent\n4. none of the mentioned");
    System.out.println("Enter your Choice in numeric=");
    ians=sn15.nextInt();
    imcq=s9.checkmcq(ians,1);
    System.out.println("Enter 1 to Continue");
    icon=sn15.nextInt();
    System.out.println("2. What is the maximum possible length of an identifier?\n1. 31 characters\n2. 63 characters\n3. 79 characters\n4. none of the mentioned");
    System.out.println("Enter your Choice in numeric=");
    ians=sn15.nextInt();
    imcq=s9.checkmcq(ians,4);
    System.out.println("Enter 1 to Continue");
    icon=sn15.nextInt();
    System.out.println("3. Which of the following is invalid?\n1. _a = 1\n2. __a = 1\n3. __str__ = 1\n4. none of the mentioned");
    System.out.println("Enter your Choice in numeric=");
    ians=sn15.nextInt();
    imcq=s9.checkmcq(ians,4);
    System.out.println("Enter 1 to Continue");
    icon=sn15.nextInt();
    System.out.println("4. Which of the following is an invalid variable?\n1. my_string_1\n2. 1st_string\n3. foo\n4. _");
    System.out.println("Enter your Choice in numeric=");
    ians=sn15.nextInt();
    imcq=s9.checkmcq(ians,2);
    System.out.println("Enter 1 to Continue");
    icon=sn15.nextInt();
    System.out.println("5. Why are local variable names beginning with an underscore discouraged?\n1. they are used to indicate a private variables of a class\n2. they confuse the interpreter\n3. they are used to indicate global variables\n4. they slow down execution");
    System.out.println("Enter your Choice in numeric=");
    ians=sn15.nextInt();
    imcq=s9.checkmcq(ians,1);
    System.out.println("Enter 1 to Continue");
    icon=sn15.nextInt();
    System.out.println("%%%-You Scored "+imcq+" out of 5-%%%");
    System.out.println("Enter 1 to get to MCQ Menu");
    icon=sn15.nextInt();
    s9.onlinetest();
    }
  else if(onli==3)
    {
    u15.check3();
    }
  else
    {
   System.out.println("Wrong choice Try again");
    s9.onlinetest();
    }
 }
 int checkmcq(int qn,int wn)     //checkmcq function called ky onlinetest function.
 {
 if(qn==wn)
    {
    imc=imc+1;
    System.out.println("---Correct---");
    }
    else
    {
    System.out.println("---Wrong---");
    }
    return imc;
    }
 }




class admi extends ems     // admi class which also extends studen and have diif function which adminstrator needs.
 {
public void syllabus()throws IOException , FileNotFoundException     // syllabus function.
 {
 user u5 =new user();
 ems e4=new ems();
 e4.syllabus();
 u5.check2();
 }
public void datesheet()throws IOException , FileNotFoundException    // datesheet function.
 {
 user u7 =new user();
 ems e5 =new ems();
 e5.datesheet();
 u7.check2();
 }
void subsampleq()throws IOException , FileNotFoundException     // subsampleq function which is used by admin to upload sample questions.
 {
 user u9 = new user();
 System.out.println("---------Welcome to Sample Question Submission---------");
 FileOutputStream o=new FileOutputStream("sampleq.txt");
 Scanner sn8 =new Scanner(System.in);
 BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(o));
 System.out.println("Enter No of questions you want to Enter=");
 int nobw=sn8.nextInt();
 sn8.nextLine();
 for(int ij=0;ij<nobw;ij++)
     {
     System.out.println("Enter your question no."+(ij+1)+"=");
     String samp=sn8.nextLine();
     bw.write(samp);
     bw.newLine();
     }
 bw.close();
 System.out.println("Your Questions are Submitted enter 1 to get to Main Menu");
 int a9=sn8.nextInt();
 u9.check2();
 }
void getsolvedq()throws IOException , FileNotFoundException      // getsolvedq function which is used by admin to check question ans given by student.
 {
 System.out.println("---------Welcome to Get Solved Questions---------");
 FileInputStream o3 =new FileInputStream("sampleq.txt");
 FileInputStream o4 =new FileInputStream("solvedq.txt");
 BufferedReader br1=new BufferedReader(new InputStreamReader(o3));
 BufferedReader br2=new BufferedReader(new InputStreamReader(o4));
 Scanner sn10 =new Scanner(System.in);
 user u10=new user();
 String rea1=null,rea2=null;
 int i1=0,i2=0;
 System.out.println("Questions are=");
 while((rea1=br1.readLine())!=null)
      {
      i2=i2+1;
      System.out.println("Q"+i2+". "+rea1);
      }
 br1.close();
 System.out.println("Answers are=");
 while((rea2=br2.readLine())!=null)
      {
      i1=i1+1;
      System.out.println("Ans"+i2+". "+rea2);
      }
 br2.close();
 System.out.println("\nIf you have Checked the Ans then Enter 1 To get to Main Menu");
 int ch=sn10.nextInt();
 u10.check2();
 }
void submitr()throws IOException , FileNotFoundException     // submitr function used by admin to submit the marks of student and converts that to cgpa.
 {
 System.out.println("---------Welcome to Result Submission---------");
 user u14=new user();
 FileOutputStream o5=new FileOutputStream("result.txt");
 Scanner sn12= new Scanner(System.in);
 BufferedWriter br3=new BufferedWriter(new OutputStreamWriter(o5));
 System.out.println("Enter No of Students=");
 int stuno=sn12.nextInt();
 for(int nos=0;nos<stuno;nos++)
      {
      sn12.nextLine();
      System.out.println("Enter name of Student no."+(nos+1)+"=");
      String names=sn12.nextLine();
      System.out.println("Enter Regno of Student no."+(nos+1)+"=");
      long regns=sn12.nextLong();
      System.out.println("Enter Java Marks of Student no."+(nos+1)+"=");
      double marks1=sn12.nextDouble();
      System.out.println("Enter Python Marks of Student no."+(nos+1)+"=");
      double marks2=sn12.nextDouble();
      System.out.println("Enter Maths Marks of Student no."+(nos+1)+"=");
      double marks3=sn12.nextDouble();
      System.out.println("Enter English Marks of Student no."+(nos+1)+"=");
      double marks4=sn12.nextDouble();
      double total=marks1+marks2+marks3+marks4;
      double cgpa=total/40;
      String details=("RegNo= "+regns+" Name= "+names+" CGPA= "+cgpa);
      br3.write(details);
      br3.newLine();
      }
 br3.close();
 System.out.println("Your Ans is Submitted enter 1 to get to Main Menu");
 int a14=sn12.nextInt();
 u14.check2();
 }
}





class user    // user class from where are class awake.
{
void check()throws IOException , FileNotFoundException   // check function to get type of login and passcode and exit.
 {
 Scanner sn1 = new Scanner(System.in);
 user u1 =new user();
 System.out.println("-----------------Type of LOGIN----------------");
 System.out.println("Enter \n1. 'admin' for Adminstrator \n2. 'student' for Student LOGIN \n3. 'end' if you want to Exit:");
 String use=sn1.next();
 if(use.equals("admin"))
    {
       System.out.println("---------------Welcome Adminstrator--------------");
       u1.check2();
       }
       else if(use.equals("student"))
       {
       System.out.println("---------------Welcome Student---------------");
       u1.check3();
       }
       else if(use.equals("end"))
       {
       System.out.println("---Thank you for Using Examination Management System---");
       }
       else
       {
       System.out.println("--Wrong Choice Please Try Again--");
       u1.check();
    }
 }
void check2()throws IOException , FileNotFoundException  //check2 function to get and call all functions that admin can do.
 {
 Scanner sn2 = new Scanner(System.in);
 user u2 =new user();
 admi s3 = new admi();
 System.out.println("Enter 'admin' as PASSCODE=");
 String pass1=sn2.next();
 if(pass1.equals("admin"))
   {
     System.out.println("-------Welcome Adminstrator--------");
     System.out.println("Functions You Can Do=");
     System.out.println("1. Syllabus \n2. Datesheet \n3. Submit Sample Questions \n4. Get Solved Questions \n5. Update Result \n6. Go to Login Page");
     System.out.println("Give your Choice by numeric=");
     int a1=sn2.nextInt();
     if(a1==1)
     {
     s3.syllabus();
     }
     else if(a1==2)
     {
     s3.datesheet();
     }
     else if(a1==3)
     {
     s3.subsampleq();
     }
     else if(a1==4)
     {
     s3.getsolvedq();
     }
    else if(a1==5)
     {
    s3.submitr();
     }
     else if(a1==6)
     {
    u2.check();
     }
    else
     {
    System.out.println("Wrong choice You Type PASSCODE again");
    u2.check2();
     }
   }
  else
  {
  System.out.println("Wrong PASSCODE Please Try Again");
  u2.check2();
  }
 }
void check3()throws IOException , FileNotFoundException  //check3 function to get and call all function that studnet can do.
 {
 Scanner sn3 = new Scanner(System.in);
 studen s2 = new studen();
 user u3 =new user();
 System.out.println("Enter 'student' as PASSCODE=");
 String pass2=sn3.next();
 if(pass2.equals("student"))
   {
     System.out.println("--------Welcome Student--------");
     System.out.println("Functions You Can Do=");
     System.out.println("1. Syllabus \n2. Datesheet \n3. Online Test \n4. Get Sample Questions \n5. View Result \n6. Go to Login Page");
     System.out.println("Give your Choice by numeric=");
     int a1=sn3.nextInt();
     if(a1==1)
     {
     s2.syllabus();
     }
     else if(a1==2)
     {
     s2.datesheet();
     }
     else if(a1==3)
     {
     s2.onlinetest();
     }
     else if(a1==4)
     {
     s2.getsampleq();
     }
     else if(a1==5)
     {
     s2.getresult();
     }
     else if(a1==6)
     {
     u3.check();
     }
     else
     {
     System.out.println("Wrong choice You Type PASSCODE again");
     u3.check3();
     }
   }
   else
   {
   System.out.println("Wrong PASSCODE Please Try Again");
   u3.check3();
   }
 }
 public static void main(String... aa)throws IOException , FileNotFoundException
 {
 Scanner sn = new Scanner(System.in);
 user u =new user();
 System.out.println("%%%%%%%%%%%%%-Wellcome to Examination Management System-%%%%%%%%%%%%%%");
 u.check();
 }
}