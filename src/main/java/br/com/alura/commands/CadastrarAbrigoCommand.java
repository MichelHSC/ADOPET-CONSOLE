package br.com.alura.commands;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.AbrigoService;

import java.io.IOException;

public class CadastrarAbrigoCommand implements Command{
    @Override
    public void execute() {

        try{
            var client = new ClientHttpConfiguration();
            var abrigoService = new AbrigoService(client);

            abrigoService.cadastrarNovoAbrigo();
        } catch (IOException |InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
