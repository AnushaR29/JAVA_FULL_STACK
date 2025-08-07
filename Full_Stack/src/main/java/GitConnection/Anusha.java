package GitConnection;

import java.util.Scanner;

public class Anusha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        String s = sc.nextLine().toLowerCase();
		        boolean[] lettersPresent = new boolean[26];
		        for(char ch : s.toCharArray()){
		            if(ch>='a' && ch<='z'){
		                lettersPresent[ch-'a'] = true;
		            }
		        }
		        boolean isPangram = true;
		        for(boolean present:lettersPresent){
		            if(!present){
		                isPangram=false;
		                break;
		            }
		        }
		        System.out.print(isPangram?"YES":"NO");
		    }
       }
