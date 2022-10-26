package factorymethod;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeSoftwareDeveloperTest {
    @Test
    public void mustReturnSalary() {
        EmployeeSoftwareDeveloper employee = new EmployeeSoftwareDeveloper();
        assertEquals(10000.0, employee.calculateSalary(), 0.0);
    }

    @Test
    public void mustReturnVacationDays() {
        EmployeeSoftwareDeveloper employee = new EmployeeSoftwareDeveloper();
        assertEquals(15, employee.calculateVacationDays());
    }
}