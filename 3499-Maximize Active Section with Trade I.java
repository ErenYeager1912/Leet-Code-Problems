class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int initialOnes = 0;
        int maxGain = 0;
        int prevZeroBlock = -1; // -1 indicates no previous zero block exists
        int currZeroBlock = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1') {
                initialOnes++;
                if (currZeroBlock > 0) {
                    if (prevZeroBlock != -1) {
                        maxGain = Math.max(maxGain, prevZeroBlock + currZeroBlock);
                    }
                    prevZeroBlock = currZeroBlock;
                    currZeroBlock = 0;
                }
            } else {
                currZeroBlock++;
            }
        }
        // Check the final zero block at the end if a previous zero block exists
        if (currZeroBlock > 0 && prevZeroBlock != -1) {
            maxGain = Math.max(maxGain, prevZeroBlock + currZeroBlock);
        }
        return initialOnes + maxGain;
    }
}
