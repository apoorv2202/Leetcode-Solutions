class Solution {
    public boolean isPowerOfThree(int n) {
        boolean isPowerofThree = false;
        double f = (double)(n);
        if(n <= 0){
            return isPowerofThree;
        }
        else{
            while(f > 0){
                if(f == 1.0){
                    isPowerofThree = true;
                    break;
                }
                f = f / 3.0;
            }
            return isPowerofThree;
        }
    }
}