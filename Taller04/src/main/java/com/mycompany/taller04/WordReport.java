/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;

/**
 *
 * @author abrahamcedeno
 */
public class WordReport implements Report {
    private String content;

    @Override
    public void generateContent() {
        content = "Contenido del reporte en formato Word.";
        System.out.println("Generando contenido para WordReport.");
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void display() {
        System.out.println("Mostrando WordReport: " + content);
    }
    @Override
    public void updateContent(String updatedContent) {
        content = "Contenido del reporte editado en formato Word.";
        System.out.println("Editando contenido para Word.");
    }
}