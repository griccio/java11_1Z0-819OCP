import java.io.*;
import java.nio.channels.FileLock;

class Book {
    String title;
    String editor;
    String isbn ;

    Book(){
        System.out.println("Book Inside no args constructor");
    }
    Book(String title, String isbn, String editor){
        this.title = title;
        this.isbn = isbn;
        this.editor = editor;
        System.out.println("Book Inside three args constructor");
    }
}
class IllustratedBook extends Book  implements Externalizable{
    public String author;
    public String illustratorAuthor;
    public Integer illustrationNumber;

    public IllustratedBook(){
        System.out.println("IllustratedBook inside  no args constructor");
    }
    IllustratedBook(String author, String illustratorAuthor) {
        this.author = author;
        this.illustratorAuthor = illustratorAuthor;
        this.illustrationNumber = 100;
        System.out.println("IllustratedBook inside the two args constructor");
    }
    @Override
    public String toString() {
        return "IllustratedBook{" +
                "author='" + author + '\'' +
                ", illustratorAuthor='" + illustratorAuthor + '\'' +
                ", illustrationNumber=" + illustrationNumber +
                ", title='" + title + '\'' +
                ", editor='" + editor + '\'' +
                ", isbn='" + isbn + '\'' +
                "} ";
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("inside write external");
        out.writeObject(author);
        out.writeObject(illustratorAuthor);
        out.writeObject(title);
        out.writeObject(editor);
        out.writeObject(isbn);
        out.writeObject(illustrationNumber);
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("inside read external");
        author = (String)in.readObject();
        illustratorAuthor = (String) in.readObject();
        title = (String) in.readObject();
        editor = (String) in.readObject();
        isbn = (String)in.readObject();
        illustrationNumber = (Integer) in.readObject();
    }
}
public class MyExternalisationExample_01 {
    public static void main(String[] args) throws IOException, FileNotFoundException,ClassNotFoundException {
        IllustratedBook illustratedBook = new IllustratedBook("Roald Dahl", "Quentin Blake");
        illustratedBook.title = " Fantastic Mr Fox";
        illustratedBook.illustrationNumber = 20;
        illustratedBook.isbn = "ABCD-123456-CDE";
        System.out.println("illustratedBook=  " + illustratedBook);
        String fileName = "dahl_Fantastic_mr_fox.ser";

        // serialize my class
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            try {
                objectOutputStream.writeObject(illustratedBook);

            } catch (Exception e) {
                System.out.println(e);
            }
        }

        //deserialize object
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            IllustratedBook deserializedBook = null;
            {
                deserializedBook = (IllustratedBook) objectInputStream.readObject();
                System.out.println("deserializedBook = " + deserializedBook);
            }
        }
    }
}
/**
 Book Inside no args constructor
 IllustratedBook inside the two args constructor
 illustratedBook=  IllustratedBook{author='Roald Dahl',
 illustratorAuthor='Quentin Blake', illustrationNumber=20,
 title=' Fantastic Mr Fox', editor='null', isbn='ABCD-123456-CDE'}
 inside write external
 Book Inside no args constructor
 IllustratedBook inside  no args constructor
 inside read external
 deserializedBook = IllustratedBook{author='Roald Dahl',
 illustratorAuthor='Quentin Blake', illustrationNumber=20,
 title=' Fantastic Mr Fox', editor='null', isbn='ABCD-123456-CDE'}

 Process finished with exit code 0
 */