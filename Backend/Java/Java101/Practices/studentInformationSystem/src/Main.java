public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher(" Mahmut Hoca", "TRH", "5555");
        Teacher teacher2 = new Teacher(" Albert Einstein", "FZK", "0000");
        Teacher teacher3 = new Teacher(" Charles Darwin", "BIO", "1111");

        Course course1 = new Course("Tarih", "101", "TRH");
        course1.addTeacher(teacher1);
        course1.printTeacher();

        Course course2 = new Course("Fizik", "102", "FZK");
        course2.addTeacher(teacher2);
        course2.printTeacher();

        Course course3 = new Course("Biyoloji", "101", "BIO");
        course3.addTeacher(teacher3);
        course3.printTeacher();

        Student student1 = new Student("Şaban", "123", "4", course1, course2, course3);
        student1.addBulkExamNote(100, 78, 50);
        student1.addVerbalNote(56, 12, 80);

        Student student2 = new Student("Necmi", "444", "4", course1, course2, course3);
        student2.addBulkExamNote(50, 30, 70);
        student2.addVerbalNote(90, 67, 100);

        Student student3 = new Student("Tarık", "345", "4", course1, course2, course3);
        student3.addBulkExamNote(70, 10, 100);
        student3.addVerbalNote(0, 85, 100);

        student1.isPass();
        student1.printNote();
    }
}