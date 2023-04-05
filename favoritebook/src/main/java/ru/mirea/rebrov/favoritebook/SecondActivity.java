package ru.mirea.rebrov.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView ageView = findViewById(R.id.textView2);
            String university = extras.getString(MainActivity.KEY);
            ageView.setText(String.format("%s", university));
        }
    }
    public void onClick(View view)
    {
        EditText text = (EditText) findViewById(R.id.editTextTextPersonName);
        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, text.getText().toString());
        setResult(Activity.RESULT_OK, data);
        finish();
    }

}