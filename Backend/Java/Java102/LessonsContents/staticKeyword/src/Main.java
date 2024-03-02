public class Main {
    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        System.out.println("Online players : " + Player.onlinePlayers);


        Course c1 = new Course("Mat-101", "MAT", "MAT");
        Course c2 = new Course("Phy-101", "PHY", "PHY");
        Course c3 = new Course("Che-101", "CHE", "CHE");

        Course.courseList();

    }
}