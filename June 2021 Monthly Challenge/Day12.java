class Solution {
    public int minRefuelStops(int target, int fuel, int[][] stations) {
        
        int n = stations.length, i=0, stops=0;
        Queue<Integer> fuelTank = new PriorityQueue<>((a,b) -> b-a);
        
		// Amount of fuel in tank == the distance that can be reached
        while (fuel < target) {
            while (i < n && stations[i][0] <= fuel) {
                fuelTank.offer(stations[i][1]);
                i++;
            }
            if (fuelTank.isEmpty()) return -1;
            fuel += fuelTank.poll();
            stops++;
        }
        
        return stops;
    }
}
