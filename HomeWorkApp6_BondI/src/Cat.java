class Cat extends Animals {

    Cat(int limitToRun, int limitToSwim) {
        super(limitToRun, limitToSwim);
    }

    @Override
    public String swim(int dist) {
        return getNameClassAnimal() + " " + " don't swim";
    }
}




