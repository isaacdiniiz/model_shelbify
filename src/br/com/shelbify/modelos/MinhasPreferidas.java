package br.com.shelbify.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " eh considerado sucesso absoluto!");
        } else {
            System.out.println(audio.getTitulo() + " tambem eh uma excelente opcao.");
        }
    }
}
