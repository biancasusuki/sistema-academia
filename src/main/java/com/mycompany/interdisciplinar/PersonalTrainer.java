package com.mycompany.interdisciplinar;
public class PersonalTrainer {
    String nome;
    String turno;
    String cpf;
    String especialidade;
    String treinosAplicados;
    int diasTrabalhados;
    double salario;

    public PersonalTrainer(String nome, String turno, String cpf, String especialidade, 
            String treinosAplicados, int diasTrabalhados, double salario) {
        this.nome = nome;
        this.turno = turno;
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.treinosAplicados = treinosAplicados;
        this.diasTrabalhados = diasTrabalhados;
        this.salario = salario;
    }
    
        public String listar(){
        return "Nome: " + this.nome+
                "\nTurno: " + this.turno+
                "\nCPF: " + this.cpf+
                "\nEspecialidade: " +this.especialidade+
                "\nTreinos aplicados: " + this.treinosAplicados+
                "\nDias trabalhados: " + this.diasTrabalhados+
                "\nSalario: " + calculaSalario()+
                "\n";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setTreinosAplicados(String treinosAplicados) {
        this.treinosAplicados = treinosAplicados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getTurno() {
        return turno;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getTreinosAplicados() {
        return treinosAplicados;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public double getSalario() {
        return salario;
    }
    
    public double calculaSalario(){
        double totalSalario;
        
        totalSalario = this.getDiasTrabalhados() * this.getSalario();
        return totalSalario;
    }
}


