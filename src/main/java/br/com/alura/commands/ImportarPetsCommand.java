package br.com.alura.commands;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ImportarPetsCommand implements Command{
    @Override
    public void execute() {
        try {
            var client = new ClientHttpConfiguration();
            var pets = new PetService(client);
            pets.importaPets();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
