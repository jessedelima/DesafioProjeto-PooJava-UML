package DesafioProjetoPOOJavaUML;

public class Iphone {
   public static void main(String[] args) {

    ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
    reprodutorMusical.tocar();
    reprodutorMusical.pausar();
    reprodutorMusical.selecionarMusica();

    AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
    aparelhoTelefonico.ligar();
    aparelhoTelefonico.atender();
    aparelhoTelefonico.iniciarCorreioVoz();

    NavegadorNaInternet navegadorNaInternet = new NavegadorNaInternet();
    navegadorNaInternet.exibirPagina();
    navegadorNaInternet.adicionarNovaAba();
    navegadorNaInternet.atualizarPagina();
   }

} 
