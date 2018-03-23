/**
 * Library class
 */
public class Library {
    String name;
    Address location;
    Book[] books;
    Member[] members;


    /**
     * addBook(Book) : void
     * Creates a new array which is a copy of this.books, but, whose length is
     * this.books.length + 1, to be able to add the new book.
     *
     * this.books is then replaced by the new array.
     *
     * @param a
     *          A new book object to add to the books list
     */
    public void addBook(Book a){
        Book[] newBooks = new Book[this.books.length+1];
        for(int i = 0; i < books.length; i++){
            newBooks[i] = books[i];

        }
        newBooks[books.length] = a;
        this.books = newBooks;

    }





    /**
     * addMember(Member) : void
     * Creates a new array which is a copy of this.members, but, whose length is
     * this.members.length + 1, to be able to add the new member.
     *
     * this.members is then replaced by the new array.
     *
     * @param a
     *          A new member object to add to the members list
     */
    public void addMember(Member a){
        Member[] newMembers = new Member[this.members.length+1];
        for(int i = 0; i < members.length; i++){
            newMembers[i] = members[i];
        }
        newMembers[members.length] = a;
        this.members = newMembers;
    }





}
