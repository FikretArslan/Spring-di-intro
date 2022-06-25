package main;

import service.MailService;
import service.MessageService;

public class MyApplication {
    public static void main(String[] args) {

        MessageService theService=new SMSService();

        System.out.println(theService.sendMessage());

    }
}
