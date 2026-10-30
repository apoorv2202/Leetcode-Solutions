class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        boolean used[] = new boolean[nums.length];
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        return helper(used, nums, list, temp);
    }

    private static List<List<Integer>> helper(boolean[] used, int[] nums, List<List<Integer>> list, List<Integer> temp) {
        if(temp.size() == nums.length){
            list.add(new ArrayList<>(temp));
            return list;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]){
                continue;
            }
            temp.add(nums[i]);
            used[i] = true;

            helper(used, nums, list, temp);

            temp.remove(temp.size() - 1);
            used[i] = false;
        }
        return list;
    }
}
