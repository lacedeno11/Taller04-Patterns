/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;

/**
 *
 * @author abrahamcedeno
 */
public class FontAdapter implements StyleApplier {
    private ExternalFontStyler fontStyler;
    private String font;

    public FontAdapter(String font) {
        this.fontStyler = new ExternalFontStyler();
        this.font = font;
    }

    @Override
    public void applyStyle(Report report) {
        String updatedContent = fontStyler.setFont(report.getContent(), font);
        report.updateContent(updatedContent);
    }
}
