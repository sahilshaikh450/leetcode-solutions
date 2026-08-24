class Solution {
    public int missingNumber(int[] nums) {
  int n= nums.length;
    int x=0;

    for(int i=1;i<n+1;i++){
        x ^=i;

    }   

    for(int num:nums ){
        x ^=num;
    }   


return x;

    }
}