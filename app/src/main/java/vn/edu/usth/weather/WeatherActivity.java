package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import vn.edu.usth.weather.databinding.ActivityMainBinding;

public class WeatherActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ForecastFragment forecastFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(binding.frameLayout.getId(), forecastFragment).commit();
        Log.i("lifeCycle", "onCreate called");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("lifeCycle", "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("lifeCycle", "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lifeCycle", "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lifeCycle", "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lifeCycle", "onDestroy called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("lifeCycle", "onRestart called");
    }
}