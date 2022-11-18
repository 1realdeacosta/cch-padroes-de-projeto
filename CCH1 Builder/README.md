Esse padrão é especialmente útil quando é necessário criar um objeto com muitas opções de configuração.

Nesse exemplo o builder permite a criação de diferentes tipos de computadores. Basico, medio e top.

A classe diretor implementa os métodos de criação do computador e controla a ordem da construção. Ao instanciar um objeto para criação do computador, o tipo é atribuido a um objeto builder porque o diretor não pode saber o tipo de produto resultante