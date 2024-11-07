/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;

/**
 *
 * @author abrahamcedeno
 */
public abstract class ReportCreator {
    public abstract Report createReport();

    public void generateReport() {
        Report report = createReport();
        report.generateContent();
    }
}