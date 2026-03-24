import java.util.*;

class HRMS {

    Map<Integer, Employee> employees = new HashMap<>();
    Map<Integer, String> attendance = new HashMap<>();
    Map<Integer, String> leaves = new HashMap<>();

    // Login
    boolean login(String user, String pass) {
        return user.equals("admin") && pass.equals("123");
    }

    // Add employee
    void addEmployee(Employee e) {
        employees.put(e.id, e);
        System.out.println("✅ Employee Added");
    }

    // View employees
    void viewEmployees() {
        for (Employee e : employees.values()) {
            System.out.println(e);
        }
    }

    // Update employee
    void updateEmployee(int id, String name) {
        if (employees.containsKey(id)) {
            employees.get(id).name = name;
            System.out.println("✅ Updated");
        } else {
            System.out.println("❌ Employee not found");
        }
    }

    // Delete employee
    void deleteEmployee(int id) {
        employees.remove(id);
        System.out.println("✅ Deleted");
    }

    // Attendance
    void markAttendance(int id, String status) {
        attendance.put(id, status);
        System.out.println("✅ Attendance marked");
    }

    void viewAttendance() {
        for (int id : attendance.keySet()) {
            System.out.println("EmpID: " + id + " -> " + attendance.get(id));
        }
    }

    // Leave
    void applyLeave(int id, String status) {
        leaves.put(id, status);
        System.out.println("✅ Leave Applied");
    }

    void viewLeave() {
        for (int id : leaves.keySet()) {
            System.out.println("EmpID: " + id + " -> " + leaves.get(id));
        }
    }

    // Search
    void search(int id) {
        if (employees.containsKey(id)) {
            System.out.println(employees.get(id));
        } else {
            System.out.println("❌ Not found");
        }
    }
}