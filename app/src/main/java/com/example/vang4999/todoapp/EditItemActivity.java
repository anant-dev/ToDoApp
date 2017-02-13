package com.example.vang4999.todoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    EditText etEditItemText;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        position = getIntent().getIntExtra("position",0);

        etEditItemText = (EditText) findViewById(R.id.etEditItemText);
        etEditItemText.setText(getIntent().getStringExtra("text"));
    }

    public void onSaveItem(View view) {
        Intent resultData = new Intent();

        resultData.putExtra("position", position);
        resultData.putExtra("text", etEditItemText.getText().toString());

        setResult(RESULT_OK,resultData);
        finish();
    }
}
