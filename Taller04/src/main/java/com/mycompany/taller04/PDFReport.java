/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;

/**
 *
 * @author abrahamcedeno
 */
public class PDFReport implements Report {
      private String content;

    @Override
    public void generateContent() {
        content = "Contenido del reporte en formato PDF.";
        System.out.println("Generando contenido para PDFReport.");
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void display() {
        System.out.println("Mostrando PDFReport: " + content);
    }

    @Override
    public void updateContent(String updatedContent) {
        content = "Contenido del reporte editado en formato PDF.";
        System.out.println("Editando contenido para PDFReport.");
    }
}