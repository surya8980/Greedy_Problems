class Solution {
public:
    bool carPooling(vector<vector<int>>& trips, int capacity) {
        int n = trips.size();
        int sources = 0;
        for(vector<int> trip: trips){
            sources = max(sources,trip[2]);
        }
        //create a seating array
        vector<int> seat(sources+1,0);
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
};
