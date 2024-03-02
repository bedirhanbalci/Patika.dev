public class Course {

    public String name;
    public String code;
    public String prefix;
    public int note;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public static void courseList(){
        String[] courseList = {"Physics", "Chemistry", "Mathematics"};
        for (String courseName : courseList){
            System.out.println(courseName);
        }
    }

}
