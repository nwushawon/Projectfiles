package string;



public class Exercise {

    public static void main(String[] args) {

        String s1="owo";
        StringBuilder sb=new StringBuilder (s1);
        String s2=sb.reverse().toString();
        System.out.println(s2);
        
        if(s1.equals(s2))
        {
            System.out.println("palindrom");
        }
        else
        {
            System.out.println("Not palindrom");
        }
        
        
        
        
        
        
        
       
        
        

    }

}
