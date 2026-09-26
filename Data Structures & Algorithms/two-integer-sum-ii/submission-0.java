class Solution {
    public int[] twoSum(int[] numbers, int target) {
         HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int dif = target - numbers[i];
            if (!map.containsKey(dif)) {
                map.put(numbers[i], i);
            } else {
                return new int[]{map.get(dif)+1, i+1};
            }
        }
        return new int[]{};
        }
}
