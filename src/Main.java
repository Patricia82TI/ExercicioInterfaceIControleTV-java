

//Faça um programa com uma interface ICONTROLETV com um metdo virtual vazio
//IMPRIRFUNCOES, e crie duas classes de sua escolha que imprimam diferentes funções
//para cada tipo de TV.
public class Main {
    public static void main(String[] args) {

        SmarTV smarTV = new SmarTV();
        smarTV.imprimirFuncoes();

        TuboTV tuboTV = new TuboTV();
        tuboTV.imprimirFuncoes();

    }
}