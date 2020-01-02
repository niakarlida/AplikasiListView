package id.ac.poliban.mi.nia.aplikasilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> countries = new ArrayList<>();
    {
        countries.add("Indonesia");
        countries.add("Malaysia");
        countries.add("Singapura");
        countries.add("Italia");
        countries.add("Inggris");
        countries.add("Belanda");
        countries.add("Argentina");
        countries.add("Chile");
        countries.add("Mesir");
        countries.add("Uganda");
        countries.add("Palestine");
        countries.add("India");
        countries.add("India");
        countries.add("Hongkaong");
        countries.add("Taiwan");
        countries.add("Thailand");
        countries.add("Bangladesh");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ubah judul di action bar
        if(getSupportActionBar()!=null)
            setTitle("Aplikasi List Countries");

        //daftarkan view untuk dimanipulasi
        ListView listView = findViewById(R.id.list_view);

        //buat adapter
        ArrayAdapter adapter = new ArrayAdapter(this,
                R.layout.item_rows_negara, R.id.tv_item_negara, countries);

        listView.setAdapter(adapter);


        //event handling (jangan lupa aktifkan java 1.8)
        listView.setOnItemClickListener((parent, view, position, id) ->{
            Toast.makeText(this, "Anda Mengklik " + countries.get(position), Toast.LENGTH_SHORT).show();
        });

    }
}
