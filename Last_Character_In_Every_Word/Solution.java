import java.util.Scanner;
class Solution {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        s.close();
        char[] result = input.toCharArray();
        for(int i=0;i<result.length;i++){
            if(Character.isWhitespace(result[i]) && !Character.isDigit(result[i-1]) && !Character.isWhitespace(result[i-1])){
                System.out.print(result[i-1]);
            }
            else if(i == result.length-1 && !Character.isDigit(result[i])){
                System.out.print(result[i]);
            }
        }
    }
}

// public class Main
// {
// 	public static void main(String[] args) {
// 		System.out.println("Hello World");
// 		String str ="Hey3 Java   Learners";
// 		for (int i = 0 ; i < str.length(); i++ ){
// 		    if(Character.isWhitespace(str.charAt(i)) && !Character.isWhitespace(str.charAt(i - 1) )  && !Character.isDigit(str.charAt(i - 1) )){
// 		        	System.out.print(str.charAt(i- 1));
// 		    }
// 		    else if (i == str.length() - 1  && !Character.isDigit(str.charAt(i - 1))) 	System.out.print(str.charAt(i));
// 		} 
// 	}
// }




// public class Main
// {
// 	public static void main(String[] args) {
// 		System.out.println("Hello World");
// 		String str ="Hey3 Java   Learners";
// 		for (int i = 0 ; i < str.length(); i++ ){
// 		    if(str.charAt(i) == ' ' && str.charAt(i - 1) !=' '  && !Character.isDigit(str.charAt(i - 1) )){
// 		        	System.out.print(str.charAt(i- 1));
// 		    }
// 		    else if (i == str.length() - 1  && !Character.isDigit(str.charAt(i - 1))) 	System.out.print(str.charAt(i));
// 		} 
// 	}
// }
