/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;

/**
 *
 * @author abrahamcedeno
 */
public class ReportBase implements Report {
    private String content;

    @Override
    public void generateContent() {
        content = "Contenido base del reporte.";
        System.out.println("Generando contenido base para Report.");
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void display() {
        System.out.println("Mostrando Report: " + content);
    }

    public void updateContent(String newContent) {
        content = newContent;
    }
}