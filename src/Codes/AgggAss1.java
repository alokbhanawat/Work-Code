package Codes;

class Author {
    private String name;
    private String emailId;
    private char gender;

    // Constructor
    public Author(String name, String emailId, char gender) {
        this.name = name;
        this.emailId = emailId;
        this.gender = gender;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
}

class Book {
     private String name;
    private Author author;
    private double price;
    private int quantity;
    
     public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    
    public void displayAuthorDetails() {
        System.out.println("Author Name: " + author.getName());
        System.out.println("Author Email: " + author.getEmailId());
        System.out.println("Author Gender: " + author.getGender());
    }
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}



class AgggAss1 {
    public static void main(String[] args) {
             
   Author author1 = new Author("J. K. Rowling", "jkrowling@email.com", 'F');
   Book book1 = new Book("Harry Potter", author1, 499.99, 100);
  
  
   System.out.println("Book Name: " + book1.getName());
        System.out.println("Book Price: " + book1.getPrice());
        System.out.println("Book Quantity: " + book1.getQuantity());
        System.out.println("----- Author Details -----");
        book1.displayAuthorDetails();
    }
}


