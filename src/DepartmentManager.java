import java.util.ArrayList;
import java.util.Scanner;

public class DepartmentManager {
    private  ArrayList<Department> departmentList;
    private final FileManager fileManager;
    private final Scanner scanner;
    private EmployeeManager employeeManager  ;
    private ArrayList<Employee> employeeList ;

    public DepartmentManager() {
        this.departmentList = new ArrayList<>();
        this.fileManager = new FileManager();
        this.scanner = new Scanner(System.in);
        this.employeeManager = new EmployeeManager();
        this.employeeList = (ArrayList<Employee>) employeeManager.employeeList.clone();

    }
    public void showAllDepartment() {
        for (Department item : this.departmentList) {
            if (this.departmentList.size() == 0) {
                System.out.println("Empty List");
            } else {
                System.out.println(item.toString());

            }
        }
    }
    public void listEmployee(){
        for(Employee item : this.employeeList){
            System.out.println(item);
        }
    }
}
