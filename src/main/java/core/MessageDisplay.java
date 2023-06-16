package core;

import interfaces.Observer;

import java.util.List;

/**
 * A classe MessageDisplay implementa a interface Observer e atua como um observador concreto no padrão Observer.
 * Ela exibe as mensagens recebidas em seu método update.
 */
public class MessageDisplay implements Observer {
    private String name;

    /**
     * Construtor da classe MessageDisplay.
     *
     * @param name O nome do display.
     */
    public MessageDisplay(String name) {
        this.name = name;
    }

    /**
     * Atualiza o observador com a lista de mensagens.
     *
     * @param messages A lista de mensagens atualizada.
     */
    public void update(List<Message> messages) {
        System.out.println("Atualização do " + name + ":");
        for (Message message : messages) {
            System.out.println("- " + message.getContent());
        }
    }

    /**
     * Obtém o nome do display.
     *
     * @return O nome do display.
     */
    public String getName() {
        return name;
    }
}
