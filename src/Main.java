
class Book {
    String title ="";
    String author = "";
    int pages = 0;
    boolean isAvailable = true;

    public Book(String titleName, String authorName, int numberPages){
        title = titleName;
        author = authorName;
        pages = numberPages;
        System.out.println("A new book " + title + " " + " by " + author + " " + " has been added to the library");
    }
    public void displayInfo(){
        if(title == "The Great Gatsby") {
            System.out.println("The Great Gatsby (/ɡætsbiː/ ⓘ) is a 1925 novel by American writer F. Scott Fitzgerald.");
        }
        if(title == "To Kill a Mockingbird") {
            System.out.println("To Kill a Mockingbird is a 1960 Southern Gothic novel by American author Harper Lee.");
        }
        if(title == "Pride and Prejudice"){
            System.out.println("Pride and Prejudice is the second published novel (but third to be written) by English author Jane Austen");
        }
    }
    public void borrowBook(){
        isAvailable = false;
        System.out.println("This book " + title + " not availabe" );

    }
    public void returnBook(){
        isAvailable = true;
        System.out.println("This book " + title + " is Available");
    }


    public static void main(String[] args) {
        System.out.println();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 220);
        book1.displayInfo();
        book1.borrowBook();


        System.out.println();
        Book book2 = new Book("To Kill a Mockingbird", "Harpes Lee",336);
        book2.displayInfo();
        book2.borrowBook();


        System.out.println();
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", 473 );
        book3.displayInfo();
        book3.borrowBook();
        
    }
}
