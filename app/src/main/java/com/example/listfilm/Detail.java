package com.example.listfilm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    private TextView judul, description;
    private ImageView gambar;

    public static final String EXTRA_FILM = "extra_film";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setTitle("Detail Film");

        judul = findViewById(R.id.nama_judul);
        description = findViewById(R.id.description);
        gambar = findViewById(R.id.gambar);

        Film film = getIntent().getParcelableExtra(EXTRA_FILM);

        if (film != null){
            gambar.setImageResource(film.getPhoto());
            gambar.setScaleType(ImageView.ScaleType.CENTER_CROP);
            judul.setText(film.getJudul());
            description.setText(film.getDescription());
        }

    }
}
