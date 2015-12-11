package com.example.tewodros_2.lesson11;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyFragment2 extends Fragment {

    View myFragmentView;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myFragmentView = inflater.inflate(R.layout.fragementlayout2, container, false);
        button = (Button) myFragmentView.findViewById(R.id.my_button);
        button.setOnClickListener(converter);
        return myFragmentView;
    }

    private View.OnClickListener converter = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText number1 = (EditText) myFragmentView.findViewById(R.id.number);
            TextView tablespoons = (TextView) myFragmentView.findViewById(R.id.tablespoon);
            TextView teaspoons =(TextView) myFragmentView.findViewById(R.id.teaspoon);

            String cup = number1.getText().toString();
            double cupValue = Double.parseDouble(cup);
            double tablespoon = cupValue*16;
            double teaspoon = cupValue*48;
            String teaSpoons = String.valueOf(teaspoon)+" teaspoon";
            String tableSpoons = String.valueOf(tablespoon)+ " tablespoon";
            tablespoons.setText(tableSpoons);
            teaspoons.setText(teaSpoons);

        }
    };
}
