public class Employee {
    private String employeeId ;
    private int employeeAge;
    private String employeeName;
    private String employeeAddress;
    private String employeeDepartment;

    public Employee(String employeeId, int employeeAge, String employeeName, String employeeAddress, String employeeDepartment) {
        this.employeeId = employeeId;
        this.employeeAge = employeeAge;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeDepartment = employeeDepartment;
    }

    public Employee() {
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public String employeeInfo(){
        return employeeId+","+employeeAge+","+employeeName+","+employeeAddress+","+employeeDepartment;
    }
    @Override
    public String toString() {
        return
                "employeeId : " + employeeId +
                ", employeeAge : " + employeeAge +
                ", employeeName : '" + employeeName +
                ", employeeAddress : '" + employeeAddress +
                ", employeeDepartment : '" + employeeDepartment
            ;
    }
}
