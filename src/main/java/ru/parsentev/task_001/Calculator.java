package ru.parsentev.task_001;

import org.slf4j.Logger;

import java.util.function.BiFunction;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author parsentev
 * @since 18.07.2016
 */
public class Calculator {
    private static final Logger log = getLogger(Calculator.class);

    private final BiFunction<Double, Double, Double> add = (a, b) -> a + b;
    private final BiFunction<Double, Double, Double> substract = (a, b) -> a - b;
    private final BiFunction<Double, Double, Double> multiple = (a, b) -> a * b;
    private final BiFunction<Double, Double, Double> div = (a, b) -> a / b;
    private double result = 0;

    public double getResult() {
        return result;
    }

    public void add(double first, double second) {
        result = add.apply(first, second);
    }

    public void substract(double first, double second) {
        result = substract.apply(first, second);
    }

    public void multiple(double first, double second) {
        result = multiple.apply(first, second);
    }


    public void div(double first, double second) {
        if (second == 0) {
            throw new IllegalStateException();
        }
        result = div.apply(first, second);
    }

    public void expand(double first, double second) {
        result = 1d;
    }
}
