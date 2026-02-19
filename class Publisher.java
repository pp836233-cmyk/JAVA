class Publisher {
    String publisher;
    Publisher(String publi){
        this.publisher = publi;
    }
}
class Book {
    String Name;
    Publisher publisher;
    Book () {}
    public Book(String name, Publisher publisher) {
        this.Name = name;
        this.publisher = publisher;
    }
}
class Literature extends Book {
    String Lit_type ="Literature";
    Literature(String name, Publisher publisher) {
        super(name, publisher);
    }
    void display() {
        System.out.println("Name:_ " + super.Name);
        System.out.println("Type:_ " + this.Lit_type);
        System.out.println("Publisher:_ " + this.publisher.publisher);
    }
}