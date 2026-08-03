public class App {
    public static void main(String[] args) throws Exception {
        String filme = "Vingadores"; // Declarado
        int anoLancamento = 2015;
        int duracao = 240;
        double notaCritica = 8.7;
        char letraInicial = 'V';
        boolean foiSucesso = true;

        System.out.println("O filme " + filme); // esse tipo de colocar o +, agente está concatenando
        System.out.println("Ano de Lançamento " + anoLancamento);
        System.out.println("Duração do Filme " + duracao);
        System.out.println("Nota média: " + notaCritica);
        System.out.println("Letra Inicial " + letraInicial);
        System.out.println("Foi sucesso? " + foiSucesso);

        System.out.format( "O filve %s foi lançado em %d tem uma duração de %d minutos. \n",filme, anoLancamento, duracao); // A impresão no formato de Format, Usa o %s para String e o %d para int

        String canal = "Academia dos Devs ";
        String mensagem = " Vamos aprender Java ";
        String mensagem2 = " Seja-bem-vindo";

        String mensagemFinal = canal + mensagem + mensagem2;

        System.out.println(mensagemFinal);


        
    }
}
