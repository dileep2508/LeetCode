class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        int[] currInterval = intervals[0];
        res.add(currInterval);

        for(int[] interval : intervals){
            int currEnd = currInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if(nextStart <= currEnd){
                currInterval[1] = Math.max(currEnd, nextEnd);
            }
            else{
                currInterval = interval;
                res.add(currInterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}