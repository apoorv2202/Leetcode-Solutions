class Solution {
    public static List<String> letterCasePermutation(String s) {
        String sub = "";
        return helper(s, sub);
    }
    private static List<String> helper(String s, String sub){
        if(s.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(sub);
            return list;
        }
        char ch = s.charAt(0);
        if (Character.isDigit(ch)) {
            return helper(s.substring(1), sub + ch);
        }
        List<String> left = helper(s.substring(1), sub + Character.toLowerCase(ch));
        List<String> right = helper(s.substring(1), sub + Character.toUpperCase(ch));
        left.addAll(right);
        return left;
    }
}