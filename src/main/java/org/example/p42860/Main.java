package org.example.p42860;

public class Main {
}

class Solution{
    public int solution(String name) {
        return moveCount(name) + nameCount(name);
    }

    // 위/아래
    private int nameCount(String name){
        int nameCount = 0;

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            int diff = c - 'A';

            nameCount += diff;
        }

        return nameCount;
    }

    // 좌/우
    private int moveCount(String name){
        int moveCount = 0;

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            int diff = c - 'A';

            if (diff > 0) {
                moveCount = i;
            }
        }

        return moveCount;
    }

}
