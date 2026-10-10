class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int num : nums){
            if(hashMap.containsKey(num)){
                hashMap.put(num,hashMap.get(num) + 1);
            }else{
                hashMap.put(num,1);
            }
        }

        Queue<Integer> prioQueue = new PriorityQueue<>(
                (a,b) -> hashMap.get(a) - hashMap.get(b));
        for (int n: hashMap.keySet()){
            prioQueue.add(n);
            if(prioQueue.size()>k){
                prioQueue.poll();
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = prioQueue.poll();

        }
        return ans;
        
    }
}
