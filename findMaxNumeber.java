import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

class findMaxNumber {
    public static int findMax(List<String> nums) {
        int max = 0;
        int current = 0;
        for (String i : nums)  {
            if (i.equals("1")) {
                current++;
            }else {
                current = 0;
            }
            if (current > max) {
                max = current;
            }
          
        }
        return  max;
    }


    public static void main(String[] args) 
    { 
        String nums;
        int result;
        Scanner scanner = new Scanner(System.in);
        nums = scanner.nextLine();
        scanner.close();
        String str[] = nums.split("\\[|\\,|\\]");
        List<String> al = new ArrayList<String>();
	    al = Arrays.asList(str);
        
        result = (findMax(al));
          
        System.out.println(result); 

        
    } 
}