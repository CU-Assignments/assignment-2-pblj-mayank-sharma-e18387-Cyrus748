class Book {
    protected String title;
    protected String author;
    protected double price;
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }
    
    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }
    
    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class MediumLevel {
    public static void main(String[] args) {
        Fiction fBook = new Fiction("Harry Potter", "J.K. Rowling", 500);
        NonFiction nfBook = new NonFiction("Sapiens", "Yuval Noah Harari", 700);
        
        fBook.displayDetails();
        System.out.println();
        nfBook.displayDetails();
    }
}

