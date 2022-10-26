package factorymethod;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {
    @Test
    public void mustInstanceSoftwareDeveloper() {
        IEmployee employee = EmployeeFactory.getEmployee("SoftwareDeveloper");
        assertTrue(employee instanceof EmployeeSoftwareDeveloper);
    }

    @Test
    public void mustInstanceIntern() {
        IEmployee employee = EmployeeFactory.getEmployee("Intern");
        assertTrue(employee instanceof EmployeeIntern);
    }

    @Test
    public void mustThrowInvalidEmployee() {
        try {
            IEmployee employee = EmployeeFactory.getEmployee("Tester");
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Funcionário inexistente", e.getMessage());
        }
    }
}