package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class RandomNumberController {

    @GetMapping("/")
    public String showForm() {
        return "numberGenerator";
    }

    @PostMapping("/")
    public String generateNumbers(@RequestParam("min") int min,
                                  @RequestParam("max") int max,
                                  Model model) {
        List<Integer> numbers = generateRandomNumbers(min, max, 1000);
        double average = calculateAverage(numbers);

        model.addAttribute("numbers", numbers);
        model.addAttribute("average", average);

        return "numberGenerator";
    }

    private List<Integer> generateRandomNumbers(int min, int max, int count) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            numbers.add(randomNumber);
        }

        return numbers;
    }

    private double calculateAverage(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.size();
    }
}
