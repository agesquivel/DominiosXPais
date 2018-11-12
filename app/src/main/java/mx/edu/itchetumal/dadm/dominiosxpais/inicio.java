package mx.edu.itchetumal.dadm.dominiosxpais;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ArrayAdapter<CharSequence> adaptadorPaises = ArrayAdapter.createFromResource(this,
                R.array.array_paises,
                android.R.layout.simple_spinner_item);

        Spinner spPaises = (Spinner) findViewById(R.id.cmbPaises);

        adaptadorPaises.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        spPaises.setAdapter(adaptadorPaises);

        ArrayAdapter<CharSequence> adaptadorListaPaises =
                ArrayAdapter.createFromResource(this,
                R.array.array_dominiosPaises,
                android.R.layout.simple_list_item_1);

        ListView lstNombresPaises = (ListView) findViewById(R.id.lstPaises);

        lstNombresPaises.setAdapter(adaptadorListaPaises);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inicio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
