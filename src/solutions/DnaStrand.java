package solutions;

public class DnaStrand {
    public static String makeComplement(String dna) {
        char[] meuArrayDNA = dna.toCharArray();

        for (int i = 0; i < meuArrayDNA.length; i++) {
            if (meuArrayDNA[i] == 'A') {
                meuArrayDNA[i] = 'T';
            } else if (meuArrayDNA[i] == 'T') {
                meuArrayDNA[i] = 'A';
            } else if (meuArrayDNA[i] == 'C') {
                meuArrayDNA[i] = 'G';
            } else if (meuArrayDNA[i] == 'G') {
                meuArrayDNA[i] = 'C';
            }
        }
        dna = new String(meuArrayDNA);
        return dna;
    }
}
