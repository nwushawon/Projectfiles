/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

/**
 *
 * @author Md_Shawon
 */
public class CharInput {
    public static void main(String[] args) {
        char ch;
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter a char:");
        ch=input.next().charAt(0);
        System.out.println("The char is:"+ch);
    }
    
}
