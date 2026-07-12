class KthLargest {
    private PriorityQueue<Integer> pq;
    private Integer goal;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        for (int num : nums){
            pq.add(num);
        }
        while(pq.size() > k){
            pq.poll();
        }
        goal = k;
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size() > goal){
            pq.poll();
        }

        return pq.peek();
    }
}
