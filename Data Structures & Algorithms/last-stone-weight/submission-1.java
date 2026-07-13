class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int s : stones){
            pq.add(s);
        }
        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            int result = a-b;
            if (result > 0) pq.add(result);
        }
        return pq.size() > 0 ? pq.peek() : 0;
    }
}
