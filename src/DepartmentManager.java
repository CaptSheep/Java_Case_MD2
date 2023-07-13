import java.io.IOException;
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

    public Department findDepartmentById(String id){
        for(Department item : this.departmentList){
            if(item.getDepartmentId().equals(id)){
                return item;
            }
        }
        return null;
    }

    public Department findDepartmentByName(String departmentName){
        for(Department item : this.departmentList){
            if(item.getDepartmentName().equals(departmentName)){
                return item;
            }
        }
        return null;
    }

    public void addDepartment(){
      try{
          System.out.println("Input Department ID :");
          String departmentId = scanner.nextLine();
          Department findDepartment = this.findDepartmentById(departmentId);
          if(findDepartment == null){
              System.out.println("Input Department Name :");
              String departmentName = scanner.nextLine();
              Department newDepartment = new Department(departmentId,departmentName);
              this.departmentList.add(newDepartment );
              this.fileManager.writeFileDepartment(this.departmentList);
          }
          else {
              System.out.println("Department Existed");
          }

      }
      catch (Exception e){
          throw new RuntimeException(e);
      }

    }

    public void updateDepartment() throws IOException {
        System.out.println("Input Department ID : ");
        String departmentId = scanner.nextLine();
        Department findDepartment = this.findDepartmentById(departmentId);
        if(findDepartment != null){
            System.out.println("Input Department Name : ");
            String departmentName = scanner.nextLine();
            findDepartment.setDepartmentName(departmentName);
            System.out.println("Update Department with ID : %s success".formatted(departmentId));
            this.fileManager.writeFileDepartment(this.departmentList);

        }
        else {
            System.out.println("Can not find this Department");
        }
    }

    public void removeDepartment() throws IOException {
        System.out.println("Input Department ID :");
        String departmentId = scanner.nextLine();
        Department findDepartment = this.findDepartmentById(departmentId);
        if(findDepartment != null){
            this.departmentList.remove(findDepartment);
            this.fileManager.writeFileDepartment(this.departmentList);
        }
        else {
            System.out.println("Can not find this Department with ID : %s".formatted(departmentId));
        }
    }
}
