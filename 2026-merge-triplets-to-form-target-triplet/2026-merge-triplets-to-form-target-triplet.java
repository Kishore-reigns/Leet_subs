
class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < 3; i++)
            map.put(i, new ArrayList<>());
        for (int[] a : triplets) {
            if (a[0] <= target[0] && a[1] <= target[1] && a[2] <= target[2]) {
                map.get(0).add(a[0]);
                map.get(1).add(a[1]);
                map.get(2).add(a[2]);
            }

        }

        for (int i = 0; i < 3; i++) {
            if (!map.get(i).contains(target[i]))
                return false;
        }
        return true;

    }
}