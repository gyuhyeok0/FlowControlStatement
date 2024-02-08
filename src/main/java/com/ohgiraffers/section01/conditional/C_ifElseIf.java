package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {

    public void testSimpleIfElseIfStatement() {

        /*수업목표. if-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.
            필기.
                [if-else-if 문 표현식]
                if(조건식1) {
                    조건식1 이 true 일 때 실행할 명령문;
                } else if {
                    조건식1 이 false 이고, 조건식2가 true 일 때 실행할 명령문;
                } else {
                    위의 조건 모두 거짓인 경우 실행할 명령문;
                }
         */

        System.out.println("산속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨렸다.");
        System.out.println("나무꾼이 어쩔 줄 몰라하던 그 때..");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다");

        System.out.print("어느 도끼가 너의 도끼이느냐? (1.금도끼, 2.은도끼, 3,쇠도끼) : ");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if(answer == 1) {

            System.out.println("이런 거짓말쟁이!! 너에게는 아무런 도끼를 줄 수 없다..이 욕심쟁이..");
        } else if (answer ==2 ) {

            System.out.println("욕심이 과하지는 않지만 그래도 넌 거짓말을 해부렀으..썩 꺼지거라");
        } else {

            System.out.println("오~ 정직한 놈이구로나..");
        }

        System.out.println("그렇게 산신령은 다시 연못 속으로 사라지고 말았다...");


    }



}
