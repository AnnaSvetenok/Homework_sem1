public class ReaderDemo {
    public static void main(String[] args){
        //создаем данные читателей
        Reader reader1 = new Reader("Петров В.В.", 3,"IT","28.08.2001","8075111");
        Reader reader2 = new Reader("Иванов А.С.", 1,"IT","02.06.2000","8075222");
        Reader reader3 = new Reader("Сидоров А.А.", 5,"IT","14.04.1999","8075333");
        //Reader[] readers={reader1, reader2, reader3};

        //создаем данные книг
        Book book1= new Book("Приключения","Брайн Круз");
        Book book2= new Book("Словарь","Джессика Хармон");
        Book book3= new Book("Энциклопедия","Нэнси Мартинес");
        //Book[] books={book1, book2, book3};

        //вызываем методы take_book
        reader1.take_book(2); //принимает количество взятых книг
        reader2.take_book("Приключения","Словарь","Энциклопедия"); //принимает переменное количество названий книг
        reader3.take_book(book1,book2,book3); //принимает переменное количество объектов класса Book

        //вызываем методы return_book
        reader1.return_book(1); //возвращает количество взятых книг
        reader2.return_book("Приключения","Словарь");//возвращает переменное количество названий книг
        reader3.return_book(book1,book2,book3); //возвращает переменное количество объектов класса Book
    }
}
