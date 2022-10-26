package factorymethod;

public class EmployeeFactory {
    public static IEmployee getEmployee(String employee) {
        Class classInstance = null;
        Object object = null;
        try {
            classInstance = Class.forName("factorymethod.Employee" + employee);
            object = classInstance.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Funcionário inexistente");
        }
        if (!(object instanceof IEmployee)) {
            throw new IllegalArgumentException("Funcionário inválido");
        }
        return (IEmployee) object;
    }
}
