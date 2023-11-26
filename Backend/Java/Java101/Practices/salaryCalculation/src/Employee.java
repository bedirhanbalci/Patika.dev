public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - this.hireYear;

        if (yearsWorked < 10) {
            return this.salary * 0.05;
        } else if (yearsWorked > 9 && yearsWorked < 20) {
            return this.salary * 0.10;
        } else if (yearsWorked > 19) {
            return this.salary * 0.15;
        } else {
            return 0;
        }
    }

    void toPrint() {
        System.out.println("Adı Soyadı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Haftalık çalışma saati : " + this.workHours);
        System.out.println("İşe başlangıç yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus  : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + (this.salary + raiseSalary() + bonus() - tax()));
    }
}