class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            priorityQueue.offer(stone);
        }

        while (priorityQueue.size() > 1){
            int a = priorityQueue.poll();
            int b = priorityQueue.poll();
            if(a-b != 0){
                priorityQueue.offer(Math.abs(a-b));
            }
        }

        if(priorityQueue.size() == 0){
            return 0;
        }

        return priorityQueue.peek();
        
    }
}
