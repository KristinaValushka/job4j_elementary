package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String sentence =  "Неизвестное слово. " + eng;
        return  sentence;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String say = dic.engToRus("skdjjh");
        System.out.println(say);
    }
}
