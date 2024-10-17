package maranan; import java.util.Scanner;

public class main1 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
		
Scanner input = new Scanner(System.in);
	
double q1, q2, q3, qt, qpct;
double mp1, mp2, mp3, mpt, mpct;
	
	
	
	

System.out.println("SIMPLE GRADING SYSTEM");
System.out.println("QUIZZES 40%");
System.out.println("Q1: ");
q1 = input.nextDouble();
System.out.println("Q2: ");
q2 = input.nextDouble();
System.out.println("Q3: ");
q3 = input.nextDouble();
qt = (q1+q2+q3)/3;
System.out.println("QT: " + qt);
qpct = (qt) * .40;
System.out.println("Q%: "+ qpct);
System.out.println("------------------: ");
	
System.out.println("MACHINE PROBLEMS: 60%");

System.out.println("MP1: ");
mp1 = input.nextDouble();
System.out.println("MP2: ");
mp2 = input.nextDouble();
System.out.println("MP3: ");
mp3 = input.nextDouble();
mpt = (mp1+mp2+mp3)/3;
System.out.println("MPT: " + mpt);
mpct = mpt * .60;
System.out.println("mpt%:  "+mpct);
	
	
	
	
    }
}