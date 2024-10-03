package com.sportbooking.models;

import java.time.LocalDateTime;

public class Prenotazione {
    private Utente utente;
    private Campo campo;
    private LocalDateTime dataOra;

    public Prenotazione(Utente utente, Campo campo, LocalDateTime dataOra) {
        this.utente = utente;
        this.campo = campo;
        this.dataOra = dataOra;
    }

    // Getter per utente
    public Utente getUtente() {
        return utente;
    }

    // Getter per campo
    public Campo getCampo() {
        return campo;
    }

    // Getter per dataOra
    public LocalDateTime getDataOra() {
        return dataOra;
    }

    // Setter per utente
    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    // Setter per campo
    public void setCampo(Campo campo) {
        this.campo = campo;
    }

    // Setter per dataOra
    public void setDataOra(LocalDateTime dataOra) {
        this.dataOra = dataOra;
    }
}
