package HWLesson2;

/**
 * Created by arina on 24.06.17.
 */
public class SignUnit {
    public static int sign(int i) {
        if (i == 0){
            return 0;
        }
        return i > 0 ? 1 : -1;
    }
}
