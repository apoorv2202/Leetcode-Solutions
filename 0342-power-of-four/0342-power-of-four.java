class Solution {
    public boolean isPowerOfFour(int n) {
        boolean isPowerofFour = false;
        double f = (double)(n);
        if(n <= 0){
            return isPowerofFour;
        }
        else{
            while(f > 0){
                if(f == 1.0){
                    isPowerofFour = true;
                    break;
                }
                f = f / 4.0;
            }
            return isPowerofFour;
        }  
    }
}