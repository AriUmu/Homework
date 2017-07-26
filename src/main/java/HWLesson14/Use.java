package HWLesson14;

/**
 * Created by arina on 26.07.17.
 */
public class Use {
    public static void main(String[] args) {
        Pet pet = new Cat();
        Pet pet2 = new Ret();

        pet.feed();
        pet.play();
        pet.scratch();
        pet.wash();
        System.out.println();

        pet2.wash();


    }
}
