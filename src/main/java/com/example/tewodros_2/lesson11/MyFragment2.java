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
        button.setOnClickListener(myListener);
        return myFragmentView;
    }

    private View.OnClickListener myListener = new View.OnClickListener() {
        public void onClick(View v) {

            EditText myText = (EditText) findViewById(R.id.edit_message);
            TextView myView = (TextView) findViewById(R.id.edit_message1);

            String firstString = myText.getText().toString();
            double firstNumber = Double.parseDouble(firstString);

            double result = firstNumber * 1.06;
            String resultString = String.valueOf(result);
            myView.setText(resultString);
        }
    };;
}
