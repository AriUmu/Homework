package HWLesson14;

/**
 * Created by arina on 25.07.17.
 */
public class Cat implements Pet, Brain {

    Brain brain = new Hungry();

    private class Hungry implements Brain { //когда собака голодная

        public void feed() {
            tail();
            brain = new Fed();
        }

        public void play() {
            voice();

        }

        public void scratch() { //царапаться
            angry();
            voice();
        }

        public void wash() {
            bite();
        }
    }
    private class Fed implements Brain { //сытый мозг

        public void feed() {
            voice();
        }

        public void play() {
            tail();
            voice();
            tail();
        }

        public void scratch() {
            tail();
            voice();
        }

        public void wash() {
            tail();
        }
    }

    private void bite() {
        System.out.println("Bite and run away");
    }

    private void angry() {
        System.out.println("Psh-sh-sh!!!!!");
    }

    private void voice() {
        System.out.println("Mur-mur-mur");
    }

    private void tail() {
        System.out.println("wag the tail");
    }


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
}
