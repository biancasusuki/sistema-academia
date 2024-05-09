package com.mycompany.interdisciplinar;

public class Treino {
    String nome;
    String personal;
    String tipo;
    String nivel;
    String turno;
    double valor;
    boolean ativo;

    public Treino(String nome, String personal, String tipo, String nivel, String turno, double valor) {
        this.nome = nome;
        this.personal = personal;
        this.tipo = tipo;
        this.nivel = nivel;
        this.turno = turno;
        this.valor = valor;
        this.ativo = true;
    }

    public String listar() {
        return "Nome: " + this.nome
                + "\nPersonal: " + this.personal
                + "\nTipo: " + this.tipo
                + "\nNivel: " + this.nivel
                + "\nTurno: " + this.turno
                + "\nValor: " + this.valor;
    }
    
    public void desativarTreino (){
        this.ativo = false;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getPersonal() {
        return personal;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNivel() {
        return nivel;
    }

    public String getTurno() {
        return turno;
    }

    public double getValor() {
        return valor;
    }
}
