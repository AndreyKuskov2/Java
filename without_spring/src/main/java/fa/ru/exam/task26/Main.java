package fa.ru.exam.task26;

import fa.ru.exam.task26.CMYKConverter;
import fa.ru.exam.task26.RGBConverter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] rgbValues = {100, 150, 200};
        RGBConverter rgbConverter = new RGBConverter(rgbValues);

        double[] cmykValues = {0.2, 0.3, 0.4, 0.1};
        CMYKConverter cmykConverter = new CMYKConverter(cmykValues);

        double[] convertedRGB = rgbConverter.convert(cmykConverter);
        System.out.println("Converted RGB values: " + Arrays.toString(convertedRGB));

        double[] convertedCMYK = cmykConverter.convert(rgbConverter);
        System.out.println("Converted CMYK values: " + Arrays.toString(convertedCMYK));
    }
}
