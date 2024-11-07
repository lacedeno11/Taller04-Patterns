/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;

/**
 *
 * @author abrahamcedeno
 */
public class WhatsAppAdapter implements NotificationService {
    private WhatsAppAPI whatsAppAPI;

    public WhatsAppAdapter() {
        this.whatsAppAPI = new WhatsAppAPI();
    }

    @Override
    public void sendNotification(String message) {
        whatsAppAPI.sendWhatsAppMessage(message);
    }
}