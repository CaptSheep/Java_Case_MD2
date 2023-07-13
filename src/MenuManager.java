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
            switch (choice){
                case 1 :
                    this.employeeManager.showAllEmployee();
                    break;
                case 2 :
                    this.employeeManager.addEmployee();
                    break;
                case 3 :
                    this.employeeManager.updateEmployee();
                    break;
                case 4 :
                    System.out.println("Input ID Employee :");
                    String id =scanner.nextLine();
                    this.employeeManager.findEmployeeById(id);
                    break;
                case 5 :
                    this.employeeManager.deleteEmployeeById();
                    break;
                case 6 :
                    this.showMainMenu();
                    break;
            }

        }
    }

    public void showDepartmentMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. Show All Department \n 2. Add New Department \n 3. Update Department \n 4. Show Department Info \n 5. Delete Department \n 6. Back");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1 :
                    this.departmentManager.showAllDepartment();
                    break;
                case 2 :
                    this.departmentManager.addDepartment();
                    break;
                case 3 :
                    this.departmentManager.updateDepartment();
                    break;
                case 4 :
                    System.out.println("Input Department ID :");
                    String departmentId = scanner.nextLine();
                    this.departmentManager.findDepartmentById(departmentId);
                    break;
                case 5 :
                    this.departmentManager.removeDepartment();
                    break;
                case 6 :
                    this.showMainMenu();
                    break;
            }
        }
    }

}
