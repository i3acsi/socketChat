package com.gasevskyV.chat;

public class Exit implements ChatAction  {

    @Override
    public void execute(Input input) {
        System.out.println("bye bye");
    }
}
