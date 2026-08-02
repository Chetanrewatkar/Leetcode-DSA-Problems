class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();
        
        for( int i=0; i<numbers.length; i++){
            int res= target- numbers[i];

            if(map.containsKey(res)){
              return new int[]{map.get(res)+1, i+1};
            }
            map.put(numbers[i] , i);
        }
        
       
        
         return new int[]{};
    }
}