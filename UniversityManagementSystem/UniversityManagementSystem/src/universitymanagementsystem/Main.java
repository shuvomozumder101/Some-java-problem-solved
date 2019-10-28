package universitymanagementsystem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No Of Teacher : ");
        int NoOfTeacher = input.nextInt();
    /*    
        System.out.println("Enter No Of Staff : ");
        int NoOfStaff = input.nextInt();
    */    
        System.out.println("Enter No Of Course : ");
        int NoOfCourse = input.nextInt();
        System.out.println("Enter No Of Student : ");
        int NoOfStudent = input.nextInt();
    /*    
        System.out.println(".........Staff Information:.......");
        Staff[] staff=new Staff[NoOfStaff];
        for (int i = 0; i < NoOfStaff; i++) {
            staff[i]=new Staff();
            staff[i].input_All();
        }
    */    
        System.out.println(".........Course Information:.......");
        Course[] course = new Course[NoOfCourse];
        for (int i = 0; i < NoOfCourse; i++) {
            course[i]=new Course();
            course[i].input_All();
        }
        System.out.println(".........Teacher Information:.......");
        Teacher[] teacher=new Teacher[NoOfTeacher];
        for (int i = 0; i < NoOfTeacher; i++) {
            teacher[i]=new Teacher();
            teacher[i].input_All();
            System.out.println("Enter No Of Course Assign : ");
            int n =input.nextInt();
            input.nextLine();
            for (int j = 0; j < n; j++) {
                System.out.println(""+(j+1)+". Course COde : ");
                String CourseCode = input.nextLine();
                for (int k = 0; k < NoOfCourse; k++) {
                    if(CourseCode.equalsIgnoreCase(course[k].get_CourseCode())){
                        teacher[i].calculate_CourseCrdit(course[k].get_CourseCredit());
                    }
                }
            }
        }
        System.out.println(".........Student Information:.......");
        Student[] student=new Student[NoOfStudent];
        for (int i = 0; i < NoOfStudent; i++) {
            student[i]=new Student(NoOfCourse);
            student[i].input_All();
            for (int j = 0; j < NoOfCourse; j++) {
                student[i].input_EnrolledCourse(course[j]);
                course[j].calculate_CourseCounter();
            }
        }
    /*
        //Print All Teacher Information
        System.out.println(".........Teacher Information:.......");
        for (int i = 0; i < NoOfTeacher; i++) {
            teacher[i].print_All();
        }
        //Print All Staff Information
        System.out.println(".........Staff Information:.......");
        for (int i = 0; i < NoOfStaff; i++) {
            staff[i].print_All();
        }
        //Print All Course Information
        System.out.println(".........Course Information:.......");
        for (int i = 0; i < NoOfCourse; i++) {
            course[i].print_All();
        }
        //Print All Student Information
        System.out.println(".........Student Information:.......");
        for (int i = 0; i < NoOfStudent; i++) {
            student[i].print_All();
        }
    */
        while(true) {
            System.out.println("Enter Course Code For Searching Enrolled Student No : ");
            String CourseCode=input.nextLine();
            for (int j = 0; j < NoOfCourse; j++) {
                if(CourseCode.equalsIgnoreCase(course[j].get_CourseCode())){
                    System.out.println("Course Name : "+course[j].get_CourseTitle());
                    System.out.println("No Of Student Enrolled : "+course[j].get_CourseCounter());
                }
            }
            System.out.println("Do You Want To Search Again (Y/N): ");
            if(input.nextLine().equalsIgnoreCase("N"))break;
        }
        while(true) {
            System.out.println("Enter Teacher ID For Searching Credit Hour : ");
            String TeacherID=input.nextLine();
            for (int j = 0; j < NoOfTeacher; j++) {
                if(TeacherID.equalsIgnoreCase(teacher[j].get_EmployeeID())){
                    System.out.println("Teacher Name : "+teacher[j].get_Firstname()+" "+teacher[j].get_Lastname());
                    System.out.println("Credit Hour : "+teacher[j].get_CourseCredit());
                }
            }
            System.out.println("Do You Want To Search Again (Y/N): ");
            if(input.nextLine().equalsIgnoreCase("N"))break;
        }
    }
}
