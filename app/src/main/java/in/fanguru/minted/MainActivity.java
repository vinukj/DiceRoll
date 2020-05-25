package in.fanguru.minted;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton ;
        rollButton = (Button) findViewById(R.id.rollButton);
        final ImageView leftDice = (ImageView) findViewById(R.id.leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.rightDice);
       final int[] diceImage = {
               R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
       };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("minted","button pressed");
                Random generateNumber = new Random();
                int number = generateNumber.nextInt(6);
                Log.d("minted","generated number" +number);
                leftDice.setImageResource(diceImage[number]);
                 number = generateNumber.nextInt(6);
                rightDice.setImageResource(diceImage[number]);

            }
        });
    }
}
