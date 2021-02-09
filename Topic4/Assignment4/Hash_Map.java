import java.util.HashMap;
import java.util.Scanner;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap< String, String>  TelephoneBook = new HashMap < String, String>();

        TelephoneBook.put("person1", "5900388334");
        TelephoneBook.put("person2", "9787348730");
        TelephoneBook.put("person3", "6783393220");
        TelephoneBook.put("person4", "6577883320");
        TelephoneBook.put("person5", "7888748730");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name=");
        String name=sc.next().toUpperCase();

        if(TelephoneBook.containsKey(name)) {
            System.out.println(name +"= "+TelephoneBook.get(name));
        }
    }
}