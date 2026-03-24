import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HRMS h = new HRMS();

        // Login
        System.out.print("Username: ");
        String u = sc.next();
        System.out.print("Password: ");
        String p = sc.next();

        if (!h.login(u, p)) {
            System.out.println("❌ Invalid Login");
            return;
        }

        while (true) {
            System.out.println("\n1.Add 2.View 3.Update 4.Delete");
            System.out.println("5.Attendance 6.View Attendance");
            System.out.println("7.Leave 8.View Leave");
            System.out.println("9.Search 10.Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Dept: ");
                    String dept = sc.next();
                    System.out.print("Role: ");
                    String role = sc.next();
                    System.out.print("Contact: ");
                    String contact = sc.next();

                    h.addEmployee(new Employee(id, name, dept, role, contact));
                    break;

                case 2:
                    h.viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    h.updateEmployee(sc.nextInt(), sc.next());
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    h.deleteEmployee(sc.nextInt());
                    break;

                case 5:
                    System.out.print("ID: ");
                    int aid = sc.nextInt();
                    System.out.print("Status (Present/Absent): ");
                    String st = sc.next();
                    h.markAttendance(aid, st);
                    break;

                case 6:
                    h.viewAttendance();
                    break;

                case 7:
                    System.out.print("ID: ");
                    int lid = sc.nextInt();
                    System.out.print("Leave Status: ");
                    String ls = sc.next();
                    h.applyLeave(lid, ls);
                    break;

                case 8:
                    h.viewLeave();
                    break;

                case 9:
                    System.out.print("Enter ID: ");
                    h.search(sc.nextInt());
                    break;

                default:
                    return;
            }
        }
    }
}