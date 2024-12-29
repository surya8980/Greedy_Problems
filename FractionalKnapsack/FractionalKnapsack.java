class Tuple{
    int first;
    int second;
    double third;
    Tuple(int first,int second,double third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
}
class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        // code here
        PriorityQueue<Tuple> pq = new PriorityQueue<>((a,b)->Double.compare(b.third,a.third));
        for(int i=0;i<val.size();i++){
            double ratio = (double) val.get(i)/(double) wt.get(i);
            pq.add(new Tuple(wt.get(i),val.get(i),ratio));
        }
        double res=0.0;
        while(!pq.isEmpty()&&capacity>0){
            Tuple top = pq.poll();
            int weight= top.first;
            int profit = top.second;
            if(capacity>=weight){
                res+=profit;
                capacity-=weight;
            }else{
                res+=profit*((double)capacity/weight);
                capacity=0;
            }
        }
        return res;
    }
}
