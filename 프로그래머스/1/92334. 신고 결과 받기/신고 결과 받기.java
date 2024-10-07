import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int [id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>(); //HashSet  : 순서유지x 중복 불가
        HashMap<String, Integer> indexHs = new HashMap<>();
        
        for(int i = 0; i < id_list.length; i++) {
        	String name = id_list[i];
        	map.put(name, new HashSet<>()); //{muzi=[], neo=[], frodo=[], apeach=[]}
        	indexHs.put(name, i);
        }
        
        for(String s : report) {
        	String[] str = s.split(" ");
        	String from = str[0];
        	String to = str[1];
        	map.get(to).add(from);
        }
        
        for(int i = 0; i < id_list.length; i++) {
        	HashSet<String> send = map.get(id_list[i]);
        	if(send.size() >= k) {
        		for(String name : send) {
        			answer[indexHs.get(name)]++;
        		}
        	}
        }
        return answer;
    }
}