class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int index, int sum){
        if(numbers.length == index){
            if(target == sum){
                answer++;
            }
        }else{
            dfs(numbers, target, index+1, sum + numbers[index]);
            dfs(numbers, target, index+1, sum - numbers[index]);
        }
    }
}