package org.adaitw.Tp_Maria.service;

import org.adaitw.Tp_Maria.entities.Concepto;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ReporteService {

    /*void crearPDF(String informe);*/

    /*Concepto traerConcepto();*/



    void export(HttpServletResponse response) throws IOException;
}
