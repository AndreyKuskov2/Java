package org.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String expression;
    private String result;

    // Геттеры и сеттеры

    public String getExpression() {
        return expression;
    }

    public String getResult() {
        return result;
    }

    public Calculation() {
    }

    public Calculation(String expression, String result) {
        this.expression = expression;
        this.result = result;
    }
}
