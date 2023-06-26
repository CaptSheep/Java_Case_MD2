import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employeeList ;

    public EmployeeManager() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee newEmployee){
        this.employeeList.add(newEmployee);

    }
}
