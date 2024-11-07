/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller04;

/**
 *
 * @author abrahamcedeno
 */
public class Sistema {
    public static void main(String[] args) {
        // Obtener instancia única de ReportManager
        ReportManager reportManager = ReportManager.getInstance();

        // Generar un reporte en formato PDF
        reportManager.generateReport("pdf");

        // Obtener el reporte generado
        Report report = reportManager.getReport();

        // Aplicar estilos utilizando adaptadores
        StyleApplier fontAdapter = new FontAdapter("Arial");
        StyleApplier colorAdapter = new ColorAdapter("Azul");

        fontAdapter.applyStyle(report);
        colorAdapter.applyStyle(report);

        // Visualizar el reporte con estilos aplicados
        reportManager.viewReport();

        // Enviar notificación por WhatsApp utilizando adaptador
        NotificationService notificationService = new WhatsAppAdapter();
        notificationService.sendNotification("Reporte generado y disponible.");

        // Enviar notificación por Email
        NotificationService emailNotification = new EmailNotification();
        emailNotification.sendNotification("Reporte enviado por email.");
    }
}
