class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int totgas=0;
        int totcost=0;
        for(int i=0;i<gas.size();i++){
            totgas+=gas[i];
            totcost+=cost[i];
        }
        if(totgas<totcost)return -1;
        int current=0;
        int start=0;
        for(int i=0;i<gas.size();i++)
        {
            current+=gas[i]-cost[i];
            if(current<0){
                current=0;
                start=i+1;
            }
        }
        return start;
    }
};
