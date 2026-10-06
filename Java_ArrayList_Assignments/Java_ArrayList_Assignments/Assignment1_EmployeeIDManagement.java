import java.util.ArrayList;

public class Assignment1_EmployeeIDManagement {
    public static void main(String[] args) {
        ArrayList<Integer> employeeIds = new ArrayList<>();

        employeeIds.add(1001);
        employeeIds.add(1002);
        employeeIds.add(1003);
        employeeIds.add(1004);
        employeeIds.add(1005);
        employeeIds.add(1006);
        employeeIds.add(1007);
        employeeIds.add(1008);

        employeeIds.add(3, 5001);
        employeeIds.set(5, 9001);
        employeeIds.remove(2);

        System.out.println("Employee ID at index 4: " + employeeIds.get(4));
        System.out.println("Total Employee IDs: " + employeeIds.size());
        System.out.println("Final Employee ID List: " + employeeIds);
    }
}
