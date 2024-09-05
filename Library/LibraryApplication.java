
import java.lang.classfile.instruction.ThrowInstruction;

public class LibraryApplication {

    static int Today=20;

    public static void main(String[] args) {
        Library library = new Library();
        int choice=0;
        
        
        do{
        System.out.println("Welcome to the Library System");
        System.out.println("1. Add a book");
        System.out.println("2. Register a member");
        System.out.println("3. Remove a book");
        System.out.println("4. Remove a member");
        System.out.println("5. Display Book information");
        System.out.println("6. Display Member information");
        System.out.println("7. Display all Books");
        System.out.println("8. Display all Members");
        System.out.println("9. Borrow a book");
        System.out.println("10. Return a book");
        System.out.println("11. View Lending information");
        System.out.println("12. Display Overdue Books");
        System.out.println("13. Fine Calculation");
        System.out.println("14. Exit");
        System.out.println();
        System.out.println("Enter your choice: ");
        choice=EasyScanner.nextInt();
        
            switch (choice) {
                case 1:
                 option1(library);
                 break;

                 case 2:
                 option2(library);
                 break;

                 case 3:
                 option3(library);
                 break;

                 case 4:
                 option4(library);
                 break;

                 case 5:
                 option5(library);
                 break;

                 case 6:
                 option6(library);
                 break;

                 case 7:
                 option7(library);
                 break;

                 case 8:
                 option8(library);
                 break;

                 case 9:
                 option9(library);
                 break;

                 case 10:
                 option10(library);
                 break;

                 case 11:
                 option11(library);
                 break;

                 case 12:
                    option12(library);
                    break;

                case 13:
                 option13(library);
                 break;

                case 14:
                 System.out.println("Goodbye");
                break;
            }
        
        }while(choice!=14);
    }  

    //addBooktoLibrary(library);
        static void option1(Library libraryIn){

            System.out.println();
            System.out.println("Enter Book ID: ");
            String BookIdIn = EasyScanner.nextString();
            System.out.println("Enter Title: ");
            String TitleIn = EasyScanner.nextString();
            System.out.println("Enter Author: ");
            String AuthorIn = EasyScanner.nextString();
            boolean isAvailableIn = true;
            Book book = new Book(BookIdIn, TitleIn, AuthorIn);
            
            if(libraryIn.booklist.add(book)){
                System.out.println("Book added");
            }
            else{
                System.out.println("Book not added");
            }
            System.out.println();
        }

    //registerMember(library);
    static void option2(Library libraryIn){

        System.out.println();
        System.out.println("Enter Member ID: ");
        String MemberIdIn = EasyScanner.nextString();
        System.out.println("Enter Name: ");
        String MemberNameIn = EasyScanner.nextString();
        
        Member member = new Member(MemberIdIn, MemberNameIn);
        
        if(libraryIn.memberList.add(member)){
            System.out.println("Member added");
        }
        else{
            System.out.println("Book not added");
        }
        System.out.println();
    }

        
    //removeBookfromLibrary(library);
       static void option3(Library LibraryIn){
        System.out.println("Enter Book ID: ");
        String BookIdIn = EasyScanner.nextString();
        LibraryIn.RemoveBook(BookIdIn);
        System.out.println();
    }

    //removeMemberfromLibrary(library);
    static void option4(Library LibraryIn){
        System.out.println("Enter Member ID: ");
        String MemberIdIn = EasyScanner.nextString();
        LibraryIn.RemoveMember(MemberIdIn);
        System.out.println();
    }


    //DisplayBookInfo(library);
    static void option5(Library LibraryIn){
        System.out.println("Enter Book ID: ");
        String BookIdIn = EasyScanner.nextString();
        LibraryIn.searchBookInfo(BookIdIn);
        System.out.println();
    }
    
    //DisplayMemberInfo(library);
    static void option6(Library LibraryIn){
        System.out.println("Enter Member ID: ");
        String MemberIdIn = EasyScanner.nextString();
        LibraryIn.searchMemberInfo(MemberIdIn);
        System.out.println();
    }

