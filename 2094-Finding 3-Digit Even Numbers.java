import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        // Step 1: Count the frequency of each digit (0-9) in the input array
        int[] counts = new int[10];
        for (int digit : digits) {
            counts[digit]++;
        }
        
        List<Integer> resultList = new ArrayList<>();
        
        // Step 2: Iterate through all possible 3-digit even numbers
        // Starts at 100 (no leading zeros) and increments by 2 (even numbers only)
        for (int i = 100; i <= 998; i += 2) {
            int hundred = i / 100;
            int ten = (i / 10) % 10;
            int one = i % 10;
            
            // Check if we have the needed digits available
            counts[hundred]--;
            counts[ten]--;
            counts[one]--;
            
            // If all counts remain non-negative, the number can be formed
            if (counts[hundred] >= 0 && counts[ten] >= 0 && counts[one] >= 0) {
                resultList.add(i);
            }
            
            // Backtrack: Restore the counts for the next iteration
            counts[hundred]++;
            counts[ten]++;
            counts[one]++;
        }
        
        // Step 3: Convert the list back to a primitive int array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
