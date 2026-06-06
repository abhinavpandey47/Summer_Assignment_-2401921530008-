import java.util.*;
interface lib{
    void registerAccount();
    void requestBook();
}
class kidUsers implements lib{

int age;
String bookType;

    public kidUsers(int age,String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    public void registerAccount(){
         if(age<12){
            System.out.println("you have succesfully registered under a kids account");
        }
        else if(age>12){
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }
    public void requestBook(){
        if(bookType.equals("kids")){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }

}

class adultUsers implements lib{

int age;
String bookType;

    public adultUsers(int age,String bookType) {
        this.age = age;
        this.bookType = bookType;
    }
 
    public void registerAccount(){
        if(age>12){
            System.out.println("you have succesfully registered under an adult account");
        }
        else if(age<12){
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }
    public void requestBook(){
        if(bookType.equals("fiction")){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult fiction books");
        }
    }

}
public class LibraryInterfaceDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        kidUsers obj1 = new kidUsers(10,"kids");
        obj1.registerAccount();
        obj1.requestBook();

        adultUsers obj2 = new adultUsers(18,"fiction");
        obj2.registerAccount();
        obj2.requestBook();
        
    }
}
