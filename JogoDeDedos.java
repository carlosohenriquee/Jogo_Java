import java.util.Random;

import javax.swing.JOptionPane;

public class JogoDeDedos {
    public static void main(String[] args) {
        
        String jogadaComputador = valorSorteado();


        String resposta = JOptionPane.showInputDialog(null,"Digite: Pedra, Papel ou Tesoura", "Jokenpo",1);
        if(resposta.equals("Pedra") && jogadaComputador.equals("Pedra")) {
            JOptionPane.showMessageDialog(null,"Empate!","Jokenpo", 2);
        }else if(resposta.equals("Pedra") && jogadaComputador.equals("Papel")){
            JOptionPane.showMessageDialog(null,"Você perdeu! o computador jogou "+jogadaComputador,"Jokenpo",2);
        }else if(resposta.equals("Pedra") && jogadaComputador.equals("Tesoura")) {
            JOptionPane.showMessageDialog(null, "Você ganhou! o computador "+jogadaComputador,"Jokepo",2);
        }else if(resposta.equals("Tesoura") && jogadaComputador.equals("Tesoura")) {
            JOptionPane.showMessageDialog(null,"Empate!","Jokenpo", 2);
        }else if(resposta.equals("Tesoura") && jogadaComputador.equals("Pedra")){
            JOptionPane.showMessageDialog(null,"Você perdeu! o computador jogou "+jogadaComputador,"Jokenpo",2);
        }else if(resposta.equals("Tesoura") && jogadaComputador.equals("Papel")) {
            JOptionPane.showMessageDialog(null, "Você ganhou! o computador "+jogadaComputador,"Jokepo",2);
        }else if(resposta.equals("Papel") && jogadaComputador.equals("Papel")) {
            JOptionPane.showMessageDialog(null,"Empate!","Jokenpo", 2);
        }else if(resposta.equals("Papel") && jogadaComputador.equals("Tesoura")){
            JOptionPane.showMessageDialog(null,"Você perdeu! o computador jogou "+jogadaComputador,"Jokenpo",2);
        }else if(resposta.equals("Papel") && jogadaComputador.equals("Pedra")) {
            JOptionPane.showMessageDialog(null, "Você ganhou! o computador "+jogadaComputador,"Jokepo",2);
                      
        }
        
        System.out.println(jogadaComputador);
    }

    public static String valorSorteado(){

        Random numeroAleatorio = new Random();
        int numeroSecreto = numeroAleatorio.nextInt(3);
        
        String jogada = "  ";

        switch (numeroSecreto) {
            case 0:
                jogada = "Pedra";
                break;
            case 1:
                jogada = "Papel";
                break;
            case 2:
                jogada = "Tesoura";
                break;
            default:
                break;
        }

        return jogada;
    }
}