class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer>result = new HashSet<>();
        HashSet<Integer>current = new HashSet<>();
        for(int x : arr){
            HashSet<Integer>next = new HashSet<>();
            next.add(x);
            for(int y : current){
                next.add(x|y);
            }
            result.addAll(next);
            current = next ; 
        }
        return result.size();

    }
}