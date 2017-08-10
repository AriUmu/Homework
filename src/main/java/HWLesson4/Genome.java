package HWLesson4;

/**
 * Created by arina on 29.06.17.
 */
public class Genome {

    public static void rework(byte[] code, int m){
        for (int i = 0; i < code.length - m ; i++) {
            for (int j = i + 1; j < code.length - m; j++) {
                boolean flag = false;

               INNER: for (int k = 0; k < m ; k ++) {
                    if(code[j] == code[i]){
                        flag = true; // если совпадает

                        j++;
                        i++;
                        if(k == m-1){
                            for (int l = m; l > 0; l--) {
                                System.out.print((char) code[i - l]);
                            }
                            System.out.print(" " + i + " " + j +  ", ");
                        }
                        continue INNER;


                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        byte[] code = GeneratCode.generate(100);
        long start = System.nanoTime();
        rework(code, 3);
        long finish = System.nanoTime();
        System.out.println();
        System.out.println("Time " + (finish - start)); //713142

    }
}
