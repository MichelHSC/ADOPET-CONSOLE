package br.com.alura;

import br.com.alura.commands.*;

import java.util.Scanner;

public class AdopetConsoleApplication {
    public static void main(String[] args) {

        var executor = new CommandExecutor();
        System.out.println("##### BOAS VINDAS AO SISTEMA ADOPET CONSOLE #####");
        try {
            int opcaoEscolhida = 0;
            while (opcaoEscolhida != 5) {
                System.out.println("""
                        \nDIGITE O NÚMERO DA OPERAÇÃO DESEJADA:
                        1 -> Listar abrigos cadastrados
                        2 -> Cadastrar novo abrigo
                        3 -> Listar pets do abrigo
                        4 -> Importar pets do abrigo
                        5 -> Sair
                        """);
                String textoDigitado = new Scanner(System.in).nextLine();
                opcaoEscolhida = Integer.parseInt(textoDigitado);

                switch (opcaoEscolhida) {
                    case 1 -> executor.executeCommand(new ListarAbrigoCommand());
                    case 2 -> executor.executeCommand(new CadastrarAbrigoCommand());
                    case 3 -> executor.executeCommand(new ListarPetsPorAbrigoCommand());
                    case 4 -> executor.executeCommand(new ImportarPetsCommand());
                    case 5 -> System.exit(0);
                    default -> opcaoEscolhida = 0;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }







}

