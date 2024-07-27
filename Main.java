public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ahmet", 2000, 50, 1999);
        Employee e2 = new Employee("Melike", 3000, 40, 2010);
        Employee e3 = new Employee("Okan", 2900, 45, 2015);

        e1.printInfo();
        e2.printInfo();
        e3.printInfo();
    }
}
