public class Tema6Exmplo4 {
    public static void main(String[] args) {
        String[][] produtos = new String[5][2];

        produtos[0][0] = "Frutas";
        produtos[0][1] = "Verduras";
         
        produtos[1][0] = "Abacaxi";
        produtos[2][0] = "Abacate";
        produtos[3][0] = "Laranja";
        produtos[4][0] = "Mamão";

        produtos[1][1] = "Alface";
        produtos[2][1] = "Couve";
        produtos[3][1] = "Chicória";
        produtos[4][1] = "Almeirão";

        System.out.println("Imprimindo a lista");
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("\t ");
            for(int j = 0; j < 2; j++){
                System.out.print(produtos[i][j]+ "\t\t");
            }
        }
    }
}
