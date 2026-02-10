package methods.examples;

class Counter {

    int value = 0;

    static int factor = 5;

    void increment() {
        this.value++;
    }

    //Key idea is: Instance methods work with object state.
}
