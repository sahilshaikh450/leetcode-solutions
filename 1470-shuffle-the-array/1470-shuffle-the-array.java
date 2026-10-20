class Solution {
     public int[] shuffle(int[] nums, int n) {
 
    List<Integer> l= new ArrayList<>();

for(int i=0;i<n;i++){
    l.add(nums[i]);
    l.add(nums[i+n]);
}
  int[]res =  new int[l.size()];
  for(int i=0;i<l.size();i++){
    res[i]=l.get(i);
  }
return res;


    }
}