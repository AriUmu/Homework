package HWLesson7;

/**
 * Created by arina on 06.07.17.
 */
public class Color {
    public static String seeColor(String str) {
        String color;
        if(str.length() >=3){
            if(str.substring (0, 4).equals("blue")){
                color = str.substring (0, 4);
            }
            if (str.substring (0, 3).equals("red")){
                color = str.substring (0, 3);
            }
            else color = "";
        }
        else {
            color = "";
        }

        return color;
    }

    public static void main(String[] args) {

        System.out.println( seeColor("blue"));
    }
}
