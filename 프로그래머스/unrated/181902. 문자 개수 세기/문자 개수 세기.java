class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i=0; i<my_string.length(); i++){
            if('A'<=my_string.charAt(i) && 'Z'>=my_string.charAt(i))
                answer[my_string.charAt(i)-'A']++;
            else
                answer[(my_string.charAt(i)-'a')+26]++;
        }
        

        
        return answer;
    }
}