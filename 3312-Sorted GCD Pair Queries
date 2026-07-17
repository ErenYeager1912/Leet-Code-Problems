import java.util.Arrays;
class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        long[] cnt = new long[maxVal + 1];
        for (int num : nums) {
            cnt[num]++;
        }
        for (int i = 1; i <= maxVal; i++) {
            for (int j = i * 2; j <= maxVal; j += i) {
                cnt[i] += cnt[j];
            }
        }
        for (int i = 1; i <= maxVal; i++) {
            cnt[i] = cnt[i] * (cnt[i] - 1) / 2;
        }
        for (int i = maxVal; i >= 1; i--) {
            for (int j = i * 2; j <= maxVal; j += i) {
                cnt[i] -= cnt[j];
            }
        }
        for (int i = 1; i <= maxVal; i++) {
            cnt[i] += cnt[i - 1];
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            long target = queries[i] + 1;
            ans[i] = binarySearch(cnt, target);
        }
        return ans;
    }
    private int binarySearch(long[] prefix, long target) {
        int low = 1, high = prefix.length - 1;
        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (prefix[mid] >= target) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
