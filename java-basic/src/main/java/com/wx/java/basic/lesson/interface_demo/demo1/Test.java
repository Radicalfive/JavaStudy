package com.wx.java.basic.lesson.interface_demo.demo1;

public class Test {
    public static void main(String[] args) {
        BasketballPlayer basketballPlayer=new BasketballPlayer();
        basketballPlayer.train();
        BasketballCoach basketballCoach=new BasketballCoach();
        basketballCoach.teach();
        PpCoach ppCoach=new PpCoach();
        ppCoach.teach();
        ppCoach.studyEnglish();
        PpPlayer ppplayer=new PpPlayer();
        ppplayer.train();
        ppplayer.studyEnglish();
    }

}
