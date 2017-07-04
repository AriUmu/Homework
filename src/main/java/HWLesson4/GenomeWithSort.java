package HWLesson4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by arina on 01.07.17.
 */
public class GenomeWithSort { //дз - доделать с помощью hashCode + CodingBat на логику и побитовые опрации

    private static final int GENOME_SIZE = 10;
    private static final int WORD_SIZE = 3;

    static class Word implements Comparable<Word> {
        int offset;
        byte[] data;

        public Word(byte[] data, int offset) {
            this.offset = offset;
            this.data = data;
        }

        public int compareTo(Word otherWord) {
            for (int i = 0; i < WORD_SIZE; i++) {
                int diff = data[offset + i] - data[otherWord.offset + i];
                if (diff != 0){
                    return diff;
                }
            }
            return 0;
        }

        @Override
        public String toString() {
            for (int idx = offset; idx < offset + WORD_SIZE; idx++) {
                System.out.print((char) data[idx] + " ");
            }
            return "";
        }
    }


    public static void main(String[] args) {
        byte[] code = GeneratCode.generate(GENOME_SIZE);

        List<Word> list = new ArrayList<Word>();

        for (int i = 0; i < GENOME_SIZE - WORD_SIZE; i++) {
            for (int j = 0; j < WORD_SIZE ; j++) {
                list.add(new Word(code, i+j));
            }
        }
        for (int i = 1; i < list.size(); i++) {
            Collections.sort(list);
            //System.out.println(list.get(i));
        }

    }
}
