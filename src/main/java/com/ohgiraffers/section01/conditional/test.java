package com.ohgiraffers.section01.conditional;

import java.util.Scanner;                                      

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력해주세요: ");
        int first = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비

        System.out.print("두 번째 정수를 입력해주세요: ");
        int second = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비

        System.out.print("연산기호 입력 (+, -, *, /, %): ");
        char op = sc.nextLine().charAt(0);

        int result = 0;
        int num2 = 3;

        // 연산자에 대한 switch case 부분은 그대로 유지

        System.out.println(first + " " + op + " " + second + " = " + result);
    }
}