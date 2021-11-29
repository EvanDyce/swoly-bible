package com.evan.workoutapp.ui.custom.creation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.evan.workoutapp.R;
import com.evan.workoutapp.data.Exercises;
import com.evan.workoutapp.databinding.ActivityExerciseSelectionBinding;
import com.evan.workoutapp.databinding.ActivityMainBinding;
import com.evan.workoutapp.ui.ExerciseFilteringInterface;
import com.evan.workoutapp.ui.exercises.ExerciseAdapter;

import java.util.ArrayList;

public class ExerciseSelectionActivity extends AppCompatActivity implements ExerciseFilteringInterface {

    private String currentCategoryFilter = "All";

    private ActivityExerciseSelectionBinding binding;
    private final String TAG = "Exercise_Selection";
    private ArrayList<Exercises.Exercise> exerciseArrayList;
    private ExerciseAdapter exerciseAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityExerciseSelectionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}