package fa.ru.exam.task26;

public class CMYKConverter extends ColorModel {
    public CMYKConverter(double[] values) {
        super(values);
    }

    @Override
    public double[] convert(ColorModel targetModel) {
        if (targetModel instanceof RGBConverter) {
            double[] convertedValues = new double[4];
            double c = values[0];
            double m = values[1];
            double y = values[2];
            double k = values[3];
            convertedValues[0] = 255 * (1 - c) * (1 - k);
            convertedValues[1] = 255 * (1 - m) * (1 - k);
            convertedValues[2] = 255 * (1 - y) * (1 - k);
            return convertedValues;
        } else {
            return null;
        }
    }
}
