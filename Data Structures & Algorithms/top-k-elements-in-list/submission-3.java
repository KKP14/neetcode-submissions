class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> num_map = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            int current_num = nums[i];
            int num_of_times= 0;
            for(int j=0;j<nums.length;j++){
            
                if(nums[i] == nums[j]){
                    num_of_times +=1;
                }
            }

            num_map.put(current_num,num_of_times);    
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(num_map.entrySet());


        entries.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = entries.get(i).getKey();
        }

        return result;
    }
}
