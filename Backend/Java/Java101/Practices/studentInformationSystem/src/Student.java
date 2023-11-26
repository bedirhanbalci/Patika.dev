public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String studentNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String studentNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.isPass = false;
        this.average = calcAverage();

    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.course1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.course2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.course3.note = note3;
        }
    }

    void addVerbalNote(int verbalNote1, int verbalNote2, int verbalNote3) {
        if (verbalNote1 >= 0 && verbalNote1 <= 100) {
            this.course1.verbalNote = verbalNote1;
        }
        if (verbalNote2 >= 0 && verbalNote2 <= 100) {
            this.course2.verbalNote = verbalNote2;
        }
        if (verbalNote3 >= 0 && verbalNote3 <= 100) {
            this.course3.verbalNote = verbalNote3;
        }
    }

    double calcAverage() {
        double note1 = (this.course1.note * 0.8) + (this.course1.verbalNote * 0.2);
        double note2 = (this.course2.note * 0.8) + (this.course2.verbalNote * 0.2);
        double note3 = (this.course3.note * 0.8) + (this.course3.verbalNote * 0.2);
        return this.average = (note1 + note2 + note3) / 3;
    }


    void isPass() {
        calcAverage();
        if (this.average >= 55) {
            System.out.println("Sınıfı geçtiniz! ");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız! ");
            this.isPass = false;
        }
    }

    void printNote() {
        System.out.println("------------------");
        System.out.println("Öğrenci Adı : " + this.name);
        System.out.println("Tarih Ders Notu: " + this.course1.note + ", Tarih Sözlü Notu: " + this.course1.verbalNote);
        System.out.println("Fizik Ders Notu: " + this.course2.note + ", Fizik Sözlü Notu: " + this.course2.verbalNote);
        System.out.println("Biyoloji Ders Notu: " + this.course3.note + ", Biyoloji Sözlü Notu: " + this.course3.verbalNote);
        System.out.println("Ortalama : " + this.average);
    }
}