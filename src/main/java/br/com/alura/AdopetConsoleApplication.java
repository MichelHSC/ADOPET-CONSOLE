package br.com.alura;

import br.com.alura.service.AbrigoService;
import br.com.alura.service.PetService;

import java.util.Scanner;

public class AdopetConsoleApplication {

    public static void main(String[] args) {

        var client = new ClientHttpConfiguration();
        var abrigo = new AbrigoService(client);
        var pets = new PetService(client);

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
                    case 1:
                        abrigo.listarAbrigo();
                        break;
                    case 2:
                        abrigo.cadastrarNovoAbrigo();
                        break;
                    case 3:
                        pets.listarPetsPorAbrigo();
                        break;
                    case 4:
                        pets.importaPets();
                        break;
                    case 5:
                        System.out.println("Finalizando o programa...");
                        break;
                    default:
                        System.out.println("NÚMERO INVÁLIDO!");
                        opcaoEscolhida = 0;
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }







}

