public interface Edible {

    public String howToEat();
}

class Chickens implements Edible{
    @Override
    public String howToEat() {
        return "Fry it";
    }
}

class Ducks implements Edible{

    @Override
    public String howToEat() {
        return "roast on fire";
    }
}

class Broccoli implements Edible{

    @Override
    public String howToEat() {
        return "boil it";
    }
}