    //displayallBooks(library);
    static void option7(Library LibraryIn){
        for(int i = 0; i < LibraryIn.booklist.size(); i++){
            System.out.println("Book ID: " + LibraryIn.booklist.get(i).BookId);
            System.out.println("Title: " + LibraryIn.booklist.get(i).Title);
            System.out.println("Author: " + LibraryIn.booklist.get(i).Author);
            System.out.println("Available: " + LibraryIn.booklist.get(i).isAvailable);
            System.out.println();
        }
        System.out.println();
    }

    //displayallMembers(library);
    static void option8(Library LibraryIn){
        for(int i = 0; i < LibraryIn.memberList.size(); i++){
            System.out.println("Member ID: " + LibraryIn.memberList.get(i).getMemberId());
            System.out.println("Member Name: " + LibraryIn.memberList.get(i).getMemberName());
            System.out.println();
        }
        System.out.println();
    }

    //borrowBook(library);
    static void option9(Library LibraryIn){
        System.out.println("Enter Book ID: ");
        String BookIdIn = EasyScanner.nextString();
        System.out.println("Enter Member ID: ");
        String MemberIdIn = EasyScanner.nextString();
        System.out.println("Enter Borrowed date: ");
        int borrowedDateIn = EasyScanner.nextInt();
        LibraryIn.borrowBook(BookIdIn, MemberIdIn,borrowedDateIn);

        System.out.println();
    }

    //returnBook(library);
    static void option10(Library LibraryIn){
        System.out.println("Enter Book ID: ");
        String BookIdIn = EasyScanner.nextString();
        LibraryIn.returnBook(BookIdIn);
        System.out.println();
    }

    //displayallBorrowedBooks(library);
    static void option11(Library LibraryIn){
        for(int i = 0; i < LibraryIn.booklist.size(); i++){
            if(LibraryIn.booklist.get(i).isAvailable == false){
                System.out.println("Book ID: " + LibraryIn.booklist.get(i).BookId);
                System.out.println("Title: " + LibraryIn.booklist.get(i).Title);
                System.out.println("Lended by: " + LibraryIn.memberList.get(i).getMemberName());
                System.out.println("Borrowed Date: " + LibraryIn.booklist.get(i).borrowedDate);
                System.out.println();
            }
        }
        System.out.println();
    }

    //displayOverdueBooks(library);
    static void option12(Library LibraryIn){
        for(int i = 0; i < LibraryIn.booklist.size(); i++){
            if(LibraryIn.booklist.get(i).isAvailable == false){
                if(LibraryIn.booklist.get(i).borrowedDate + 7 < Today){
                    System.out.println("Book ID: " + LibraryIn.booklist.get(i).BookId);
                    System.out.println("Title: " + LibraryIn.booklist.get(i).Title);
                    System.out.println("Lended by: " + LibraryIn.memberList.get(i).getMemberName());
                    System.out.println("Borrowed Date: " + LibraryIn.booklist.get(i).borrowedDate);
                    System.out.println();
                }
            }
        }
        System.out.println();
    }

    //fineCalculation(library);
    static void option13(Library LibraryIn){
        int fine;

        for(int i = 0; i < LibraryIn.booklist.size(); i++){
            if(LibraryIn.booklist.get(i).isAvailable == false){
                if(LibraryIn.booklist.get(i).borrowedDate + 7 < Today){
                    System.out.println("Book ID: " + LibraryIn.booklist.get(i).BookId);
                    System.out.println("Title: " + LibraryIn.booklist.get(i).Title);
                    System.out.println("Lended by: " + LibraryIn.memberList.get(i).getMemberName());
                    System.out.println("Borrowed Date: " + LibraryIn.booklist.get(i).borrowedDate);
                    System.out.println("Return Date: " + (LibraryIn.booklist.get(i).borrowedDate+7));

                    if(LibraryIn.booklist.get(i).borrowedDate + 14 <= Today){
                        fine = (Today-(LibraryIn.booklist.get(i).borrowedDate))*50;
                    }else{
                        fine = 350 + (Today-(LibraryIn.booklist.get(i).borrowedDate-7))*100;
                    }

                    System.out.println("Fine for book: " + LibraryIn.booklist.get(i).BookId);
                    System.out.println("Fine for member: " + LibraryIn.memberList.get(i).getMemberId());
                    System.out.println("Fine: " + fine);
                    System.out.println();
                }
            }
        }
        System.out.println();
    }

}





