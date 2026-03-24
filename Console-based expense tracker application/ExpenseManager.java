import java.util.*;

class ExpenseManager {

    List<Expense> expenses = new ArrayList<>();
    Set<String> categories = new HashSet<>();
    int counter = 1;

    // Add Expense
    void addExpense(String date, double amount, String category, String desc) {
        categories.add(category);
        expenses.add(new Expense(counter++, date, amount, category, desc));
        System.out.println("✅ Expense Added");
    }

    // View Expenses
    void viewExpenses() {
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    // Delete
    void deleteExpense(int id) {
        expenses.removeIf(e -> e.id == id);
        System.out.println("✅ Deleted");
    }

    // Update
    void updateExpense(int id, double amount) {
        for (Expense e : expenses) {
            if (e.id == id) {
                e.amount = amount;
                System.out.println("✅ Updated");
                return;
            }
        }
        System.out.println("❌ Not found");
    }

    // Filter by Category
    void filterCategory(String cat) {
        for (Expense e : expenses) {
            if (e.category.equalsIgnoreCase(cat)) {
                System.out.println(e);
            }
        }
    }

    // Summary
    void totalExpense() {
        double sum = 0;
        for (Expense e : expenses) {
            sum += e.amount;
        }
        System.out.println("💰 Total Expense: " + sum);
    }

    // Categories
    void showCategories() {
        System.out.println("📂 Categories:");
        for (String c : categories) {
            System.out.println(c);
        }
    }
}