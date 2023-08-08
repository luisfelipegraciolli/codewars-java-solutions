package solutions;
public class App {
    public static void main(String[] args) throws Exception {
        Maskify solutiuon1Maskify = new Maskify();
        String a = solutiuon1Maskify.maskify("lshsdcjdhs");
        System.out.println(a);

        Square solutionSquare = new Square();
        boolean b = solutionSquare.isSquare(110274472);
        System.out.println(b);

        DnaStrand solutionDnaStrand = new DnaStrand();
        String c = solutionDnaStrand.makeComplement("AAAA");
        System.out.println(c);

        StringToNumber solutionStringToNumber = new StringToNumber();
        int d = solutionStringToNumber.stringToNumber("1022");
        System.out.println(d);

        Kata solutionKata = new Kata();
        int[] e = solutionKata.countBy(2, 5);
        for (int i : e) {
            System.out.print(i + " ");

        }
        System.out.println("");

        numberToString solutionNumberToString = new numberToString();
        String f = solutionNumberToString.numberToString1(1123);
        System.out.println(f);
    }

    
}
