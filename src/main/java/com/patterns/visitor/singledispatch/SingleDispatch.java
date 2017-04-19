package com.patterns.visitor.singledispatch;

public class SingleDispatch {

    public static void main(String[] args) {

        /** The actual method implementation to be called is chosen at runtime based solely on the actual type of ship.
         *  So, only the type of a single object is used to select the method, hence the name single dispatch.
         */
        Prey prey = new Sheep();
        prey.preyName(); //Prints 'Sheep'


        /**
         * Reference and Object types are same
         * Output:
         * "Predator eats Prey
         * Lion eats Sheep"
         */
        Prey basicPrey = new Prey();
        Sheep sheep = new Sheep();

        Predator basicPredator = new Predator();
        Lion lion = new Lion();

        basicPredator.eats(basicPrey);
        lion.eats(sheep);

        /**
         * Java doesnt suport Double Dispatch
         * Output:
         * Lion eats Prey
         *
         * The method chosen is only based on the lionPredator, not the sheepPrey.
         * If double dispatch is supported, output would be "Lion eats Sheep"
         * Here single dispatch is done based on runtime type of the the predator, not on the runtime type of prey.
         * In summary, the dispatch for eats is based solely on the actual run-time type of predator
         * and has nothing at all to do with the run-time type of the supplied parameters.
         * Multiple dispatch is a concept that allows method dispatch to be based not only on the receiving object
         * but also on the parameters of the method's invocation.
         */
        Predator lionPredator = new Lion();
        Prey sheepPrey = new Sheep();
        lionPredator.eats(sheepPrey);
    }
}
