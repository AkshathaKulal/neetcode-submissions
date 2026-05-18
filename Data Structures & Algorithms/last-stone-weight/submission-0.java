class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int s : stones){
            min.offer(-s);
        }

        while(min.size()>1){
            int first = min.poll();
            int sec = min.poll();
            if(sec>first){
                min.offer(first-sec);
            }
        }
        min.offer(0);
        return Math.abs(min.peek());
        
    }
}
