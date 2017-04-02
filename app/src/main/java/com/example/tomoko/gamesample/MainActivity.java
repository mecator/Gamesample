package com.example.tomoko.gamesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    Button button, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    int count = 1;
    SoundPool soundPool;
    int mp3;
    private AudioAttributes audioAttributes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        audioAttributes = new AudioAttributes.Builder()
                // USAGE_MEDIA
                // USAGE_GAME
                .setUsage(AudioAttributes.USAGE_GAME)
                // CONTENT_TYPE_MUSIC
                // CONTENT_TYPE_SPEECH, etc.
                .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                .build();

        setContentView(R.layout.activity_main);
        textView1 = (TextView) findViewById(R.id.text1);
        textView2 = (TextView) findViewById(R.id.text2);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(buttonListener);
        button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(buttonNumberListener);
        button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(buttonNumberListener);
        button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(buttonNumberListener);
        button4 = (Button) findViewById(R.id.button_4);
        button4.setOnClickListener(buttonNumberListener);
        button5 = (Button) findViewById(R.id.button_5);
        button5.setOnClickListener(buttonNumberListener);
        button6 = (Button) findViewById(R.id.button_6);
        button6.setOnClickListener(buttonNumberListener);
        button7 = (Button) findViewById(R.id.button_7);
        button7.setOnClickListener(buttonNumberListener);
        button8 = (Button) findViewById(R.id.button_8);
        button8.setOnClickListener(buttonNumberListener);
        button9 = (Button) findViewById(R.id.button_9);
        button9.setOnClickListener(buttonNumberListener);
        soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        mp3 = soundPool.load(this, R.raw.decision4, 1);
    }

    View.OnClickListener buttonNumberListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button button = (Button) v;
            if (count % 2 == 1) {
                textView2.setText("player2の番です");
                if (button.getText().equals("-")) {
                    button.setText("〇");
                    result();
                    count++;
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "既に入力されています", Toast.LENGTH_LONG);
                    toast.show();
                }
            } else {
                textView2.setText("player1の番です");
                if (button.getText().equals("-")) {
                    button.setText("×");
                    result();
                    count++;
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "既に入力されています", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        }
    };
    View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            count = 1;
            textView2.setText("player１の番です");
            button1.setText("-");
            button2.setText("-");
            button3.setText("-");
            button4.setText("-");
            button5.setText("-");
            button6.setText("-");
            button7.setText("-");
            button8.setText("-");
            button9.setText("-");
        }
    };

    public void result() {
        if (button1.getText().equals("〇") && button2.getText().equals("〇") && button3.getText().equals("〇")) {
            textView2.setText("player1  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        } else if (button4.getText().equals("〇") && button5.getText().equals("〇") && button6.getText().equals("〇")) {
            textView2.setText("player1  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        } else if (button7.getText().equals("〇") && button8.getText().equals("〇") && button9.getText().equals("〇")) {
            textView2.setText("player1  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        } else if (button1.getText().equals("〇") && button4.getText().equals("〇") && button7.getText().equals("〇")) {
            textView2.setText("player1  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        } else if (button2.getText().equals("〇") && button5.getText().equals("〇") && button6.getText().equals("〇")) {
            textView2.setText("player1  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        } else if (button3.getText().equals("〇") && button6.getText().equals("〇") && button9.getText().equals("〇")) {
            textView2.setText("player1  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        } else if (button1.getText().equals("〇") && button5.getText().equals("〇") && button9.getText().equals("〇")) {
            textView2.setText("player1  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        } else if (button7.getText().equals("〇") && button5.getText().equals("〇") && button3.getText().equals("〇")) {
            textView2.setText("player1  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        }
        if (button1.getText().equals("×") && button2.getText().equals("×") && button3.getText().equals("×")) {
            textView2.setText("player2  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        } else if (button4.getText().equals("×") && button5.getText().equals("×") && button6.getText().equals("×")) {
            textView2.setText("player2  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        } else if (button7.getText().equals("×") && button8.getText().equals("×") && button9.getText().equals("×")) {
            textView2.setText("player2  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        } else if (button1.getText().equals("×") && button4.getText().equals("×") && button7.getText().equals("×")) {
            textView2.setText("player2  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        } else if (button2.getText().equals("×") && button5.getText().equals("×") && button6.getText().equals("×")) {
            textView2.setText("player2  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        } else if (button3.getText().equals("×") && button6.getText().equals("×") && button9.getText().equals("×")) {
            textView2.setText("player2  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        } else if (button1.getText().equals("×") && button5.getText().equals("×") && button9.getText().equals("×")) {
            textView2.setText("player2  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        } else if (button7.getText().equals("×") && button5.getText().equals("×") && button3.getText().equals("×")) {
            textView2.setText("player2  WIN!!");
            soundPool.play(mp3, 1.0f, 1.0f, 0, 0, 1);
        }
    }
}


