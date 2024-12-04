package cl.bootcamp.ejercicioindividual11;

import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ConfirmPokemonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_pokemon);

        // Recuperar el nombre del Pokémon seleccionado
        TextView pokemonNameText = findViewById(R.id.pokemon_name_text);
        String pokemonName = getIntent().getStringExtra("pokemon_name");

        // Mostrar el nombre del Pokémon
        if (pokemonName != null) {
            pokemonNameText.setText("Has seleccionado a: " + pokemonName);
        } else {
            pokemonNameText.setText("No se seleccionó ningún Pokémon.");

        }
    }
}