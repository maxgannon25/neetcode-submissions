class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        //original position, tickets
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<tickets.length; i++){
            map.put(i, tickets[i]);
        }

        Queue<Map.Entry<Integer, Integer>> q = new ArrayDeque<>();
        
        for (Map.Entry<Integer, Integer> e: map.entrySet()){
            q.offer(e);
        }

        int time = 0;

        while(map.get(k) != 0){
            Map.Entry<Integer, Integer> front = q.poll();
            front.setValue(front.getValue()-1);
            if (front.getValue() > 0){
                q.offer(front);
            }
            time++;
        }

        return time;
    }
}