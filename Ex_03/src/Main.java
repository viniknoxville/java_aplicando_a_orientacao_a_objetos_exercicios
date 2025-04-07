public class Main {
    public static void main(String[] args) {

        Musica musica = new Musica();

        musica.titulo = "Gimme More";
        musica.artista = "Britney Spears";
        musica.anoLancamento = 2007;

        musica.exibirFichaTecnica();

        musica.avalia(10);
        musica.avalia(8.9);
        musica.avalia(9.6);

        double mediaAvaliacoes = musica.pegaMedia();
        System.out.println("Media das avaliações: " + mediaAvaliacoes);
    }
}
