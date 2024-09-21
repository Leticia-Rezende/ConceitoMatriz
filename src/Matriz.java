import java.util.Scanner;

public class Matriz {
    int[][] a;
    int[][] b;
    int[][] resultado;

    //Construtor sem parametro
    public Matriz(int qtLinhas, int qtColuna) {
        this.a = new int[qtLinhas][qtColuna];
        this.b = new int[qtLinhas][qtColuna];
        this.resultado = new int[qtLinhas][qtColuna];
    }

    //Construtor com parametro
    public Matriz(int[][] a, int[][] b) {
        this.a = a;
        this.b = b;
        this.resultado = new int[a.length][a[0].length];
    }

    //Metodos
    public void imprimirDimensao() {
        System.out.println("Total de linhas de A: " + a.length);
        System.out.println("Total de colunas de A: " + a[0].length);
        System.out.println("Total de linhas de B: " + a.length);
        System.out.println("Total de colunas de B: " + a[0].length);
    }

    public void imprimirMatriz() {
        int l, c;
        // Imprimir matriz A
        System.out.println("\n Matriz A : ");
        for (l = 0; l < this.a.length; l++) { // inicializa ; condição ; incremento
            System.out.println(" ");
            for (c = 0; c < this.a[1].length; c++) {
                System.out.print("\t" + this.a[l][c]); // "\t" coloca o TAB do teclado
            }
        }
        // Imprimir matriz B
        System.out.println("\n Matriz B : ");
        for (l = 0; l < this.b.length; l++) { // inicializa ; condição ; incremento
            System.out.println(" ");
            for (c = 0; c < this.b[1].length; c++) {
                System.out.print("\t" + this.b[l][c]); // "\t" coloca o TAB do teclado
            }
        }
        // Imprimir matriz Resultante
        System.out.println("\n Matriz Resultante : ");
        for (l = 0; l < this.resultado.length; l++) { // inicializa ; condição ; incremento
            System.out.println(" ");
            for (c = 0; c < this.resultado[1].length; c++) {
                System.out.print("\t" + this.resultado[l][c]); // "\t" coloca o TAB do teclado
            }
        }
    }
    public void lerMatriz(){
        Scanner entrada = new Scanner(System.in);
        int c, l;
        //ler matriz A
        for (l = 0; l < this.a.length; l++){
            for (c = 0; c < this.a[0].length; c++){
                System.out.println("Entre com o elemento A [" + l + "] [" + c + "]: ");
                a[l][c] = entrada.nextInt();
            }
        }
        //ler matriz B
        for (l = 0; l < this.b.length; l++){
            for (c = 0; c < this.b[0].length; c++){
                System.out.println("Entre com o elemento B [" + l + "] [" + c + "]: ");
                b[l][c] = entrada.nextInt();
            }
        }
    }
    public void soma(){
        int l, c;
        for(l = 0; l < a.length; l++)
            for (c = 0; c < a[0].length; c++){
                resultado[l][c] = a[l][c] + b[l][c];
            }
        }
    }



