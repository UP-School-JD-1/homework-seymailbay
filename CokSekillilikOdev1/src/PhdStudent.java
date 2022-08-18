import java.util.Date;

public class PhdStudent extends GraduateStudent {

	protected boolean qualifyingExamTaken;

	public PhdStudent(int no, String name, int year, Date dob, String major, boolean qualifyingExamTaken) {
		super(no, name, year, dob, major);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	public void writePaper() {
		System.out.println(getName() + " writing paper..");
	}

	@Override
	public void writeThesis() {
		System.out.println(getName() + " is writing thesis " + getThesis());
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println(getName() + " is meeting with advisor " + getAdvisor());
	}

	@Override
	public void study() {
		System.out.println(getName());
		super.study();
	}

	@Override
	public void register() {
		System.out.println(getName());
		super.register();
	}

	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

}