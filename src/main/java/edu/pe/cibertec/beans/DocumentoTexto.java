package edu.pe.cibertec.beans;

public class DocumentoTexto implements Imprimible{
    @Override
    public String imprimir() {
        return "Imprime Documento de Texto";
    }
}
