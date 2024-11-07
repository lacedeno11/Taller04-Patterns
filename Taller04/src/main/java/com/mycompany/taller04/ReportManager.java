/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04;

/**
 *
 * @author abrahamcedeno
 */
public class ReportManager {
    private static ReportManager instance;
    private Report report;

    private ReportManager() {
        // Constructor privado para evitar instanciación externa
    }

    public static synchronized ReportManager getInstance() {
        if (instance == null) {
            instance = new ReportManager();
            System.out.println("Instancia de ReportManager creada.");
        }
        return instance;
    }

    public void generateReport(String type) {
        ReportCreator creator;
        switch (type.toLowerCase()) {
            case "pdf":
                creator = new PDFReportCreator();
                break;
            case "excel":
                creator = new ExcelReportCreator();
                break;
            case "word":
                creator = new WordReportCreator();
                break;
            default:
                System.out.println("Tipo de reporte no soportado.");
                return;
        }
        creator.generateReport();
        report = creator.createReport();
        report.generateContent();
    }

    public void viewReport() {
        if (report != null) {
            report.display();
        } else {
            System.out.println("No hay reportes generados para mostrar.");
        }
    }

    public Report getReport() {
        return report;
    }
}

