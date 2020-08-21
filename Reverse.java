import java.util.Scanner;
import java.util.Stack;


public class Reverse {
    
    public static void reverse(Character[] str,Integer start, Integer end)
    {
        Character temp;

        if(start>=end) {
            return;
        }

           temp = str[start];
           str[start] = str[end];
           str[end] = temp;
        reverse(str, start+1, end-1);
        
        
    }

   

    public static void main(String[] args) {
       
        String str;

        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        scanner.close();

        Character[] arrTemp = new Character[str.length()];

        int index = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != '[' && str.charAt(i) != '"' && str.charAt(i) != ',' && str.charAt(i) != ' ' && str.charAt(i) != ']' && str.charAt(i) != '\'' ){
                arrTemp[index] = str.charAt(i);
                index++;
            }
        }


        Character[] arr = new Character[index];

        for(int i=0; i<index;i++){
            arr[i] = arrTemp[i];
        }
       
        reverse(arr, 0 , index-1);
        System.out.print("[");
        for(int i=0; i<index; i++){
            System.out.print('"');
            System.out.print(arr[i]);
            System.out.print('"');

            if(i!=index-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
        

    }
}