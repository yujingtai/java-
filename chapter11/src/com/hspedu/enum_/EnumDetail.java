package com.hspedu.enum_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class EnumDetail {
    public static void main(String[] args) {
        Music music = Music.CLASSICMUSIC;
        music.playing();
        Music.CLASSICMUSIC.playing();
    }
}

class A {

}

//1.使用enum关键字后，就不能再继承其他类,他已经继承了Enum
//  java是单继承机制
//2.枚举类任然是一个类，可以实现接口

interface IPlaying {
    public void playing();
}
enum Music implements IPlaying {
    CLASSICMUSIC;//别忘记枚举类的规则，对象常量必须放在行首



    @Override
    public void playing() {
        System.out.println("播放好听的音乐");
    }
}
