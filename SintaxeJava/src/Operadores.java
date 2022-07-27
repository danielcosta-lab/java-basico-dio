import javax.swing.DefaultSingleSelectionModel;

public class Operadores {
    
    // operador de atribuição representado com o simbolo "="
    String nome = "Daniel";
    int idade = 28;
    double peso = 70;
    char sexo = 'M';
    
    // operadores aritmeticos são: + (adição), - (subtração), * (multiplicação) e / (divisão)
    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicação = 20 * 7;
    int divisao = 15 / 3 ;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20 / 4);

    // usado o operador aritmetico de adição para contatenar a junção de duas palavras "+"
    public static void main (String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);
    }


    // operadores unarios (incrementam, decrementam, invertem valores numericos e booleanos)
    public static void main (String[] args) {
        int numero = 5;
        
        numero = - numero;

        System.out.println(numero);
        
    }

    public static void main (String[] args) {
        int numero = 5;

        //numero = numero + 2;

        
        System.out.println( ++ numero); //realiza o incremento da variavel numero +1;

        System.out.println(numero); //imprimi a variavel já incrementada

        System.out.println( -- numero); //realiza o decremento da variavel numero -1;

        System.out.println(numero); //imprimi a variavel já decrementada
    }

    // negando uma variavel, inversão de uma variavel booleana
    public static void main (String[] args){
        boolean variavel = true;

        variavel = !variavel;

        System.out.println(!variavel);

    }

    // operador de condição ternária
    public static void main (String[] args) {
        int a, b;

        a = 5;
        b = 6;

        String resultado = "";
        if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

    // usando a condição ternária, onde é representado pelos simbolos ? e : assim abreviando as condições if e else
        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);
    }

    // operadores relacionais (avaliam a relação entre duas variavies ou expressões)
    public static void main (String[] args){
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero1 é igual ao Numero2?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero1 é diferente do Numero2?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero1 é maior que Numero2?" + simNao);

    }

    // operadores Lógicos
    public static void main (String [] args) {
        boolean condicao1= true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras"); // usando o operador lógico && (E) não realizara nenhuma impressão pois apenas a condição1 é verdadeira
        }

        if (condicao1 || condicao2) {
            System.out.println("As duas condições são verdadeiras"); // usando o operador lógico || (OU) realizara a impressão apenas da condição que é verdadeira
        }

        
    }
}
