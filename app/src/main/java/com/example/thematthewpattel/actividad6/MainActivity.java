package com.example.thematthewpattel.actividad6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.*;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    Scene mScene1, mScene2;
    Transition transitions;
    ViewGroup sceneroot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sceneroot = (ViewGroup) findViewById(R.id.isroot);

        mScene1 = Scene.getSceneForLayout(sceneroot, R.layout.scene1layout, this);
        mScene2 = Scene.getSceneForLayout(sceneroot, R.layout.scene2layout, this);
        transitions = TransitionInflater.from(this).inflateTransition(R.transition.fadetransition);

    }

    public void goToSc1(View view) {
        TransitionManager.go(mScene1, transitions);
    }

    public void goToSc2(View view) {
        TransitionManager.go(mScene2, transitions);
    }
}
