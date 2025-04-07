import view.MenuDoUsuario;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag) {
            int opcao = MenuDoUsuario.exibirMenuDoUsuario(sc);
            flag = MenuDoUsuario.SelecionarOpcaoDoUsuario(opcao);
        }
        sc.close();
    }
    }

