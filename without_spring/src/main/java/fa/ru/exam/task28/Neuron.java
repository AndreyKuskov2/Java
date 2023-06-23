package fa.ru.exam.task28;

public class Neuron {
    private double[] inputs;
    private double[] weights;
    private double output;

    public Neuron(int numInputs) {
        inputs = new double[numInputs];
        weights = new double[numInputs];
        for (int i = 0; i < numInputs; i++) {
            weights[i] = Math.random();
        }
    }

    public double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }

    public void feedForward() {
        double sum = 0;
        for (int i = 0; i < inputs.length; i++) {
            sum += inputs[i] * weights[i];
        }
        output = sigmoid(sum);
    }

    public void setInputs(double[] inputs) {
        this.inputs = inputs;
    }

    public double getOutput() {
        return output;
    }
}
