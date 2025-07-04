class Solution {
   
        public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> positionMap = new HashMap<>();
		
        for(int i = 0; i < arr.length; i++)
            positionMap.put(arr[i], i);

        for(int[] piece: pieces){
			
            if(!positionMap.containsKey(piece[0])) return false;
            for(int i = 1; i < piece.length; i++) {
				
                if(!positionMap.containsKey(piece[i])) return false;
                if(positionMap.get(piece[i]) - positionMap.get(piece[i-1]) != 1) return false;
            }
        }

        return true;

    }
}