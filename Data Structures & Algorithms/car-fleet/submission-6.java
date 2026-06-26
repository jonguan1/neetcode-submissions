class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] arr = new int[position.length][2];
        Stack<Double> stack = new Stack<Double>();
        for (int i = 0; i < position.length; i++) {
            arr[i] = new int[] {position[i], speed[i]};
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));
        for (int i = 0; i < arr.length; i++) {
            double steps = (target - arr[i][0]) / (double)arr[i][1];
            if (stack.size() == 0 || stack.peek() < steps){
                stack.push(steps);
            }
        }
        return stack.size();
    }
}
