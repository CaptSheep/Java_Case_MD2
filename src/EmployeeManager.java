import java.io.IOException;
import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employeeList ;
    private FileManager fileManager;

    public EmployeeManager() {
        this.employeeList = new ArrayList<>();
        this.fileManager = new FileManager();
    }

    public void addEmployee(Employee newEmployee) throws IOException {
        this.employeeList.add(newEmployee);
        this.fileManager.writeFileEmployee(this.employeeList);
    }
    public void showAllEmployee(){
        for(Employee item : this.employeeList){
            System.out.println(item);
        }
    }
    public void findEmployeeById(int id){
        for(int i  = 0 ; i < this.employeeList.size();i++){
            if(this.employeeList.get(i).getEmployeeId() == id){
                System.out.println(this.employeeList.get(i).toString());
            }
            else {
                System.out.println("Can not find this Employee");
            }
        }
    }

    public void updateEmployee(){

    }


}
