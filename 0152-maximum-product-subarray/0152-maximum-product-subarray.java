class Solution {
    public int maxProduct(int[] arr) {
        if(arr.length == 1)
        return arr[0];
	    int result = Integer.MIN_VALUE;
	    for(int i=0;i<arr.length;i++){
            int prod = 1;
	        for(int j=i;j<arr.length;j++) {
	            prod *= arr[j];
	            result = Math.max(result,prod);
	        }
        }
	   return result;     
    }
}