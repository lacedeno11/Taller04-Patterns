/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;

/**
 *
 * @author abrahamcedeno
 */
public class ColorAdapter implements StyleApplier {
    private ExternalColorStyler colorStyler;
    private String color;

    public ColorAdapter(String color) {
        this.colorStyler = new ExternalColorStyler();
        this.color = color;
    }
   
    public void applyStyle(Report report) {
        String updatedContent = colorStyler.setColor(report.getContent(), color);
        report.updateContent(updatedContent);
    }
}
