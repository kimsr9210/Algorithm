class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String arr[] = String.valueOf(num).split("");
        for(int i = 0; i <= arr.length-1; i++) {
        	if(Integer.parseInt(arr[i]) == k) {
        		answer = i+1;
        		break;
        	}
        	if(Integer.parseInt(arr[i]) != k) answer = -1;
        }
        return answer;
    }
}