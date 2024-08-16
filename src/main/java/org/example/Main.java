package org.example;

import TelegramBot.Bot;
import TelegramBot.tareaBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        try{
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            tareaBot bot = new tareaBot();
            botsApi.registerBot(bot);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}