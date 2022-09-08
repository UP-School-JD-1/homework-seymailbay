package SiraDisiDurumYonetimi;

public class SalaryPaidOnBankException extends Exception{

    public SalaryPaidOnBankException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Salary paid on bank ";
    }
}
