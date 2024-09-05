import java.util.ArrayList;

public class Library {

    public static ArrayList<Book> booklist = new ArrayList<Book>();
    public static ArrayList<Member> memberList = new ArrayList<Member>();
    
    public static

    
    public static int searchMember(String MemberIdIn){
        for(int i = 0; i < memberList.size(); i++){
            if(memberList.get(i).getMemberName().equals(MemberIdIn)){
                return 1;
            }
        }
        return 0;
    }

    public static int searchBook(String BookIdIn){
        for(int i = 0; i < booklist.size(); i++){
            if(booklist.get(i).BookId.equals(BookIdIn)){
                return 1;
            }
        }
        return 0;
    }


    public static boolean addBook(String BookIdIn,String TitleIn, String AuthorIn){ 
        
        Book book = new Book(BookIdIn, TitleIn, AuthorIn);
        booklist.add(book);
        return true;
    }
        

    public static boolean addMember(){ 
        Member member = new Member(MemberIdIn, MemberNameIn);
        memberList.add(member);
        return true;
    }

    public static void RemoveMember(String MemberIdIn){
        if(searchMember(MemberIdIn) == 1){
            memberList.remove(MemberIdIn);
            System.out.println("Member removed");
        }
        else{
            System.out.println("Member not found");
        }
    }

    public static void  RemoveBook(String BookIdIn){
        if(searchBook(BookIdIn) == 1){
            booklist.remove(BookIdIn);
            System.out.println("Book removed");
        }
        else{
            System.out.println("Book not found");
            
        }
    }

    public static void searchBookInfo(String BookIdIn){
        for(int i = 0; i < booklist.size(); i++){
            if(booklist.get(i).BookId.equals(BookIdIn)){
                System.out.println("Book ID: " + booklist.get(i).BookId);
                System.out.println("Title: " + booklist.get(i).Title);
                System.out.println("Author: " + booklist.get(i).Author);
            }
        }
    }

    public static void searchMemberInfo(String MemberIdIn){
        for(int i = 0; i < memberList.size(); i++){
            if(memberList.get(i).getMemberId().equals(MemberIdIn)){
                System.out.println("Member ID: " + memberList.get(i).getMemberId());
                System.out.println("Member Name: " + memberList.get(i).getMemberName());
            }
        }
    }

    public static void borrowBook(String BookIdIn, String MemberIdIn, int borrowedDateIn){
        for(int i = 0; i < booklist.size(); i++){
            if(booklist.get(i).BookId.equals(BookIdIn)){
                if(booklist.get(i).isAvailable == true){
                    booklist.get(i).setUnavailable();
                    booklist.get(i).borrowedDate = borrowedDateIn;
                    System.out.println("Book borrowed");
                }
                else{
                    System.out.println("Book not available");
                }
            }
        }
    }

    public static void returnBook(String BookIdIn){
        for(int i = 0; i < booklist.size(); i++){
            if(booklist.get(i).BookId.equals(BookIdIn)){
                booklist.get(i).setAvailable();
                System.out.println("Book returned");
            }
        }
    }
    

}


/*1. Add Books: Allow the addition of new books to the library.  
2. Register Members: Enable the registration of library members.  
3. Remove Books: Allow removal of books from the library's collection.  
4. Remove Members: Enable removing members from the library's records.  
5. Search Book Information: Provide the ability to search for information about a specific 
book.  
6. Search Member Information: Allow searching for information about a library member.  
7. Display Book Names: Display the names of all the books in the library.  
8. Display Member Names: Display the names of all the registered members.  
9. Lend Books: Facilitate the lending of books to library members.  
10. Return Books: Manage the return of borrowed books.  
11. View Lending Information: Display information about book lending transactions.  
12. Display Overdue Books: List books and borrowers' details if the return date is overdue.  
13. Fine Calculation: Calculate fines for members based on the overdue period when returning 
Rs. 50 per additional day for up to 7 days  
Rs. 100 per additional day after 7 days 
a book:   */