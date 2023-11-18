class EvenNumber {

    private int value;

    public EvenNumber() {
        value = 0;
    }

    public EvenNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public EvenNumber getNext() {
        return new EvenNumber(value + 2);
    }

    public EvenNumber getPrevious() {
        return new EvenNumber(value - 2);
    }
}


class Exercise12_08Extra {

    public static void main(String[] args) {
        EvenNumber evenNumber = new EvenNumber(16);
        System.out.println(evenNumber.getNext().getValue());
        System.out.println(evenNumber.getPrevious().getValue());
    }
}