import java.util.Arrays;
class Solution{
    public int solution(int []A, int []B){
    	//한 쪽의 최댓값과 다른 쪽의 최솟값을 곱하는 경우 누적값을 최소로 구할 수 있음
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i< A.length; i++) {
        	answer += A[i] * B[B.length-1 -i];
        }
        return answer;
    }
}