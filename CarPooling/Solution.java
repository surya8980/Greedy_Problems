class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        //find the number of sources 
        int n = trips.length;
        int sources = 0;
        for(int [] trip: trips){
            sources =  Math.max(sources,trip[2]);
        }
        //create a seating array
        int [] seat = new int [sources+1];
        for(int i=0;i<n;i++){
            seat[trips[i][1]]+=trips[i][0];
            seat[trips[i][2]]-=trips[i][0];
        }
        for(int i=1;i<sources;i++){
            seat[i]+=seat[i-1];
        }
        for(int i=0;i<sources;i++){
            if(seat[i]>capacity)return false;
        }
        return true;
    }
}
