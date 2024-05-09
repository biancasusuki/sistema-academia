package com.mycompany.interdisciplinar;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Interdisciplinar {

    public static void main(String[] args) {
        //Parte principal do projeto
        int menu = 0; //Valor aleatório para iniciar o programa com looping while
        ArrayList<Cliente> clientList = new ArrayList();
        ArrayList<Treino> treinoList = new ArrayList();
        ArrayList<PersonalTrainer> personalList = new ArrayList();

        //Menu para o usuário decidir pra onde quer ir
        while (menu != 7) {
            menu = parseInt(JOptionPane.showInputDialog("""
            Digite o n\u00famero correspondente a op\u00e7\u00e3o:
            1- Cadastro de clientes
            2- Lista de Clientes 
            3- Cadastro treinos                                             
            4- Lista de treinos
            5- cadastro de personais
            6- Lista de personais
            7- sair do programa"""));

            //De acordo com a escolha do usuário, o menu entrará em uma das opções
            switch (menu) {
                case 1 ->  {
                    String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
                    String turno = JOptionPane.showInputDialog("Digite o turno do cliente:");
                    String nascimento = JOptionPane.showInputDialog("Digite o nascimento do cliente:");
                    String cpf = JOptionPane.showInputDialog("Digite o cpf do cliente:");
                    String celular = JOptionPane.showInputDialog("Digite o celular do cliente:");
                    int qtdTreino = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de treinos: "));
                    float treino = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do treino :"));
                    clientList.add(new Cliente(nome, turno, nascimento, cpf, celular, qtdTreino, treino));
                }
                case 2 ->  {
                    for (Cliente i : clientList) {
                        JOptionPane.showMessageDialog(null,i.listar());
                    }
                }
                 case 3 ->  {
                    String nome = JOptionPane.showInputDialog("Digite o nome do treino");
                    String personal = JOptionPane.showInputDialog("Personal responsável");
                    String tipo = JOptionPane.showInputDialog("Tipo de treino (luta, aeróbico etc.): ");
                    String nivel = JOptionPane.showInputDialog("Nível do treino(básico, intermediário ou avançado): ");
                    String turno = JOptionPane.showInputDialog("Turno do treino: ");
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do treino: "));
                    treinoList.add(new Treino(nome, personal, tipo, nivel, turno, valor));
                }
                case 4 ->  {
                    for (Treino i : treinoList) {
                         JOptionPane.showMessageDialog(null,i.listar());
                    }
                }
                case 5 ->  {
                    String nome = JOptionPane.showInputDialog("Nome do personal: ");
                    String turno = JOptionPane.showInputDialog("turno do personal: ");
                    String cpf = JOptionPane.showInputDialog("cpf do personal: ");
                    String especialidade = JOptionPane.showInputDialog("especialidade: ");
                    String treinos = JOptionPane.showInputDialog("treinos aplicados: ");
                    int diasTrabalhados = parseInt(JOptionPane.showInputDialog("Dias trabalhados"));
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário do personal: "));
                    personalList.add(new PersonalTrainer(nome, turno, cpf, especialidade, treinos, diasTrabalhados, salario));

                }
                case 6 ->  {
                    for (PersonalTrainer i : personalList) {
                        JOptionPane.showMessageDialog(null,i.listar());
                    }
                }
                default -> {
                }
            }
        }
    }
}
