import java.util.ArrayList;

public class Department {
    String departmentId ;
    String departmentName;
    ArrayList<Employee> employeeList;
    private EmployeeManager employeeManager  ;

    public Department(String departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employeeManager = new EmployeeManager();
        this.employeeList = (ArrayList<Employee>) employeeManager.employeeList.clone();

    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    public String departmentInfo(){
        return departmentId+','+departmentName;
    }

}
