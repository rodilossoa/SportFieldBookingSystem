# SportFieldBookingSystem

Titolo: Sistema di Gestione di Prenotazioni di Campi Sportivi
Descrizione del Progetto:
L'obiettivo del progetto è sviluppare un sistema di gestione delle prenotazioni per campi sportivi che consenta agli utenti (clienti) di prenotare campi sportivi per determinati periodi di tempo, mentre gli amministratori del sistema possono gestire le prenotazioni, visualizzare la disponibilità dei campi e confermare o annullare le prenotazioni.

Funzionalità principali:
Registrazione e autenticazione degli utenti:

Gli utenti possono registrarsi al sistema con un nome utente, email e password.
Gli utenti registrati possono accedere al sistema per effettuare prenotazioni.
Prenotazione dei campi:

Gli utenti possono visualizzare i campi sportivi disponibili e selezionare un campo per una specifica data e fascia oraria.
Gli utenti possono inviare una richiesta di prenotazione che deve essere approvata dall'amministratore.
Gestione delle prenotazioni:

Gli amministratori possono vedere tutte le prenotazioni in attesa di conferma.
Gli amministratori possono approvare o rifiutare le richieste di prenotazione.
Gli utenti possono annullare una prenotazione prima di un certo periodo di tempo.
Disponibilità dei campi:

Il sistema visualizza le fasce orarie disponibili per ciascun campo sportivo in base alle prenotazioni già esistenti.
Storico delle prenotazioni:

Gli utenti possono vedere lo storico delle loro prenotazioni passate e future.
Gli amministratori possono visualizzare tutte le prenotazioni effettuate.
Notifiche:

Gli utenti ricevono notifiche (email o avviso sul sistema) quando una prenotazione viene confermata, rifiutata o annullata.
Tecnologie utilizzate:
Linguaggio di programmazione: Java
Database: MySQL o SQLite (per la gestione dei dati relativi a utenti, campi, prenotazioni)
Interfaccia grafica: JavaFX o Swing (per l'interazione utente)
JDBC: per collegare il database con l'applicazione Java
Spring Boot (facoltativo): per creare una versione web-based del sistema
Struttura del Database:
Tabella Utenti:

ID_utente (PK)
nome_utente
email
password
ruolo (utente o amministratore)
Tabella Campi:

ID_campo (PK)
nome_campo
tipo_campo (calcetto, tennis, basket, ecc.)
disponibilità (boolean)
Tabella Prenotazioni:

ID_prenotazione (PK)
ID_utente (FK)
ID_campo (FK)
data_prenotazione
ora_inizio
ora_fine
stato (in attesa, confermata, rifiutata)
Estensioni future:
Pagamento online: Gli utenti possono effettuare pagamenti direttamente tramite il sistema.
Gestione multi-sport: Supporto per diversi tipi di campi (calcio, tennis, pallavolo).
Versione mobile: Sviluppare un'app mobile per facilitare le prenotazioni tramite smartphone.
