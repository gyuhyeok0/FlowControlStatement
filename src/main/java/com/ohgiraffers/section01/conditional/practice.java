package com.ohgiraffers.section01.conditional;

public class practice {
    public static void main(String[] args) {
        int month;

    }
    public void Application(){

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("season = 겨울");
            if(temperature <= -15) {
                System.out.println("season = 한파경보");
            } else if (temperature <= -12) {
                System.out.println("season = 한파주의보");
            }
        } else if (month >= 3 && month <= 5) {
            System.out.println("season = 봄");
                    } else if (month >= 6 && month <= 8) {
                        System.out.println("season = 여름");
                    } if(temperature >= 35) {
                        System.out.println("season = 폭염경보");
                    } else if (month >= 9 && month <= 33){
                        System.out.println("season = 폭염 주의보");
        } else if (month >= 9 && month <= 11) {
            System.out.println("season = 가을");
        } else {
            System.out.println("season = 해당하는 계절이 없습니다.");
        }


    }

}
