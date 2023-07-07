import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    private final ArrayList<Employee> employeeList;
    private final FileManager fileManager;
    private final Scanner scanner;

    public EmployeeManager() {
        this.employeeList = new ArrayList<>();
        this.fileManager = new FileManager();
        this.scanner = new Scanner(System.in);
        this.fileManager.readFromFileEmployee(this.employeeList);

    }

    public void showAllEmployee() {
        for (Employee item : this.employeeList) {
            if (this.employeeList.size() == 0) {
                System.out.println("Empty List");
            } else {
                System.out.println(item.toString());

            }
        }
    }

    public Employee findEmployeeById(String id) {
        for (Employee item : this.employeeList) {
            if (item.getEmployeeId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public void addEmployee() throws IOException {
        try {
            System.out.println("Input EmployeeId : ");
            String employeeId = scanner.nextLine();
            Employee findEmployee = this.findEmployeeById(employeeId);
            if (findEmployee == null) {
                System.out.println("Input Employee Age : ");
                int employeeAge = Integer.parseInt(scanner.nextLine());
                System.out.println("Input Employee Name :");
                String employeeName = scanner.nextLine();
                System.out.println("Input Employee Address : ");
                String employeeAddress = scanner.nextLine();
                System.out.println("Input Employee Department : ");
                String employeeDepartment = scanner.nextLine();
                Employee newEmployee = new Employee(employeeId, employeeAge, employeeName, employeeAddress, employeeDepartment);
                this.employeeList.add(newEmployee);
                this.fileManager.writeFileEmployee(this.employeeList);
            } else {
                System.out.println("Employee ID Existed");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public void updateEmployee() throws IOException {
        System.out.println("Input Employee ID : ");
        String employeeID = scanner.nextLine();
        Employee findEmployee = this.findEmployeeById(employeeID);
        if (findEmployee != null) {
            System.out.println("Input Employee Age : ");
            int employeeAge = Integer.parseInt(scanner.nextLine());
            System.out.println("Input Employee Name :");
            String employeeName = scanner.nextLine();
            System.out.println("Input Employee Address : ");
            String employeeAddress = scanner.nextLine();
            System.out.println("Input Employee Department : ");
            String employeeDepartment = scanner.nextLine();
            findEmployee.setEmployeeAge(employeeAge);
            findEmployee.setEmployeeName(employeeName);
            findEmployee.setEmployeeAddress(employeeAddress);
            findEmployee.setEmployeeDepartment(employeeDepartment);
            System.out.println("Update Success");
            this.fileManager.writeFileEmployee(this.employeeList);
        } else {
            System.out.println("Can not find this Employee");
        }

    }

    public void deleteEmployeeById(){
        System.out.println("Input Employee ID : ");
        String employeeId  =scanner.nextLine();
        Employee findEmployee = this.findEmployeeById(employeeId);
        if(findEmployee !=  null){
            this.employeeList.remove(employeeId);
            System.out.println("Delete Employee with ID %s success".formatted(employeeId));
        }
        else {
            System.out.println("Can not find this Employee with ID %s".formatted(employeeId));
        }
    }


}
