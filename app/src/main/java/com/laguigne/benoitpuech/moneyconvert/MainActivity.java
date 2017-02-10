package com.laguigne.benoitpuech.moneyconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static java.lang.Math.floor;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1, spinner2;
    private ArrayAdapter<CharSequence> adapter;
    private EditText number1;
    private TextView monnaie1, monnaie2, number2;
    private Button valide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monnaie1 = (TextView) findViewById(R.id.idMoney1);
        monnaie2 = (TextView) findViewById(R.id.idMoney2);

        spinner1 = (Spinner) findViewById(R.id.id1);
        spinner2 = (Spinner) findViewById(R.id.id2);

        number1 = (EditText) findViewById(R.id.idMontant1);
        number2 = (TextView) findViewById(R.id.idMontant2);

        adapter = ArrayAdapter.createFromResource(this, R.array.money_select, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                if (spinner1.getSelectedItem().toString().equals("dollards")){
                    monnaie1.setText("dollars");
                }
                else if(spinner1.getSelectedItem().toString().equals("euros")){
                    monnaie1.setText("euros");
                }
                else if(spinner1.getSelectedItem().toString().equals("yens")) {
                    monnaie1.setText("yens");
                }
                else if(spinner1.getSelectedItem().toString().equals("yuans")) {
                    monnaie1.setText("yuans");
                }
                else if(spinner1.getSelectedItem().toString().equals("pounds")) {
                    monnaie1.setText("pounds");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spinner2.getSelectedItem().toString().equals("dollards")){
                    monnaie2.setText("dollars");
                }
                else if(spinner2.getSelectedItem().toString().equals("euros")){
                    monnaie2.setText("euros");
                }
                else if(spinner2.getSelectedItem().toString().equals("yens")) {
                    monnaie2.setText("yens");
                }
                else if(spinner2.getSelectedItem().toString().equals("yuans")) {
                    monnaie2.setText("yuans");
                }
                else if(spinner2.getSelectedItem().toString().equals("pounds")) {
                    monnaie2.setText("pounds");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        valide = (Button) findViewById(R.id.idButton);
        valide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double convert = Double.valueOf(number1.getText().toString());

                double dollarsToEuros = floor(convert / 1.33);
                double dollarsToYen = convert * 112.40;
                double dollarsToYuan = convert * 6.88;
                double dollarsToPounds = convert / 1.25;

                double euroToDollars = convert * 0.75;
                double eurosToYens = convert * 120;
                double eurosToYuans = convert * 7.35;
                double eurosToPounds = convert * 0.86;

                double yenToDollars = convert * 0.0089;
                double yenToEuros = convert * 0.0083;
                double yenToYuans = convert * 0.061;
                double yenToPounds = convert * 0.0071;

                double yuansToDollars = convert * 0.15;
                double yuansToEuros = convert * 0.14;
                double yuansToYens = convert * 16.35;
                double yuansToPounds = convert * 0.12;

                double poundsToDollars = convert * 1.25;
                double poundsToEuros = convert * 1.14;
                double poundsToYen = convert * 140.37;
                double poundsToYuan = convert * 8.59;

                if(spinner1.getSelectedItem().toString().equals("dollards") && spinner2.getSelectedItem().toString().equals("euros")){
                    number2.setText(dollarsToEuros + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("dollards") && spinner2.getSelectedItem().toString().equals("yens")){
                    number2.setText(dollarsToYen + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("dollards") && spinner2.getSelectedItem().toString().equals("yuans")){
                    number2.setText(dollarsToYuan + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("dollards") && spinner2.getSelectedItem().toString().equals("pounds")){
                    number2.setText(dollarsToPounds + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("euros") && spinner2.getSelectedItem().toString().equals("dollards")){
                    number2.setText(euroToDollars + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("euros") && spinner2.getSelectedItem().toString().equals("yens")){
                    number2.setText(eurosToYens + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("euros") && spinner2.getSelectedItem().toString().equals("yuans")){
                    number2.setText(eurosToYuans + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("euros") && spinner2.getSelectedItem().toString().equals("pounds")){
                    number2.setText(eurosToPounds + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("yens") && spinner2.getSelectedItem().toString().equals("dollards")){
                    number2.setText(yenToDollars + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("yens") && spinner2.getSelectedItem().toString().equals("euros")){
                    number2.setText(yenToEuros + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("yens") && spinner2.getSelectedItem().toString().equals("yuans")){
                    number2.setText(yenToYuans + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("yens") && spinner2.getSelectedItem().toString().equals("pounds")){
                    number2.setText(yenToPounds + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("yuans") && spinner2.getSelectedItem().toString().equals("dollards")){
                    number2.setText(yuansToDollars + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("yuans") && spinner2.getSelectedItem().toString().equals("euros")){
                    number2.setText(yuansToEuros + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("yuans") && spinner2.getSelectedItem().toString().equals("yens")){
                    number2.setText(yuansToYens + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("yuans") && spinner2.getSelectedItem().toString().equals("pounds")){
                    number2.setText(yuansToPounds + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("pounds") && spinner2.getSelectedItem().toString().equals("dollards")){
                    number2.setText(poundsToDollars + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("pounds") && spinner2.getSelectedItem().toString().equals("euros")){
                    number2.setText(poundsToEuros + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("pounds") && spinner2.getSelectedItem().toString().equals("yens")){
                    number2.setText(poundsToYen + "");
                }

                else if(spinner1.getSelectedItem().toString().equals("pounds") && spinner2.getSelectedItem().toString().equals("yuans")){
                    number2.setText(poundsToYuan + "");
                }
            }
        });
    }
}
