class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>list = new ArrayList<>();
        for(int[] inter : intervals){
            list.add(inter);
        }
        list.add(newInterval);
        Collections.sort(list,(a,b)->Integer.compare(a[0],b[0]));
        int end = list.get(0)[1] , start = list.get(0)[0];
        List<int[]>res = new ArrayList<>();
        for(int i = 1 ; i < list.size() ; i++){ 
            int curend = list.get(i)[1], curstart = list.get(i)[0];
            if(curstart <= end){
                end = Math.max(end,curend);
            }else{
                res.add(new int[]{start,end});
                start = curstart ; 
                end = curend ; 
                
            }

        }
        res.add(new int[]{start,end});

        
      
         int[][] result = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result ; 

    }
}