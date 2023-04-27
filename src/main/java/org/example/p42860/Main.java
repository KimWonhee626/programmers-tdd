package org.example.p42860;

public class Main {
}

class Solution{
    public int solution(String name) {
        int answer = 0;
        int moveCount = name.length() - 1; //좌우 이동의 최대횟수
        int len = name.length();

        for (int i = 0; i < len; i++) {
            // 위아래
            char c = name.charAt(i);
            answer += Math.min(c - 'A', 'Z' - c + 1);

            // 좌우
            // 다음 요소 부터 연속된 A 탐색
            int indexA = i + 1;
            while (indexA < len && name.charAt(indexA) == 'A') {
                indexA++;
            }
            // i+i > 연속된 A 시작하기 전까지 갔다가 되돌아옴
            moveCount = Math.min(moveCount, i + (len - indexA) + Math.min(i, len-moveCount));
        }

        return answer + moveCount;
    }
}
