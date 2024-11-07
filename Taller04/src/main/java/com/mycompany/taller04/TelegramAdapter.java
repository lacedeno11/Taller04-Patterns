/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;

/**
 *
 * @author abrahamcedeno
 */
public class TelegramAdapter implements NotificationService {
    private TelegramAPI telegramAPI;

    public TelegramAdapter() {
        this.telegramAPI = new TelegramAPI();
    }

    @Override
    public void sendNotification(String message) {
        telegramAPI.sendTelegramMessage(message);
    }
}