class Solution {
    public int[] getConcatenation(int[] nums) {
        List <Integer> l= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }

           for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
           }

           int [] res= new int[l.size()];
           for(int i=0;i<l.size();i++){
            res[i]=l.get(i);
           }
           return res;
    }
}