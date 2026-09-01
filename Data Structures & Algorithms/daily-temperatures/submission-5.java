class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<int[]> stack = new Stack<>();
        int[] res = new int[temperatures.length];

        for (int i=0; i<temperatures.length; i++){
            res[i] = 0;
        }

        for (int i=0; i<temperatures.length; i++){

            while (!stack.isEmpty() && temperatures[i] > stack.peek()[0]){
                int[] tmp = stack.pop();
                int dayIndex = tmp[1];
                res[dayIndex] = i-dayIndex;
            }

            stack.push(new int[]{temperatures[i], i});
        }

        return res;
    }
}
