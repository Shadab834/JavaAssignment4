import java.util.*;
class CheckPalindrome{
    public static void main(String[] args){
        int num=2552;
        int temp =num;
        int sum=0;
        while(num>0){
            int rem= num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not palindrome number");
        }
    }
}