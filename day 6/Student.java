/*Create a class that captures students. Each student has a first name, last name, class year, and 
major. Create two examples of students.*/
class Student
{
   
    
    String fname;
    String lname;
    int year;
    String major;
}

    class DemoStudent{
        public static void main(String args[])
        {
            Student s1=new Student();
            s1.fname="Siddhesh";
            s1.lname="Yashwante";
            s1.year=4;
            s1.major="CSE";
            Student s2=new Student();
            s2.fname="abc";
            s2.lname="exy";
            s2.year=4;
            s2.major="CSE";
            System.out.println("Student 1 details"+s1.fname,s1.lname, s1.year,s1.major);
        }

    }
    



    
