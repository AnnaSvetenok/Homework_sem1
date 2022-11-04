public class Book {
    //создаем переменные название произведения и автор
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    //создаем метод для получения и изменения названия произведения
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //создаем метод для получения и изменения имени автора
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
