package solutions;
public class Maskify {
    public static String maskify(String str) {
        char[] meuArray = str.toCharArray();
        int tamanhoString = meuArray.length;
        int dif = tamanhoString - 4;

        for (int i = 0; i < tamanhoString; i++) {

            if (i < dif) {
                meuArray[i] = '#';
            }
        }

        String resultado = new String(meuArray);
        return resultado;
    }
}
