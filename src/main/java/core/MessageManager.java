package core;

import interfaces.Observer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * A classe MessageManager implementa a interface Subject e atua como o sujeito concreto no padrão Observer.
 * Ela mantém uma lista de observadores registrados e uma lista de mensagens.
 */
public class MessageManager implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();

    /**
     * Anexa um observador ao sujeito.
     *
     * @param observer O observador a ser anexado.
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * Remove um observador do sujeito.
     *
     * @param observer O observador a ser removido.
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifica todos os observadores anexados sobre uma alteração no sujeito.
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(messages);
        }
    }

    /**
     * Adiciona uma mensagem à lista de mensagens do sujeito.
     * Após adicionar a mensagem, notifica todos os observadores sobre a alteração.
     *
     * @param message A mensagem a ser adicionada.
     */
    public void addMessage(Message message) {
        messages.add(message);
        System.out.println("Mensagem inserida: " + message.getContent() + " (" + getCurrentDateTime() + ")");
        notifyObservers();
    }

    private String getCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return currentDateTime.format(formatter);
    }
}
