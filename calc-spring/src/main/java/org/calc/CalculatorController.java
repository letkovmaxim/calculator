package org.calc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/calc")
    public Calculator calc(@RequestParam(value = "x", defaultValue = "0") String x,
                           @RequestParam(value = "op", defaultValue = "add") String op,
                           @RequestParam(value = "y", defaultValue = "0") String y) {
        return new Calculator(Double.parseDouble(x), op, Double.parseDouble(y));
    }
}
