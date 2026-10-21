class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> Outer = new ArrayList<>();
        
        Outer.add(new ArrayList<>());

        for(int num : nums){
            int n = Outer.size();
            for(int i = 0; i<n; i++){
                List<Integer> Internal = new ArrayList<>(Outer.get(i));
                Internal.add(num);
                Outer.add(Internal);
            }
        }

        return Outer;
    }
}