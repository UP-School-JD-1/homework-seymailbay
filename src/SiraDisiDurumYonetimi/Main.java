package SiraDisiDurumYonetimi;

public class Main {

    public static void main(String[] args) {


        Manager manager1 = new Manager("Manager", "Seyma", 12);

        Engineer engineer1 = new Engineer("Engineer", "Nejla", 23);


        try{

            double salary = manager1.calculateSalary();
            System.out.println(manager1.getName() + " " + salary);
        }

        catch (Exception e){

            System.out.print(e.getMessage());
        }


    }
}
