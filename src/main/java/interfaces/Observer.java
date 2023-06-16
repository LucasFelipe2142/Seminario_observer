package interfaces;

import core.Message;

import java.util.List;

public interface Observer {
    /**
     * Atualiza o observador com a lista de mensagens.
     *
     * @param messages A lista de mensagens atualizada.
     */
    void update(List<Message> messages);
}
