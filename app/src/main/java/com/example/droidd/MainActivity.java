package com.example.droidd;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    final String FILE_NAME = "content1.txt";
    public ArrayList<String> myData = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ball currentBall = new Ball("TempBall");
//
// //       SeekBar seekBar1 = findViewById(R.id.seekBar1);
//        TextView textView1 = findViewById(R.id.seekBarValue1);

//        SeekBar seekBar2 = findViewById(R.id.seekBar2);
//        TextView textView2 = findViewById(R.id.seekBarValue2);
//
//        SeekBar seekBar3 = findViewById(R.id.seekBar3);
//        TextView textView3 = findViewById(R.id.seekBarValue3);
//
//        SeekBar seekBar4 = findViewById(R.id.seekBar4);
//        TextView textView4 = findViewById(R.id.seekBarValue4);
//
//        SeekBar seekBar5 = findViewById(R.id.seekBar5);
//        TextView textView5 = findViewById(R.id.seekBarValue5);
//
//        EditText configName = findViewById(R.id.editText);
//
//
        Button saveButton = findViewById(R.id.button);
        Button openButton = findViewById(R.id.button2);

        Button shootButton = findViewById(R.id.button3);
        
//
//        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//
//                currentBall.setVerticalAngel(progress);
//                textView1.setText(String.valueOf(progress));
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
//
//        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//
//                currentBall.setHorizontalAngel(progress);
//                textView2.setText(String.valueOf(progress));
//
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
//
//        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                Integer currentValue = currentBall.getDefaultSpeedMotor1Min() + (currentBall.getDefaultSpeedMotor1Max() - currentBall.getDefaultSpeedMotor1Min()) * progress / 100;
//                currentBall.setSpeedMotor1(currentValue);
//                textView3.setText(String.valueOf(currentValue));
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
//
//        seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                Integer currentValue = currentBall.getDefaultSpeedMotor2Min() + (currentBall.getDefaultSpeedMotor2Max() - currentBall.getDefaultSpeedMotor2Min()) * progress / 100;
//                currentBall.setSpeedMotor2(currentValue);
//                textView4.setText(String.valueOf(currentValue));
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
//
//        seekBar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                Integer currentValue = currentBall.getDefaultSpeedMotor3Min() + (currentBall.getDefaultSpeedMotor3Max() - currentBall.getDefaultSpeedMotor3Min()) * progress / 100;
//                currentBall.setSpeedMotor3(currentValue);
//                textView5.setText(String.valueOf(currentValue));
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
//
//        saveButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FileOutputStream fos = null;
//
//                currentBall.setName(configName.getText().toString());
//
//                try {
//                    String text = currentBall.getName() + "," + currentBall.getVerticalAngel().toString() + "," + currentBall.getHorizontalAngel().toString() + "," + currentBall.getSpeedMotor1().toString() + "," + currentBall.getSpeedMotor2().toString() + "," + currentBall.getSpeedMotor3().toString() + '\n';
//                    fos = openFileOutput(FILE_NAME, MODE_APPEND);
//                    fos.write(text.getBytes());
//                    Toast.makeText(getApplicationContext(), "Файл сохранен", Toast.LENGTH_SHORT).show();
//                    Toast.makeText(getApplicationContext(), getApplicationInfo().dataDir, Toast.LENGTH_LONG).show();
//                    //  Toast.makeText(getApplicationContext(), getApplicationInfo().dataDir, Toast.LENGTH_LONG).show();
//                } catch (IOException ex) {
//                    Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_SHORT).show();
//                } finally {
//                    try {
//                        if (fos != null)
//                            fos.close();
//                    } catch (IOException ex) {
//                        Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_SHORT).show();
//                    }
//                }
//            }
//        });
//
        openButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Открываю", Toast.LENGTH_SHORT).show();
                myData = ReadDataFromFile();

                Intent intent = new Intent(MainActivity.this, BallsListActivity.class);
                intent.putExtra("base", myData);
                startActivity(intent);
            }
        });


    }

    ArrayList<String> ReadDataFromFile() {
        ArrayList<String> BallsBase = new ArrayList<>();

        //Toast.makeText(getApplicationContext(), fileName, Toast.LENGTH_LONG).show();
        String text = "";

        FileInputStream fin = null;
        try {
            fin = openFileInput(FILE_NAME);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            text = new String(bytes);
            //textView.setText(text);
        } catch (IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally {

            try {
                if (fin != null)
                    fin.close();
            } catch (IOException ex) {

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        List<String> list= Arrays.asList(text.split("\n"));

        for (int i = 0; i < list.size(); i++) {
            BallsBase.add(list.get(i));
        }


        //BallsBase.add(text);

        //BallsBase = (ArrayList<String>) Arrays.asList(text.split("\n"));



/*
       try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line = reader.readLine();

            while (line != null) {
                // read next line
                line = reader.readLine();
                BallsBase.add(line);
            }
            reader.close();
            Toast.makeText(getApplicationContext(),"файл прочитан",Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            //e.printStackTrace();
         //   Toast.makeText(getApplicationContext(), getApplicationInfo().dataDir, Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();

        }
*/
        return BallsBase;
    }
}
