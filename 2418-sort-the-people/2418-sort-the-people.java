import java.util.PriorityQueue;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> heights[b] - heights[a]);

        // Add indices to priority queue
        for (int i = 0; i < names.length; i++) {
            pq.offer(i);
        }

        // Build the result array
        String[] result = new String[names.length];
        int index = 0;
        while (!pq.isEmpty()) {
            result[index++] = names[pq.poll()];
        }

        return result;
    }
}