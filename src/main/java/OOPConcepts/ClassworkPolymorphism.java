package OOPConcepts;

public class ClassworkPolymorphism {
        public static void main(String[] args) {
            Insect myInsect = new Butterfly();
            myInsect.startFlying();

            Insect insect = new Insect();
            insect.startFlying();
        }

    }
    class Insect {
        void startFlying(){
            System.out.println("Bug Flew Away!");
        }
    }

    class Butterfly extends Insect {
        @Override
        void startFlying(){
            System.out.println("Swoosh!");
        }
    }

