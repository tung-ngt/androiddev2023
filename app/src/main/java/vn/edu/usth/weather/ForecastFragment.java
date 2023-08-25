package vn.edu.usth.weather;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import vn.edu.usth.weather.databinding.FragmentForecastBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForecastFragment extends Fragment {
    private FragmentForecastBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = FragmentForecastBinding.inflate(getLayoutInflater());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(0x20FF00FF);

        TextView textView = new TextView(getContext());
        textView.setText("Thursday");

        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.cloud);

        linearLayout.addView(textView);
        linearLayout.addView(imageView);


        return linearLayout;
    }
}