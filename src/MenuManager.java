import java.io.IOException;
import java.util.Scanner;

public class MenuManager {
    EmployeeManager employeeManager = new EmployeeManager();
    DepartmentManager departmentManager = new DepartmentManager();



    public void showLoginMenu() {
        System.out.println(" Input your choices : \n 1. Login \n 2. Register"
        );
    }
    public void showMainMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(" 1. Show All Employee Menu \n 2. Show All Department Menu ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1 :
                    this.showEmployeeMenu();
                    break;
                case 2 :
                    this.showDepartmentMenu();
                    break;

            }

        }

    }

    public void showEmployeeMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(" 1. Show All Employee \n 2. Add New Employee \n 3. Update Employee \n 4. Show Employee Info \n 5. Delete Employee \n 6. Back");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> this.employeeManager.showAllEmployee();
                case 2 -> this.employeeManager.addEmployee();
                case 3 -> this.employeeManager.updateEmployee();
                case 4 -> this.employeeManager.getEmployeeInfo();
                case 5 -> this.employeeManager.deleteEmployeeById();
                case 6 -> this.showMainMenu();
            }

        }
    }

    public void showDepartmentMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. Show All Department \n 2. Add New Department \n 3. Update Department \n 4. Show Department Info \n 5. Delete Department \n 6. Back");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> this.departmentManager.showAllDepartment();
                case 2 -> this.departmentManager.addDepartment();
                case 3 -> this.departmentManager.updateDepartment();
                case 4 -> {
                    System.out.println("Input Department ID :");
                    String departmentId = scanner.nextLine();
                    this.departmentManager.findDepartmentById(departmentId);
                }
                case 5 -> this.departmentManager.removeDepartment();
                case 6 -> this.showMainMenu();
            }
        }
    }

}
