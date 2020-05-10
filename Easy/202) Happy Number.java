class Solution {
    public int sumOfDigitSquares(int n){
        int sum=0;
        while(n>0){
            int x=n%10;
            sum=sum+x*x;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        while(n!=1){
            n=sumOfDigitSquares(n);
            if(n==1||n==4) //This is because n being equal to 1 or 4 leads to the formation of an unbreakable cycle.
                break;
        }
        if(n==1)
            return true;
        return false;
    }
}