// There are N balls positioned in a row. Each of them is either red or white . 
// In one move we can swap two adjacent balls. We want to arrange all the red balls into a consistent segment. 
// What is the minimum number of swaps needed?

// Given string S of length N built from characters "R" and "W", representing red and white balls respectively, 
// returns the minimum number of swaps needed to arrange all the red balls into a consistent segment. If the result exceeds 10^9, return -1.




import java.util.*;

public class MinimumSwaps{

    public static int minSwaps(String s) {
        List<Integer> reds = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R') {
                reds.add(i);
            }
        }
        
        int n = reds.size();
        if(n == 0) {
            return 0;
        }
        
        int start_ptr = 0;
        int end_ptr = n - 1;
        int count = 0;
        
        
        while(start_ptr < end_ptr) {
            count += reds.get(end_ptr) - reds.get(start_ptr) - end_ptr + start_ptr;
            start_ptr += 1;
            end_ptr -= 1;
        }
        
        return count > Math.pow(10, 9) ? -1 : count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        int res = minSwaps(s);
        System.out.println(res);
    }
}