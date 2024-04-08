class Solution {
    public int hIndex(int[] citations) {
        int maxHIndex = citations.length;
        int[] citationFrequency = new int[maxHIndex + 1];
        for (int index : citations) {
            if (index >= maxHIndex) citationFrequency[maxHIndex]++;
            else citationFrequency[index]++;
        }
        int totalFrequencyCounter = 0;
        for (int i = citationFrequency.length - 1; i > 0; i--) {
            totalFrequencyCounter += citationFrequency[i];
            if (i <= totalFrequencyCounter) return i;
        }
        return 0;
    }
}