public class Main
{
    public static void main(String[] args)
    {
        int[] numeros = {4,1,7,9,3,0};
        for (int cicloAtual = 0; cicloAtual < numeros.length; cicloAtual++)
        {
            for (int posicaoAtual = 0; posicaoAtual < numeros.length - 1; posicaoAtual++)
            {
                if (numeros[posicaoAtual] > numeros[posicaoAtual + 1])
                {
                    int aux = numeros[posicaoAtual + 1];
                    numeros[posicaoAtual + 1] = numeros[posicaoAtual];
                    numeros[posicaoAtual] = aux;
                }
            }
        }
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.println(numeros[i]);
        }
    }
}