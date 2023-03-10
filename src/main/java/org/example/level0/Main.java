package org.example.level0;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}

class Solution{
    public int solution(int n){
        int answer = 0;
        Double sqrt = Math.sqrt(n);
        if(sqrt == sqrt.intValue()){
            answer = 1;
        }
        else answer = 2;

        return answer;

    }
}