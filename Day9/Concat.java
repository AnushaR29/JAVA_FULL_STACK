import java.util.Scanner;

public class Concat {
    public static String concatenation(String First_Name, String Last_Name){
        return First_Name.concat(" ").concat(Last_Name); 
    
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string :");
        String First_Name = sc.nextLine();
        System.out.println("Enter the second string :");
        String Last_Name = sc.nextLine();
        System.out.println("Concatenation of 2 strings :"+concatenation(First_Name, Last_Name));
    }
}
