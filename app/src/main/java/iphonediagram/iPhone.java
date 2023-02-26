/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package iphonediagram;

import iphonediagram.interfaces.AparelhoTelefonico;
import iphonediagram.interfaces.NavegadorWeb;
import iphonediagram.interfaces.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorWeb {

    public static void main(String[] args) {
        
        iPhone phone = new iPhone();

        phone.tocar();
        phone.ligar();
        phone.adicionarNovaAba();

    }

    @Override
    public void adicionarNovaAba() {

        System.out.println("Adicionando nova aba...");

    }

    @Override
    public void exibirPagina(Pagina pagina) {

        if (pagina.visibilidade) System.out.println("Exibindo página: " + pagina.url + " ...");

        else System.out.println("Pagina " + pagina.url + " indisponivel.");

    }

    @Override
    public void atualizarPagina(Pagina pagina) {
    
        System.out.println("Atualizando páina: " + pagina.url + " ...");
    
    }

    @Override
    public void tocar() {

        System.out.println("Tocando...");

    }

    @Override
    public void pausar() {

        System.out.println("Pausando...");

    }

    @Override
    public void selecionarMusica(Musica musica) {
        
        System.out.println("Música escolhida: " + musica.nome + ".");
        
    }

    @Override
    public void ligar() {

        System.out.println("Ligando...");

    }

    @Override
    public void atender() {

        System.out.println("Atendendo...");

    }

    @Override
    public void iniciarCorreioVoz(Audio audio) {
        
        System.out.println("Iniciando áudio com " + audio.duracao + " segundos de duração...");
    
    }
}
