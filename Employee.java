public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus = 0;
    int currentYear = 2021;
    double raiseSalary;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax() {
        if (salary < 1000) {
            this.tax = 0;
        } else {
            this.tax = this.salary * 0.03;
        }
        System.out.println("Vergi: " + this.tax);
    }

    void bonus() {
        if (this.workHours > 40) {
            this.bonus = (this.workHours - 40) * 30;
        }
        System.out.println("Bonus: " + this.bonus);
    }

    void raiseSalary() {
        int yearCount = this.currentYear - this.hireYear;
        if (yearCount < 10) {
            this.raiseSalary = this.salary * 0.05;
        } else if ((yearCount > 9) && (yearCount < 20)) {
            this.raiseSalary = this.salary * 0.10;
        } else {
            this.raiseSalary = this.salary * 0.15;
        }
        System.out.println("Maaş artışı: " + this.raiseSalary);
    }

    void printInfo() {
        System.out.println("--------");
        System.out.println("Çalışanın ismi: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        tax();
        bonus();
        raiseSalary();
        System.out.print("Vergi ve bonuslar ile birlikte maaş: ");
        System.out.println(this.salary - this.tax + this.bonus);
        System.out.print("Toplam maaş: ");
        System.out.println(this.salary - this.tax + this.bonus + this.raiseSalary);
    }
}
