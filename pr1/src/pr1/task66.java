package pr1;
import java.util.Scanner; 
public class task66 {
 public static boolean isPalindrome(String str){
        int a = 0;
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            } else{
                a++;
            }
        }
        if(a == str.length()/2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word:  ");
        String word = scan.nextLine();
        if (isPalindrome(word)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}