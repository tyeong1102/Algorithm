class Solution {
    public String solution(String s) {

        StringBuilder sb = new StringBuilder();

        String[] words = s.split(" "); // 공백을 기준으로 split

        for(String word : words) {

            if (word.length() == 0) { // 길이가 0이라는 것은 공백이기 때문에 추가만 한다.
                sb.append(" ");
                continue;
            }

            String head = word.substring(0, 1).toUpperCase(); // 첫 글자 대문자로
            String tail = word.substring(1, word.length()).toLowerCase(); // 나머지 소문자로

            sb.append(head).append(tail).append(" "); // 띄어쓰기 포함해서 문장으로
        }

        if (!s.substring(s.length() -1, s.length()).equals(" ")) { // 원래 있던 공백이 아닐 경우 삭제
            sb.deleteCharAt(sb.lastIndexOf(" "));
        }

        return sb.toString();
    }
}