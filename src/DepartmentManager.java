import java.util.ArrayList;
import java.util.Scanner;

public class DepartmentManager {
    private final ArrayList<Department> departmentList;
    private final FileManager fileManager;
    private final Scanner scanner;
    public DepartmentManager() {
        this.departmentList = new ArrayList<>();
        this.fileManager = new FileManager();
        this.scanner = new Scanner(System.in);

    }
}
