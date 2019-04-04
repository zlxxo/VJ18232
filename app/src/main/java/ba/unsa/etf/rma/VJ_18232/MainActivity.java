package ba.unsa.etf.rma.VJ_18232;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button dugme;
    private ListView lista;
    private EditText tekst;
    private ArrayList<Muzicar> unosi = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dugme = (Button)findViewById(R.id.button);
        lista = (ListView)findViewById(R.id.listView);
        tekst = (EditText)findViewById(R.id.editText);
        unosi = new ArrayList<Muzicar>();



        ArrayList<String> listaPjesama=new ArrayList<>();

        Muzicar bigbang = new Muzicar("BIGBANG", "KPop", "https://ygex.jp/bigbang/",
                "Big Bang (stylized as BIGBANG) is a South Korean boy band formed by YG Entertainment." +
                "The group consists of 4 members: G-Dragon, T.O.P, Taeyang, and Daesung. Member Seungri retired from the industry"+
                "on March 11, 2019. They are often cited as one of the most influential acts to shape the K-pop industry by helping"+ "" +
                "spread the Korean Wave internationally and dubbed as the \"Kings of K-pop\" by the media."+"" +
                " Their experimental and diverse use of music genres, personal involvement in producing their own"+ "" +
                "records, and stage performances have been admired by music critics and served as influence to numerous K-pop and"+ "" +
                "international artists.", "bb");

        listaPjesama.add("Haru Haru");
        listaPjesama.add("Bang Bang Bang");
        listaPjesama.add("Monster");
        listaPjesama.add("Tell Me Goodbye");
        listaPjesama.add("Lies");

        unosi.add(bigbang);

        bigbang.setTopLista(listaPjesama);

        final MuzicarAdapter adapter;
        Resources res = getResources();
        adapter = new MuzicarAdapter(this, unosi, res);
        lista.setAdapter(adapter);

        dugme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.notifyDataSetChanged();
                tekst.setText("");
            }
        });
    }
}
