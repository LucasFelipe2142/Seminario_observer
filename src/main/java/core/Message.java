package core;

/**
 * A classe Message representa uma mensagem.
 */
public class Message {
    private String content;

    /**
     * Construtor da classe Message.
     *
     * @param content O conteúdo da mensagem.
     */
    public Message(String content) {
        this.content = content;
    }

    /**
     * Obtém o conteúdo da mensagem.
     *
     * @return O conteúdo da mensagem.
     */
    public String getContent() {
        return content;
    }
}
