package SiraDisiDurumYonetimi;

public class Manager extends Employee {

    public Manager(String department, String name, int no) {
        super(department, name, no);
    }

    @Override
    public String getDepartment() {
        return getDepartment();
    }

    @Override
    public void setDepartment(String department) {
        super.setDepartment(department);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getNo() {
        return super.getNo();
    }

    @Override
    public void setNo(int no) {
        super.setNo(no);
    }

    @Override
    public int calculateSalary() {
        return BASE_SALARY * 3;
    }
}
