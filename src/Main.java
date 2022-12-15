public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Author author1 = new Author("Стивен", "Кинг");
        Book book1 = new Book("Оно", author1,  1986);
        Author author2 = new Author("Дмитрий", "Глуховский");
        Book book2 = new Book("Метро 2033", author2, 2005);
        System.out.println(author1.getFirstName() + " " + author1.getLastName() + "; " + book1.getName() + "; " + book1.getPublishingYear() + "г.");
        System.out.println(author2.getFirstName() + " " + author2.getLastName() + "; " + book2.getName() + "; " + book2.getPublishingYear() + "г.");
        book1.setPublishingYear(2000);
        System.out.println(author1.getFirstName() + " " + author1.getLastName() + "; " + book1.getName() + "; " + book1.getPublishingYear() + "г.");
    }
}