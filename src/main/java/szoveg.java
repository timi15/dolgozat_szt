public class szoveg {
    public static void main(String[] args) {
        System.out.println(szamol("Oda n�zz G�za! K�k az �g! De r�g volt ilyen.", '!'));
    }

    public static int szamol( String szoveg, char jel) {
        int mennyi=0;
        for (int i = 0; i < szoveg.length(); i++) {
            if(szoveg.charAt(i) == jel ){
                mennyi++;
            }
        }
    return mennyi;
    }
}
