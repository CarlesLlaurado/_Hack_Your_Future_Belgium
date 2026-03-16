package composition.exercises.ComputerWithProcessor;

/**
 TODO:
 1. Create class Processor with method processData().
 2. Create class Computer that HAS-A Processor.
 3. In main(), create a Computer and call processData() through it.
*/

public class Computer
{
    private Processor processor;

    public Computer (Processor processor) {
        this.processor = processor;
    }

    public void startComputer()
    {
        processor.processData();
        System.out.println("Data is processed");
    }

    public static void main(String[] args) {
        Processor processor = new Processor();
        Computer computer = new Computer(processor);
        computer.startComputer();
    }
}
