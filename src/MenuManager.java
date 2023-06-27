import java.io.IOException;
import java.util.Scanner;

public class MenuManager {
    EmployeeManager employeeManager = new EmployeeManager();



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
            System.out.println(" 1. Show All Employee \n 2. Add New Employee \n 3. Update Employee \n 4. Show Employee Info \n 5. Delete Employee \n 6. Find Employee ( By ID )");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1 :
                    break;
                case 2 :
                    System.out.println("Input EmployeeId : ");
                    int employeeId  =Integer.parseInt(scanner.nextLine());
                    System.out.println("Input Employee Age : ");
                    int employeeAge = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input Employee Name :");
                    String employeeName = scanner.nextLine();
                    System.out.println("Input Employee Address : ");
                    String employeeAddress = scanner.nextLine();
                    System.out.println("Input Employee Department : ");
                    String employeeDepartment = scanner.nextLine();
                    Employee newEmployee = new Employee(employeeId,employeeAge,employeeName,employeeAddress,employeeDepartment);
                    this.employeeManager.addEmployee(newEmployee);
                    break;
                case 6 :
                    System.out.println("Input ID User :");
                    int id = Integer.parseInt(scanner.nextLine());
                    this.employeeManager.findEmployeeById(id);
//
            }

        }
    }

    public void showDepartmentMenu(){
        System.out.println("1. Show All Department \n 2. Add New Department \n 3. Update Department \n 4. Show Department Info \n 5. Delete Department \n 6. Find Department ( By ID )");
    }

}
