class Solution {
    public String reverseVowels(String s) {
        int i = 0;
            char[] arr = s.toCharArray();
            int j = arr.length - 1;
            int mid =  (i + j)/ 2;
            while(i<j){
                if(arr[i] != 'a' && arr[i] != 'A' && 
                    arr[i] != 'e' && arr[i] != 'E' &&
                    arr[i] != 'i' && arr[i] != 'I' &&
                    arr[i] != 'o' && arr[i] != 'O' &&
                    arr[i] != 'u' && arr[i] != 'U'){
                        i++;
                }
                else if(
                    arr[j] != 'a' && arr[j] != 'A' && 
                    arr[j] != 'e' && arr[j] != 'E' &&
                    arr[j] != 'i' && arr[j] != 'I' &&
                    arr[j] != 'o' && arr[j] != 'O' &&
                    arr[j] != 'u' && arr[j] != 'U'
                ){
                        j--;
                }    
                else{
                        char temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        i++;
                        j--;
                }
            }
            String reverses = new String(arr);
            return reverses;
    }
}