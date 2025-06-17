class Solution {
    public List<List<Integer>> combinationSum2(int[] candi, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candi);
        func(0, candi, target, result, new ArrayList<>());
        return result;
    }

    public void func(int i, int[] candi, int target, List<List<Integer>> result, List<Integer> list) {
        if (target == 0) {
            List<Integer> l = new ArrayList<>(list);
            result.add(l);
            return;
        }

        if (target < 0 || i >= candi.length)
            return;

       

        list.add(candi[i]);
        func(i + 1, candi, target - candi[i], result, list);

        while (i < candi.length - 1 && candi[i] == candi[i + 1])i++;
        list.remove(list.size() - 1);
        func(i + 1, candi, target, result, list);
        return;
    }
}