package com.gasevskyV.chat;

public class Greetings implements ChatAction {

    @Override
    public void execute(Input input) {
        System.out.println("Привет!");
    }
}
