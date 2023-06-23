package fa.ru.exam.task28;

public class Main {
    public static void main(String[] args) {
        Neuron neuron = new Neuron(2);
        double[] inputs = {0.5, 0.8};
        neuron.setInputs(inputs);
        neuron.feedForward();
        System.out.println("Output: " + neuron.getOutput());
    }
}
