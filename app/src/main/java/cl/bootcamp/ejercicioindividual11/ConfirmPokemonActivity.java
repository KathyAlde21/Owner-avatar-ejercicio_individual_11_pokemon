package cl.bootcamp.ejercicioindividual11;

import static cl.bootcamp.ejercicioindividual11.R.id.evolution_title;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.graphics.Color;
import android.widget.ImageView;

public class ConfirmPokemonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_pokemon);

        // Recuperar el nombre del Pokemon seleccionado
        TextView pokemonNameText = findViewById(R.id.pokemon_name_text);
        String pokemonName = getIntent().getStringExtra("pokemon_name");

        // Mostrar el nombre del Pokemon
        if (pokemonName != null) {
            pokemonNameText.setText("Has seleccionado a: " + pokemonName);
        } else {
            pokemonNameText.setText("No se seleccionó ningún Pokémon.");
        }

        // Referencias a las vistas
        TextView evolutionTitle = findViewById(R.id.evolution_title);
        ImageView coachImage = findViewById(R.id.coach_image);
        ImageView evolutionImage1 = findViewById(R.id.evolution_image_1);
        ImageView evolutionImage2 = findViewById(R.id.evolution_image_2);
        ImageView evolutionImage3 = findViewById(R.id.evolution_image_3);

//        // Recuperar el nombre del Pokémon desde el Intent
//        String pokemonName = getIntent().getStringExtra("pokemon_name");

        if (pokemonName != null) {
            pokemonNameText.setText(pokemonName);
            evolutionTitle.setText("Evoluciones de " + pokemonName);

            // Configurar las imágenes y colores segun el Pokemon
            switch (pokemonName.toLowerCase()) {
                case "charmander":
                    setImages(evolutionImage1, evolutionImage2, evolutionImage3,
                            R.drawable.charmander_evo1, R.drawable.charmeleon_evo2, R.drawable.charizard_evo3);
                    setBackgroundColor("#FFA500"); // Naranja
                    break;

                case "bulbasaur":
                    setImages(evolutionImage1, evolutionImage2, evolutionImage3,
                            R.drawable.bulbasaur_evo1, R.drawable.ivysaur_evo2, R.drawable.venusaur_evo3);
                    setBackgroundColor("#32CD32"); // Verde
                    break;

                case "squirtle":
                    setImages(evolutionImage1, evolutionImage2, evolutionImage3,
                            R.drawable.squirtle_evo1, R.drawable.wartortle_evo2, R.drawable.blastoise_evo3);
                    setBackgroundColor("#1E90FF"); // Azul
                    break;

                default:
                    pokemonNameText.setText("Pokémon desconocido");
                    evolutionTitle.setText("Evoluciones no disponibles");
                    break;
            }
        }
    }

    // Metodo para configurar las imagenes de evolucion
    private void setImages(ImageView image1, ImageView image2, ImageView image3,
                           int resId1, int resId2, int resId3) {
        image1.setImageResource(resId1);
        image2.setImageResource(resId2);
        image3.setImageResource(resId3);
    }

    // Metodo para configurar el color de fondo de las secciones
    private void setBackgroundColor(String colorHex) {
        // Cambiar el color de fondo de las secciones del entrenador y evoluciones
        findViewById(R.id.coach_image).setBackgroundColor(Color.parseColor(colorHex));
        findViewById(R.id.evolution_image_1).setBackgroundColor(Color.parseColor(colorHex));
        findViewById(R.id.evolution_image_2).setBackgroundColor(Color.parseColor(colorHex));
        findViewById(R.id.evolution_image_3).setBackgroundColor(Color.parseColor(colorHex));
    }
}