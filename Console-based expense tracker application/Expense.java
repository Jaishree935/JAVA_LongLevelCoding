class Expense {
    int id;
    String date, category, description;
    double amount;

    Expense(int id, String date, double amount, String category, String description) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.category = category;
        this.description = description;
    }

    public String toString() {
        return id + " | " + date + " | " + amount + " | " + category + " | " + description;
    }
}