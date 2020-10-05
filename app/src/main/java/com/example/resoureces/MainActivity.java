package com.example.resoureces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private CheckBox ch;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text);
        ch=findViewById(R.id.change);
        image=findViewById(R.id.picture);
        String txt=getResources().getString(R.string.Hello);
        int pad=(int)getResources().getDimension(R.dimen.padding);
        image.setPadding(pad,pad,pad,pad);
        int textColor=getResources().getColor(R.color.myText);
        text.setTextColor(textColor);
        text.setText(txt);
        ch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(ch.isChecked()) image.setImageResource(R.drawable.multfilm);
                else image.setImageResource(R.drawable.volk);
            }
        });
    }
}