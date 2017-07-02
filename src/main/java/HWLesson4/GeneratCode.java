package HWLesson4;

import java.util.Random;

/**
 * Created by arina on 29.06.17.
 */
public class GeneratCode {

        static final byte[] ALPHABET = {'A', 'C', 'T', 'G'};

        public static byte[] generate(int size){

            byte[] code = new byte[size];
            Random random = new Random();

            for (int i = 0; i < code.length ; i++) {
                code[i] = ALPHABET[random.nextInt(4)];
                System.out.print((char) code[i] + " ");
            }
            System.out.println();

            return code;
        }

    public static void main(String[] args) {
        generate(30);
    }

}
