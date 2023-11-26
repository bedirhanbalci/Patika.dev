public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            System.out.println(this.name + " dersine" + this.teacher.name + " başarıyla eklendi!");
        } else {
            System.out.println(this.teacher.name + " bu dersi verme yetkisine sahip değil!");
        }
    }

    void printTeacher() {
        if (this.teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + this.teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır!");
        }
    }
}
