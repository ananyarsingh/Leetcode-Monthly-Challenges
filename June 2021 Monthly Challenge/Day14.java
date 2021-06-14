class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (b1, b2) -> b2[1] - b1[1]);
        int maxUnits = 0, boxesPicked = 0, i = 0;

        while (i < boxTypes.length && boxesPicked < truckSize) {
            maxUnits += boxTypes[i][1] * Math.min(boxTypes[i][0], truckSize - boxesPicked);
            boxesPicked += Math.min(boxTypes[i][0], truckSize - boxesPicked);
            i++;
        }
        return maxUnits;
    }
}
