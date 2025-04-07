public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacoes;
    int qtdAvaliacoes;

    void exibirFichaTecnica (){
        System.out.println("Título da Música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Lançamento: " + anoLancamento);
    }

    void avalia (double nota){
        somaAvaliacoes += nota;
        qtdAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacoes / qtdAvaliacoes;
    }
}
