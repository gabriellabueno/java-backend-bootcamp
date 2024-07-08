# POO - Desafio

## Modelagem e Diagramação de um Componente iPhone

### Diagrama UML

```mermaid

classDiagram

    class IPhone
		IPhone --|> ReprodutorMusical
		IPhone --|> AparelhoTelefonico
		IPhone --|> Navegador
        
	class ReprodutorMusical 
	<<interface>> ReprodutorMusical 
		ReprodutorMusical : + tocar()
		ReprodutorMusical : + pausar()
		ReprodutorMusical : + selecionarMusica(String musica)
    
    class IPod 
    IPod --|> ReprodutorMusical

	class AparelhoTelefonico 
	<<interface>> AparelhoTelefonico 
		AparelhoTelefonico : + ligar(String numero)
		AparelhoTelefonico : + atender()
		AparelhoTelefonico : + iniciarCorreioVoz()

	class Navegador 
	<<interface>> Navegador 
		Navegador : + exibirPagina(String url)
		Navegador : + adicionarNovaAba()
		Navegador : + atualizarPagina()
    
    class Macintosh
    Macintosh --|> Navegador

```

### Modelagem

- [Produtos](https://github.com/gabriellabueno/java-backend-bootcamp/tree/main/src/poo/desafio/produtos)  
- [Utilitários](https://github.com/gabriellabueno/java-backend-bootcamp/tree/main/src/poo/desafio/utilitarios)  
- [Apple](Apple.java)  