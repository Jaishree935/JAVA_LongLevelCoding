class Employee {
    int id;
    String name, dept, designation, contact;

    Employee(int id, String name, String dept, String designation, String contact) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.designation = designation;
        this.contact = contact;
    }

    public String toString() {
        return id + " | " + name + " | " + dept + " | " + designation + " | " + contact;
    }
}