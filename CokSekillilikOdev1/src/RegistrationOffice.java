import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class RegistrationOffice {

	public RegistrationOffice() {
		super();
		// TODO Auto-generated constructor stub
	}

	Random rand = new Random();
	int no = rand.nextInt(500);

	public Student getAStudent() {

		Student st = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please select the status of student ");
		System.out.println(
				"Press 1 = Undergraduate Student \n Press 2 = Master Student \n Press 3 = Phd Student \n Press 4 = Vocational Student ");
		int studentType = sc.nextInt();
		System.out.println("Please enter the name of student: ");
		String name = sc.next();
		System.out.println("Please enter the major of student: ");
		String major = sc.next();
		String advisor, thesis;

		switch (studentType) {
		case 1:
			System.out.println("Please enter minor: ");
			String minor = sc.next();
			st = new UnderGraduateStudent(no, name, 2022, new Date(), major, minor);
		case 2:
			st = new MasterStudent(no, name, 2022, new Date(), major);
		case 3:
			System.out.println("Status of qualifying exam taken: \n Enter \"True\" for Yes \n Enter \"False\" for No ");
			boolean qualifyingExamTaken = sc.nextBoolean();
			st = new PhdStudent(no, name, 2022, new Date(), major, qualifyingExamTaken);
		case 4:
			st = new VocationalStudent(no, name, 2022, new Date(), major);

		default:
			System.out.println("Please enter given numbers");
		}

		return st;
	}

	
