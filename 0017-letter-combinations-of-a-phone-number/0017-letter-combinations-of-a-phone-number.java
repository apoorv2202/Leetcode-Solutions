class Solution {
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        if(digits.isEmpty()){
            return list;
        }

        String keypad[] = {
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        int index = 0;

        helper("", digits, index, keypad, list);

        return list;
    }

    private static void helper(String t, String digits, int index, String[] keypad, List<String> list){
        if(index == digits.length()){
            list.add(t);
            return;
        }

        String letters = keypad[digits.charAt(index) - '0'];

        for(int i = 0; i < letters.length(); i++){
            helper(t + letters.charAt(i), digits, index + 1, keypad, list);
        }
    }
}