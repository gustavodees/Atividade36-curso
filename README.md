# Calculadora de Média de Alturas em Java

Este projeto consiste em um programa Java simples que calcula a média das alturas de um grupo de pessoas. O usuário informa a quantidade de pessoas e, em seguida, a altura de cada uma, e o programa calcula e exibe a média das alturas.

**Autor:** gustavodees

## Arquivos Incluídos

* `principal/Main.java`: Contém a classe principal com o método `main`, responsável por obter a entrada do usuário e realizar o cálculo da média das alturas.

## Como Usar

1.  **Salve o arquivo:** Salve o código fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile o arquivo Java utilizando o compilador Java:

    ```bash
    javac principal/Main.java
    ```

3.  **Execute o programa:** Após a compilação ser concluída com sucesso, execute a classe `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Entrada de Dados:** O programa solicitará que você digite a quantidade de pessoas. Insira o número e pressione Enter. Em seguida, para cada pessoa, o programa pedirá que você digite a altura. Insira a altura de cada pessoa e pressione Enter.

5.  **Resultado:** Após inserir a altura de todas as pessoas, o programa exibirá a média das alturas, formatada com duas casas decimais.

## Explicação do Código

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria um objeto da classe `Scanner` para permitir a leitura de dados inseridos pelo usuário no console.
    2.  Solicita ao usuário que digite a quantidade de pessoas e armazena esse valor na variável inteira `n`.
    3.  Cria um array de números decimais (`double`) chamado `vect` com o tamanho especificado por `n`. Este array será utilizado para armazenar as alturas de cada pessoa.
    4.  Utiliza um loop `for` para iterar `n` vezes (para cada pessoa). Em cada iteração:
        * Solicita ao usuário que digite a altura da pessoa.
        * Lê a altura inserida pelo usuário (um número decimal) e armazena no array `vect` na posição correspondente ao índice `i`.
    5.  Inicializa uma variável `double` chamada `soma` com o valor 0.0. Esta variável será usada para acumular a soma de todas as alturas.
    6.  Utiliza outro loop `for` para percorrer o array `vect` novamente. Em cada iteração:
        * Adiciona o valor da altura armazenada em `vect[i]` à variável `soma`.
    7.  Calcula a média das alturas dividindo a `soma` pelo número de pessoas `n` e armazena o resultado na variável `double` chamada `media`.
    8.  Utiliza o método `printf` para exibir a média das alturas, formatada com duas casas decimais.
    9.  Fecha o objeto `Scanner` para liberar os recursos.
