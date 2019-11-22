package org.ranapat.simpledependencyinjecting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        ((TextView) findViewById(R.id.message1)).setText(viewModel.getMessage1());
        ((TextView) findViewById(R.id.message2)).setText(viewModel.getMessage2());
    }
}
