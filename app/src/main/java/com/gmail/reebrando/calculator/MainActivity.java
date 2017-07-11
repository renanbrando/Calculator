package com.gmail.reebrando.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.gmail.reebrando.calculator.Util.Calculator;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.etDisplay) EditText etDisplay;
    private String operationFlag = "";
    private boolean operationSet = false;
    private Calculator calc = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        etDisplay.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                etDisplay.setText("");
                return true;
            }
        });
    }

    @OnClick({R.id.btnOne, R.id.btnTwo, R.id.btnThree, R.id.btnFour,
              R.id.btnFive, R.id.btnSix, R.id.btnSeven, R.id.btnEight,
              R.id.btnNine, R.id.btnZero, R.id.btnPlus, R.id.btnMinus,
              R.id.btnTimes, R.id.btnDivided, R.id.btnDot, R.id.btnEquals})
    public void handleClick(Button button){
        switch (button.getId()){
            case R.id.btnOne:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnTwo:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnThree:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnFour:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnFive:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnSix:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnSeven:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnEight:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnNine:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnZero:
                etDisplay.append(button.getText().toString());
                break;
            case R.id.btnDot:
                etDisplay.setText(addDot(etDisplay.getText().toString()));
                break;
            case R.id.btnPlus:
                // plus action
                if (!operationSet){
                    calc.setNumOne(Double.parseDouble(etDisplay.getText().toString()));
                    operationSet = true;
                    operationFlag = button.getText().toString();
                    etDisplay.setText("");
                }
                break;
            case R.id.btnMinus:
                // minus action
                if (!operationSet){
                    calc.setNumOne(Double.parseDouble(etDisplay.getText().toString()));
                    operationSet = true;
                    operationFlag = button.getText().toString();
                    etDisplay.setText("");
                }
                break;
            case R.id.btnDivided:
                // divide action
                if (!operationSet){
                    calc.setNumOne(Double.parseDouble(etDisplay.getText().toString()));
                    operationSet = true;
                    operationFlag = button.getText().toString();
                    etDisplay.setText("");
                }
                break;
            case R.id.btnTimes:
                // times action
                if (!operationSet){
                    calc.setNumOne(Double.parseDouble(etDisplay.getText().toString()));
                    operationSet = true;
                    operationFlag = button.getText().toString();
                    etDisplay.setText("");
                }
                break;
            case R.id.btnEquals:
                // equals action
                if (!operationFlag.isEmpty()){
                    calc.setNumTwo(Double.parseDouble(etDisplay.getText().toString()));
                    operationSet = false;
                    etDisplay.setText(String.valueOf(calc.calculate(operationFlag)));
                    operationFlag = "";
                }
                break;
            default:
                //default
                break;
        }
    }

    public String addDot(String numbers){
        if (!numbers.contains(".")){
            numbers = numbers.concat(".");
        }
        return numbers;
    }
}
