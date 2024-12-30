class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here
        int [] arr = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        List<Integer> res = new ArrayList<>();
        for(int i=9;i>=0;i--){
            while(N>=arr[i]){
                N-=arr[i];
                res.add(arr[i]);
            }
        }
        return res;
        
    }
}
