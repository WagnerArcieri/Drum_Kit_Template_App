package br.com.wagnerarcieri.drumkit;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    private static final String TAG = "Drum_Kit_App";


    private SoundPool sp;
    private int soundOne;
    private int soundTwo;
    private int soundThree;
    private int soundFour;
    private int soundFive;
    private int soundSix;
    private int soundSeven;
    private int soundEight;
    private int soundNine;
    private int soundTen;
    private int soundEleven;
    private int soundTwelve;
    private int soundThirteen;
    private int soundFourteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        soundOne = sp.load(getApplicationContext(), R.raw.sound01_hat01, 1);
        soundTwo = sp.load(getApplicationContext(), R.raw.sound02_ophat02, 1);
        soundThree = sp.load(getApplicationContext(), R.raw.sound03_trash02, 1);
        soundFour = sp.load(getApplicationContext(), R.raw.sound04_hat02, 1);
        soundFive = sp.load(getApplicationContext(), R.raw.sound05_ophat01, 1);
        soundSix = sp.load(getApplicationContext(), R.raw.sound06_trash01, 1);
        soundSeven = sp.load(getApplicationContext(), R.raw.sound07_tom01, 1);
        soundEight = sp.load(getApplicationContext(), R.raw.sound08_tom02, 1);
        soundNine = sp.load(getApplicationContext(), R.raw.sound09_tom03, 1);
        soundTen = sp.load(getApplicationContext(), R.raw.sound10_tom04, 1);
        soundEleven = sp.load(getApplicationContext(), R.raw.sound11_snare, 1);
        soundTwelve = sp.load(getApplicationContext(), R.raw.sound12_floor, 1);
        soundThirteen = sp.load(getApplicationContext(), R.raw.sound13_kick01, 1);
        soundFourteen = sp.load(getApplicationContext(), R.raw.sound14_kick02, 1);
    }

    public void playSoundOne(View view) {
        sp.play(soundOne, 1.0f, 1.0f, 0,0,1f);
    }

    public void playSoundTwo(View view) {
        sp.play(soundTwo, 1.0f, 1.0f, 0,0,1f);
    }

    public void playSoundThree(View view) {
        sp.play(soundThree, 1.0f, 1.0f, 0,0,1f);
    }

    public void playSoundFour(View view) {
        sp.play(soundFour, 1.0f, 1.0f, 0,0,1f);
    }

    public void playSoundFive(View view) {
        sp.play(soundFive, 1.0f, 1.0f, 0,0,1f);
    }

    public void playSoundSix(View view) {
        sp.play(soundSix, 1.0f, 1.0f, 0,0,1f);
    }

    public void playSoundSeven(View view) {
        sp.play(soundSeven, 1.0f, 1.0f, 0,0,1f);
    }

    public void playSoundEight(View view) {
        sp.play(soundEight, 1.0f, 1.0f, 0,0,1f);
    }

    public void playSoundNine(View view) {
        sp.play(soundNine, 1.0f, 1.0f, 0,0,1f);
    }

    public void playSoundTen(View view) {
        sp.play(soundTen, 1.0f, 1.0f, 0,0,1f);
    }

    public void playSoundEleven(View view) {
        sp.play(soundEleven, 1.0f, 1.0f, 0,0,1f);
    }

    public void playSoundTwelve(View view) {
        sp.play(soundTwelve, 1.0f, 1.0f, 0,0,1f);
    }

    public void playSoundThirteen(View view) {
        sp.play(soundThirteen, 1.0f, 1.0f, 0,0,1f);
    }

    public void playSoundFourteen(View view) {
        sp.play(soundFourteen, 1.0f, 1.0f, 0,0,1f);
    }

}