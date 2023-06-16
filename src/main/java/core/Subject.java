package core;

import interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    /**
     * Anexa um observador ao sujeito.
     *
     * @param observer O observador a ser anexado.
     */
    void attach(Observer observer);

    /**
     * Remove um observador do sujeito.
     *
     * @param observer O observador a ser removido.
     */
    void detach(Observer observer);

    /**
     * Notifica todos os observadores anexados sobre uma alteração no sujeito.
     */
    void notifyObservers();

    /**
     * Adiciona uma mensagem ao sujeito.
     *
     * @param message A mensagem a ser adicionada.
     */
    void addMessage(Message message);
}
