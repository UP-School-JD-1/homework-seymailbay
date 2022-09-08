package SiraDisiDurumYonetimi;

public class Employee {

    private String department;
    private String name;
    private int no;

    public static final int BASE_SALARY = 4000;


    public Employee(String department, String name, int no) {
        this.department = department;
        this.name = name;
        this.no = no;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int calculateSalary() {

        return 0;
    }
}