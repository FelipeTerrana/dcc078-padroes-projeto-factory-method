package factorymethod;

public class EmployeeSoftwareDeveloper implements IEmployee {
    @Override
    public double calculateSalary() {
        return 10000;
    }

    @Override
    public int calculateVacationDays() {
        return 15;
    }
}
