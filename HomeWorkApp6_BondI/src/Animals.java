class Animals implements AnimalsCan{
    private int limitToRun;
    private int limitToSwim;
    private String nameClassAnimal;

    Animals(int limitToRun, int limitToSwim) {
        this.limitToRun = limitToRun;
        this.limitToSwim = limitToSwim;
        nameClassAnimal = getClass().getSimpleName();
    }

    public int getLimitToRun() {
        return limitToRun;
    }

    public void setLimitToRun(int limitToRun) {
        this.limitToRun = limitToRun;
    }

    public int getLimitToSwim() {
        return limitToSwim;
    }

    public void setLimitToSwim(int limitToSwim) {
        this.limitToSwim = limitToSwim;

    }
    public String getNameClassAnimal() {
        return nameClassAnimal;
    }

    @Override
    public String run(int dist) {
        if (dist > limitToRun) {
            return  nameClassAnimal  + " can't run " + dist;
        } else  {
            return nameClassAnimal  + " can run " + dist;
        }
    }

    @Override
    public String swim(int dist) {
        if (dist > limitToSwim) {
            return  nameClassAnimal  + " can't swim " + dist;
        } else  {
            return nameClassAnimal  + " can swim " + dist;
        }
    }
    public String toString() {
        return  nameClassAnimal +  " can run: " + limitToRun + " , can swim: " + limitToSwim;
    }
}




