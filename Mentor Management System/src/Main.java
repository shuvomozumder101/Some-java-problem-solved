import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter No Of Advisor : ");
        int NO_OF_ADVISOR = input.nextInt();
        Advisor[] aobj = new Advisor[NO_OF_ADVISOR];
        
        for (int i = 0; i < NO_OF_ADVISOR; i++) {
            System.out.println(".....Enter Advisor Information.....");
            aobj[i] = new Advisor();
            aobj[i].inputAll();
        }
        
        System.out.println("Enter No Of Student : ");
        int NO_OF_STUDENT = input.nextInt();
        Student[] sobj = new Student[NO_OF_STUDENT];
        
        for (int i = 1; i < NO_OF_STUDENT; i++) {
            System.out.println(".....Enter Student Information.....");
            sobj[i] = new Student();
            sobj[i].inputID();
            sobj[i].inputNAME();
            sobj[i].inputContactNo();
            sobj[i].inputAdvisorID();
            
            for (int j = 1; j < NO_OF_ADVISOR; j++) {
                while (aobj[j].getID().equals(sobj[i].getAdvisorID())) {
                    if (aobj[j].cheackNoOfStudent()) {
                        aobj[j].calculateNoOfStudent();
                        break;
                    } else {
                        System.out.println("Sorry, This Advisor Is Not Available.Try Another");
                        sobj[i].inputAdvisorID();
                        j = 0;
                        break;
                    }
                }
            }
            sobj[i].inputAbsentDays();
            sobj[i].inputCGPA();
            sobj[i].inputPAID();
            sobj[i].inputPAYBLE();
        }
        System.out.println("Student ID ANd Due Amount ....");
        
        for (int i = 0; i < NO_OF_ADVISOR; i++) {
            for (int j = 0; j < NO_OF_STUDENT; j++) {
                if (sobj[j].getAdvisorID().equals(aobj[i].getID())) {
                    sobj[j].printID();
                    aobj[i].ShowDue(sobj[j].getPAYBLE() - sobj[j].getPAID());
                }
            }
        }
        System.out.println("Low CGPA Students ID.....");
        
        for (int i = 0; i < NO_OF_ADVISOR; i++) {
            for (int j = 0; j < NO_OF_STUDENT; j++) {
                if (sobj[j].getAdvisorID().equals(aobj[i].getID())) {
                    if (aobj[i].ShowLowCGPA(sobj[j].getCGPA())) {
                        sobj[j].printID();
                    }
                }
            }
        }
        System.out.println("All Absent Student Names ....");
        
        for (int i = 0; i < NO_OF_ADVISOR; i++) {
            for (int j = 0; j < NO_OF_STUDENT; j++) {
                if (sobj[j].getAdvisorID().equals(aobj[i].getID())) {
                    if (aobj[i].ShowAbsentNames(sobj[j].getAbsentDays())) {
                        sobj[j].printNAME();
                    }
                }
            }
        }

    }

}
