package factorymethod;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeInternTest {
    @Test
    public void mustReturnSalary() {
        EmployeeIntern employee = new EmployeeIntern();
        assertEquals(1500.0, employee.calculateSalary(), 0.0);
    }

    @Test
    public void mustReturnVacationDays() {
        EmployeeIntern employee = new EmployeeIntern();
        assertEquals(30, employee.calculateVacationDays());
    }
}