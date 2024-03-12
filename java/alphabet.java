public class alphabet {
    public static void main(String[] args) {
        for (int i = 0; i < 26; i++) {
            int ch1=('a'+i);
            char ch2=(char)('a'+i);
            System.out.printf("ASCII value of alphabet %c is %d",ch2,ch1);
            System.out.println();
        }
    }
}
