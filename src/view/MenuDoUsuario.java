package view;


import java.util.Scanner;

public class MenuDoUsuario {
    public static int exibirMenuDoUsuario(Scanner sc) {
        System.out.println("===== Escolha uma das opções =====");
        System.out.println("1. Cadastrar um novo pet");
        System.out.println("2. Alterar os dados do pet cadastrado");
        System.out.println("3. Deletar um pet cadastrado");
        System.out.println("4. Exibir todos os pets cadastrados");
        System.out.println("5. Listar Pets por algum critério (idade,nome,raça)");
        System.out.println("6. Sair");

        while (!sc.hasNextInt()) {
            System.out.println("Digite um numero válido!");
            sc.next();
        }

        return sc.nextInt();
    }

    public static boolean SelecionarOpcaoDoUsuario(int opcao) {
        if (opcao == 1) {
            System.out.println("Iniciando cadastro de novo pet!");
            // Chamar funcao de cadastrar pet
            return false;

        } else if (opcao == 2) {
            System.out.println("Iniciando alteração de um pet!");
            // chamar funcao de alterar dados de um pet
            return false;
        } else if (opcao == 3) {
            System.out.println("Iniciando deletar um pet cadastrado!");
            // chamar funcao de deletar um pet
            return false;
        } else if (opcao == 4) {
            System.out.println("Listando todos os pets cadastrados!");
            // chamar funcao de listar todos pet
            return false;
        } else if (opcao == 5) {
            System.out.println("Listando os pets cadastrados por algum critério!");
            // chamar funcao de listar um pet por criterio
            return false;
        } else if (opcao == 6) {
            System.out.println("Sair");
            return false;

        } else {
            System.out.println("Opcão Invalida! Digite uma opção valida!");
        }
        return true;
    } }

