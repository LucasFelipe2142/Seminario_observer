package org.example;

import core.Message;
import core.MessageDisplay;
import core.MessageManager;
import core.Subject;
import interfaces.Observer;

/**
 * A classe Main demonstra o uso do padrão de projeto Observer.
 */
public class Main {
    /**
     * O método main é o ponto de entrada do programa.
     *
     * @param args Os argumentos da linha de comando.
     */
    public static void main(String[] args) {
        Subject messageManager = new MessageManager();

        Observer display1 = new MessageDisplay("Display 1");
        Observer display2 = new MessageDisplay("Display 2");

        messageManager.attach(display1);
        messageManager.attach(display2);

        Message message1 = new Message("Mensagem 1");
        messageManager.addMessage(message1);

        Message message2 = new Message("Mensagem 2");
        messageManager.addMessage(message2);

        messageManager.notifyObservers();

        messageManager.detach(display1);
        System.out.println("Observer " + ((MessageDisplay) display1).getName() + " removido.");

        Message message3 = new Message("Mensagem 3");
        messageManager.addMessage(message3);

        Message message4 = new Message("Mensagem 4");
        messageManager.addMessage(message4);

        messageManager.notifyObservers();
    }
}