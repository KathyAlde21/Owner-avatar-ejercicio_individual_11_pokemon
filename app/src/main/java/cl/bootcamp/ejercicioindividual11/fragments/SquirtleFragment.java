package cl.bootcamp.ejercicioindividual11.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import cl.bootcamp.ejercicioindividual11.databinding.FragmentSquirtleBinding;

public class SquirtleFragment extends Fragment {

    private FragmentSquirtleBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSquirtleBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}