
import java.util.*;

class PrintDuplicates{
   
	public static void main(String[] args){
        int count=0;
        String s ="ShadabKaifi";
        char[] input = s.toCharArray();
        System.out.println("Duplicates character are:");
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){

                if(input[i]==input[j]){
                    System.out.println(input[j]);
                    count++;
                    break; 
                }
                
            }
        }
       
    }
    } 


    

