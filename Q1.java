
public class Q1 {
    public static void main(String[] args) {
        String jogo = "ludo";
        String tipo = "tabuleiro";
        if ((jogo.equals(null) || jogo.isEmpty())&&(tipo.equals(null)||tipo.isEmpty())){
            System.out.println("Nao é possivel informar os dados");
            System.out.println("Vazio");
        } else {
            System.out.println("jogo: "+ jogo);
            if (tipo.equals(null)||tipo.isEmpty()){
                System.out.println("Tipo Vazio");
            } else {
                System.out.println("tipo: "+ tipo);
            }
        } 
        System.out.println("FIM");
    }
}
