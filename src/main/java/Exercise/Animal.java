package Exercise;

/**
 * Created by arina on 27.07.17.
 */
class Animal {
    class Brain{

    }

    void move(){
    }

    Animal bihavior(final boolean work){
        class Heart extends Animal {

        }
        return new Heart();
    }
    static class Tail {
        void wiggle(){

        }

    }
}

class CreatAnimal {
    public static void main(String[] args) {
        Animal monkey = new Animal();
        Animal.Brain brainMonkey = monkey.new Brain();

        Animal.Tail tail = new Animal.Tail();
        tail.wiggle();


        System.out.println(monkey.bihavior(true).getClass());

        Animal cow = new Animal(){
            @Override
            void move() {
                System.out.println("Muuuuuuu!");
            }
        };


    }
}
