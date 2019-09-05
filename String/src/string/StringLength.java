
package string;

import java.util.Scanner;

/**
 *
 * @author Md_Shawon
 */
public class StringLength {
    public static void main(String[] args) {
        String s;
        int len;
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter any String:");
        s=input.nextLine();
        len=s.length();
        System.out.printf("The string is:%s and the length is:%d",s,len);
        
    }
    
}
