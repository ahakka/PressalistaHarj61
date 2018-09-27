package e.hakka.pressalistaharj61;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowPresidentDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_president_details);

        Bundle b = getIntent().getExtras();
        int i = b.getInt(MainActivity.EXTRA, 0);

        ((TextView) findViewById(R.id.textViewName))
                .setText(PresidentitLista.getInstance()
                        .getPresidentti(i).getNimi());
        ((TextView) findViewById(R.id.textViewStart))
                .setText(PresidentitLista.getInstance()
                        .getPresidentti(i).getAlkuVuosi());
        ((TextView) findViewById(R.id.textViewEnd))
                .setText(PresidentitLista.getInstance()
                        .getPresidentti(i).getLoppuVuosi());
        ((TextView) findViewById(R.id.textViewDescription))
                .setText(PresidentitLista.getInstance()
                        .getPresidentti(i).getKuvaus());
    }
}
