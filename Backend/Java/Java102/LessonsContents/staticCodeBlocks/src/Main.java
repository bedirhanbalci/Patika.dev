public class Main {
    public static void main(String[] args) {

        Author[] authors = AuthorOperations.getAuthors();

        for (Author author : authors) {
            System.out.println(author.getInfo());
        }
    }

}
