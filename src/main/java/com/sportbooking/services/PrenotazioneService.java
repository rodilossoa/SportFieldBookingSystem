package com.sportbooking.services;

import com.sportbooking.models.Prenotazione;
import com.sportbooking.database.DatabaseManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrenotazioneService {
    public void prenotaCampo(Prenotazione prenotazione) {
        try (Connection connection = DatabaseManager.getConnection()) {
            String sql = "INSERT INTO prenotazioni (utente, campo, dataOra) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, prenotazione.getUtente().getEmail());
            statement.setString(2, prenotazione.getCampo().getNome());
            statement.setObject(3, prenotazione.getDataOra());

            statement.executeUpdate(); // Esegui l'aggiornamento
        } catch (SQLException e) {
            e.printStackTrace(); // Stampa eventuali errori
        }
    }
}
