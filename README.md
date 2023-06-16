# Projeto de Exemplo - Observer Pattern

Este é um exemplo de implementação do padrão de projeto Observer em Java. O objetivo é demonstrar como o padrão Observer pode ser usado para manter objetos atualizados sobre mudanças de estado em um sistema.

## Descrição do Projeto

O projeto consiste em três classes principais:

- `MessageManager`: Implementa a interface `Subject` e atua como o sujeito concreto no padrão Observer. Ele mantém uma lista de observadores registrados e uma lista de mensagens. Os observadores podem ser anexados, removidos e notificados sobre as alterações no sujeito. Quando uma nova mensagem é adicionada, os observadores são notificados.

- `MessageDisplay`: Implementa a interface `Observer` e atua como um observador concreto no padrão Observer. Ele exibe as mensagens recebidas em seu método `update`.

- `Message`: Representa uma mensagem no sistema. Possui um conteúdo que pode ser obtido através do método `getContent()`.

## UML

![Captura de tela de 2023-06-15 23-08-32](https://github.com/LucasFelipe2142/Seminario_observer/assets/106194018/4fa4ff00-7641-487f-8907-5b8b04ed0ab5)

## Uso do Exemplo

O exemplo de código está contido nos arquivos `Main.java`, `MessageManager.java`, `MessageDisplay.java` e `Message.java`. O arquivo `Main.java` contém o método `main` que demonstra a utilização do padrão Observer.

Ao executar o programa, o `MessageManager` é criado como sujeito e dois `MessageDisplay` são criados como observadores. Os observadores são registrados no sujeito e, em seguida, algumas mensagens são adicionadas ao sujeito. Os observadores são notificados e exibem as mensagens recebidas.

## Pré-requisitos

- Java 8 ou superior.

## Executando o Exemplo

1. Clone o repositório para a sua máquina local.

2. Navegue até o diretório do projeto.

3. Compile os arquivos Java:

```bash
javac Main.java
```

4. Execute o programa:

```bash
java Main
```

5. Verifique a saída no console para ver as mensagens exibidas pelos observadores.

## PDF de referencia

[Seminario_Observer_Command.pdf](https://github.com/LucasFelipe2142/Seminario_observer/files/11770405/Seminario_Observer_Command.pdf)


## Autor

Lucas Felipe Felicio Santos
Email do Autor: lucasfelicio378@gmail.com

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema no código, tiver sugestões de melhorias ou novos
recursos, fique à vontade para abrir uma issue ou enviar um pull request.

