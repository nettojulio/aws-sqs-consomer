package br.com.julioneto.sqsconsomer;

import br.com.julioneto.sqsconsomer.services.AwsSqsService;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Reading Messages...");
        while (true) {
            AwsSqsService.messageReader();
        }
    }
}
