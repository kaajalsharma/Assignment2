package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ItemDetail extends AppCompatActivity{
    private TextView nameTextView;
    private TextView costTextView;
    private TextView descTextView;
    private ImageView imageDrawableID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail);

        Intent intent = getIntent();

        // Get the extra identified by "ArticleID" that was put into the intent at the origin.
        int itemID = intent.getIntExtra("ItemID", 0);

        // Now that we were passed the ID of the clicked item, we can get the rest of the data
        // from the "database". Imagine this could be a real SQL database.
        Item item = FakeDatabase.getItemById(itemID);

        nameTextView = findViewById(R.id.detailName);
        costTextView = findViewById(R.id.detailCost);
        descTextView = findViewById(R.id.detailDesc);
        imageDrawableID = findViewById(R.id.detailIcon);

        final int[] count = {0};
        final TextView txtCount =(TextView) findViewById(R.id.txt);
        final Button buttonInc= (Button) findViewById(R.id.button1);
        Button buttonDec= (Button) findViewById(R.id.button2);

        buttonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count[0]++;

                txtCount.setText(String.valueOf(count[0]));




            }
        });

        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count[0]--;
                txtCount.setText(String.valueOf(count[0]));

            }
        });

        // Set the views to show the data of our object
        nameTextView.setText(item.getName());
        costTextView.setText(item.getCost());
        descTextView.setText(item.getDesc());
        imageDrawableID.setImageResource(item.getImageDrawableId());
    }
}
