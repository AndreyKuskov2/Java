package fa.ru.exam.task26;

public class RGBConverter extends ColorModel {
    public RGBConverter(double[] values) {
        super(values);
    }

    @Override
    public double[] convert(ColorModel targetModel) {
        if (targetModel instanceof CMYKConverter) {
            double[] convertedValues = new double[3];
            double r = values[0];
            double g = values[1];
            double b = values[2];
            double c = 1 - (r / 255);
            double m = 1 - (g / 255);
            double y = 1 - (b / 255);
            double k = Math.min(c, Math.min(m, y));
            convertedValues[0] = 255 * (1 - c) * (1 - k);
            convertedValues[1] = 255 * (1 - m) * (1 - k);
            convertedValues[2] = 255 * (1 - y) * (1 - k);
            return convertedValues;
        } else {
            return null;
        }
    }
}
