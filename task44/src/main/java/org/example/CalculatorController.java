package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @Autowired
    private CalculationRepository calculationRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("calculations", calculationRepository.findAll());
        return "index.html";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("expression") String expression, Model model) {
        String result = performCalculation(expression);
        Calculation calculation = new Calculation(expression, result);
        calculationRepository.save(calculation);
        return "redirect:/";
    }

    private String performCalculation(String expression) {
        String[] tokens = expression.split("\\s+"); // Разделение выражения на отдельные токены (числа и операторы)

        if (tokens.length != 3) {
            throw new IllegalArgumentException("Invalid expression"); // Неправильный формат выражения
        }

        try {
            double operand1 = Double.parseDouble(tokens[0]);
            double operand2 = Double.parseDouble(tokens[2]);
            String operator = tokens[1];

            double result;
            switch (operator) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator"); // Неподдерживаемый оператор
            }

            return String.valueOf(result);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid operands"); // Неправильный формат чисел
        }
    }

}

