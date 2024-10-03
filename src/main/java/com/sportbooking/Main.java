package com.sportbooking;

import java.time.LocalDateTime;
import java.util.Scanner;
import com.sportbooking.models.Utente;
import com.sportbooking.models.Campo;
import com.sportbooking.models.Prenotazione;
import com.sportbooking.services.PrenotazioneService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvenuto nel Sistema di Prenotazione Campi Sportivi!");
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci la tua email: ");
        String email = scanner.nextLine();

        Utente utente = new Utente(nome, email);
        Campo campo = new Campo("Campo di Calcio 1", "Calcio");
        PrenotazioneService prenotazioneService = new PrenotazioneService();

        // Crea una prenotazione
        Prenotazione prenotazione = new Prenotazione(utente, campo, LocalDateTime.now());
        prenotazioneService.prenotaCampo(prenotazione);

        System.out.println("Prenotazione effettuata con successo!");
        scanner.close();
    }
}
