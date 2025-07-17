package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String currentNumber = "";
    private String operator = "";
    private String previousNumber = "";
    private boolean operatorPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);

        // Number buttons
        findViewById(R.id.btn0).setOnClickListener(this::onNumberClick);
        findViewById(R.id.btn1).setOnClickListener(this::onNumberClick);
        findViewById(R.id.btn2).setOnClickListener(this::onNumberClick);
        findViewById(R.id.btn3).setOnClickListener(this::onNumberClick);
        findViewById(R.id.btn4).setOnClickListener(this::onNumberClick);
        findViewById(R.id.btn5).setOnClickListener(this::onNumberClick);
        findViewById(R.id.btn6).setOnClickListener(this::onNumberClick);
        findViewById(R.id.btn7).setOnClickListener(this::onNumberClick);
        findViewById(R.id.btn8).setOnClickListener(this::onNumberClick);
        findViewById(R.id.btn9).setOnClickListener(this::onNumberClick);

        // Operator buttons
        findViewById(R.id.btnAdd).setOnClickListener(this::onOperatorClick);
        findViewById(R.id.btnSubtract).setOnClickListener(this::onOperatorClick);
        findViewById(R.id.btnMultiply).setOnClickListener(this::onOperatorClick);
        findViewById(R.id.btnDivide).setOnClickListener(this::onOperatorClick);

        // Special buttons
        findViewById(R.id.btnEquals).setOnClickListener(this::onEqualsClick);
        findViewById(R.id.btnClear).setOnClickListener(this::onClearClick);
        findViewById(R.id.btnDecimal).setOnClickListener(this::onDecimalClick);
        findViewById(R.id.btnDelete).setOnClickListener(this::onDeleteClick);
    }

    private void onNumberClick(View view) {
        Button button = (Button) view;
        String number = button.getText().toString();
        
        if (operatorPressed) {
            currentNumber = "";
            operatorPressed = false;
        }
        
        currentNumber += number;
        updateDisplay(currentNumber);
    }

    private void onOperatorClick(View view) {
        Button button = (Button) view;
        String newOperator = button.getText().toString();
        
        if (!currentNumber.isEmpty()) {
            if (!operator.isEmpty() && !operatorPressed) {
                calculate();
            } else {
                previousNumber = currentNumber;
            }
            
            operator = newOperator;
            operatorPressed = true;
        }
    }

    private void onEqualsClick(View view) {
        if (!operator.isEmpty() && !currentNumber.isEmpty() && !previousNumber.isEmpty()) {
            calculate();
            operator = "";
            previousNumber = "";
        }
    }

    private void onClearClick(View view) {
        currentNumber = "";
        operator = "";
        previousNumber = "";
        operatorPressed = false;
        updateDisplay("0");
    }

    private void onDecimalClick(View view) {
        if (operatorPressed) {
            currentNumber = "";
            operatorPressed = false;
        }
        
        if (!currentNumber.contains(".")) {
            if (currentNumber.isEmpty()) {
                currentNumber = "0.";
            } else {
                currentNumber += ".";
            }
            updateDisplay(currentNumber);
        }
    }

    private void onDeleteClick(View view) {
        if (!currentNumber.isEmpty()) {
            currentNumber = currentNumber.substring(0, currentNumber.length() - 1);
            if (currentNumber.isEmpty()) {
                updateDisplay("0");
            } else {
                updateDisplay(currentNumber);
            }
        }
    }

    private void calculate() {
        double result = 0;
        double prev = Double.parseDouble(previousNumber);
        double current = Double.parseDouble(currentNumber);

        switch (operator) {
            case "+":
                result = prev + current;
                break;
            case "-":
                result = prev - current;
                break;
            case "×":
                result = prev * current;
                break;
            case "÷":
                if (current != 0) {
                    result = prev / current;
                } else {
                    updateDisplay("Error");
                    return;
                }
                break;
        }

        // Format result to remove unnecessary decimal places
        if (result == (long) result) {
            currentNumber = String.valueOf((long) result);
        } else {
            currentNumber = String.valueOf(result);
        }
        
        updateDisplay(currentNumber);
        previousNumber = currentNumber;
        operatorPressed = true;
    }

    private void updateDisplay(String text) {
        if (text.isEmpty()) {
            display.setText("0");
        } else {
            display.setText(text);
        }
    }
}