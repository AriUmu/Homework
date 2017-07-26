package HWLesson14;

/**
 * Created by arina on 26.07.17.
 */
public class Ret implements Pet {
    private Brain brain = new Hungry();

    public void feed() {
        brain.feed();
    }

    public void play() {
        brain.play();
    }

    public void scratch() {
        brain.scratch();
    }

    public void wash() {
        brain.wash();
    }

    private class Hungry implements Brain{

        public void feed() {
          bite();
          angry();
        }

        public void play() {
            voice();
            tail();
        }

        public void scratch() {
            bite();
            run();
        }

        public void wash() {
            angry();
        }
    }

    private class Fed implements Brain{

        public void feed() {
            voice();
        }

        public void play() {
            tail();
            voice();
        }

        public void scratch() {
            run();
        }

        public void wash() {
            bite();
        }
    }

    private void bite() {
        System.out.println("Bite and run away");
    }

    private void angry() {
        System.out.println("PI-PI-PI!");
    }

    private void voice() {
        System.out.println("pi-pi-pi");
    }

    private void tail() {
        System.out.println("fast wag the tail");
    }
    private void run(){
        System.out.println("fast run away");
    }

}
