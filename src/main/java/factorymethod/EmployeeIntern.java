package factorymethod;

public class EmployeeIntern implements IEmployee {
    @Override
    public double calculateSalary() {
        return 1500;
    }

    @Override
    public int calculateVacationDays() {
        return 30;
    }
}
