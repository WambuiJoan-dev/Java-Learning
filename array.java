
    class Student

    {
        int rollno;
        String name;
        int marks;
    }

public class Array {

public static void main ( String a[]) {

    Student s1 = new Student();
    s1.rollno = 1;
    s1.name = "Navin";
    s1.marks = 88; 

    Student s2 = new Student();
    s2.rollno = 2;
    s2.name = "Harsh";
    s2.marks = 67; 

    Student s3 = new Student();
    s3.rollno = 3;
    s3.name = "Kiran";
    s3.marks = 97; 

    

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for (int i=0; i<students.length; i++)
    {
        System.out.println(students[i].name + " : " + students[i].marks + " : " + students[i].rollno);
    }

    // {int nums[] = new int[4];
    //     nums[0] = 4;
    //     nums[1] = 5;

    // nums[3] = 6;

    // for(int i = 0; i<4; i++)

    // System.out.println(nums[i]);

    // int nums [] [] = new int [3] [4];
    // int random = (int) Math.random() * 100; 
    // for (int i=0; i<3; i++)
    // {
    //     for (int j=0; j<4; j++)
    //     {
    //         System.out.print(nums[i][j] + " ");
    //     }

    //     System.out.println();
    // }



}

}
