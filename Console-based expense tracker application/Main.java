import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseManager em = new ExpenseManager();

        while (true) {
            System.out.println("\n1.Add 2.View 3.Delete 4.Update");
            System.out.println("5.Filter 6.Total 7.Categories 8.Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Date: ");
                    String d = sc.next();
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    System.out.print("Category: ");
                    String c = sc.next();
                    System.out.print("Description: ");
                    String desc = sc.next();

                    em.addExpense(d, amt, c, desc);
                    break;

                case 2:
                    em.viewExpenses();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    em.deleteExpense(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("New Amount: ");
                    double newAmt = sc.nextDouble();
                    em.updateExpense(id, newAmt);
                    break;

                case 5:
                    System.out.print("Enter Category: ");
                    em.filterCategory(sc.next());
                    break;

                case 6:
                    em.totalExpense();
                    break;

                case 7:
                    em.showCategories();
                    break;

                default:
                    return;
            }
        }
    }
}