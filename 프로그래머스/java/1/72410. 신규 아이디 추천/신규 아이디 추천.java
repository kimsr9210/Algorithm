class Solution {
    public String solution(String new_id) {
        String answer = "";

        //1단계 대문자 -> 소문자로 치환
        new_id = new_id.toLowerCase();
        
        //2단계 소문자, 숫자, - , . 제외한 모든 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        //3단계 마침표(.)가 2번 이상 이면 (.)한개로 치환
        new_id = new_id.replaceAll("[.]{2,}", ".");

        //4단계 마침표(.)가 처음이나 끝에 위치한다면 제거
        //new_id = new_id.replaceAll("^[.]", "").replaceAll("[.]$", "");
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        
        //5단계 new_id가 빈 문자열이라면, a를 대입
        if(new_id.length() == 0) new_id += "a";
        
        //6단계 new_id 길이가 16 이상이면 15개의 문자를 제외한 나머지를 모두 제거
        if(new_id.length() >= 16) {
        	new_id = new_id.substring(0, 15);
        	new_id = new_id.replaceAll("^[.]|[.]$", "");
        }
        
        //7단계 new_id 길이가 2자 이하라면 마지막 문자를 길이가 3이 될때 까지 반복해서 끝에 붙임
        if(new_id.length() < 3) {
        	String add = new_id.substring(new_id.length()-1, new_id.length());
        	for(int i = new_id.length(); i < 3; i++) {
        		new_id += add;
        	}
        } 
        answer = new_id;
        return answer;
    }
}
