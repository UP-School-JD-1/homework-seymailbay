package SiradisiDurumYont;

import SiraDisiDurumYonetimi.Engineer;
import SiraDisiDurumYonetimi.Manager;

public class Main {
    public static void checkSalary(double salary) throws SalaryPaidOnBankException {

        if (salary > 7000) {

            throw new SalaryPaidOnBankException("Salary Paid on Bank");

        } else {

            System.out.println("Your salary is paid in cash");
        }
    }


    public static void main(String[] args) {

        SiraDisiDurumYonetimi.Engineer engineer1 = new SiraDisiDurumYonetimi.Engineer("Kemal", 20, 200);
        SiraDisiDurumYonetimi.Engineer engineer2 = new Engineer("Asya", 15, 150);
        SiraDisiDurumYonetimi.Manager manager1 = new Manager("Kezban", 20, 5000);

        double salary = engineer2.calculateSalary();




        try {
            checkSalary(salary);

        } catch (SalaryPaidOnBankException e) {
            System.out.println(e);
        }

    }

}
