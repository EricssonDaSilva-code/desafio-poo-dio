package org.example.dominio;

import java.time.LocalDate;

public class Mentoria {
    String titulo;
    String descrição;
    LocalDate data;

    public Mentoria() {

    }

    public Mentoria(String titulo, String descrição, LocalDate data) {
        this.titulo = titulo;
        this.descrição = descrição;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descrição='" + descrição + '\'' +
                ", data=" + data +
                '}';
    }
}
