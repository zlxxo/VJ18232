package ba.unsa.etf.rma.VJ_18232;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MuzicarAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<Muzicar> data=null;
    private static LayoutInflater inflater=null;
    private Resources res;

    public MuzicarAdapter(Activity activity, ArrayList<Muzicar> data,Resources resLocal){
        this.activity = activity;
        this.data = data;
        this.res = resLocal;
        inflater = ( LayoutInflater )activity.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder {
        public TextView ime;
        public TextView zanr;
        public ImageView slika;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        ViewHolder holder;

        if(convertView==null){

            vi = inflater.inflate(R.layout.element_liste, null);


            holder = new ViewHolder();
            holder.ime = (TextView) vi.findViewById(R.id.ime);
            holder.zanr=(TextView)vi.findViewById(R.id.zanr);
            holder.slika=(ImageView)vi.findViewById(R.id.slika);

            vi.setTag( holder );
        }
        else
            holder=(ViewHolder)vi.getTag();

        if(data.size()<=0)
        {
            holder.ime.setText(" ");

        }
        else
        {
            Muzicar tempValues=null;
            tempValues = ( Muzicar ) data.get( position );


            holder.ime.setText( tempValues.getIme() );
            holder.zanr.setText( tempValues.getZanr() );
            holder.slika.setImageResource(
                    res.getIdentifier(
                            "ba.unsa.etf.rma.VJ_18194:drawable/"+tempValues.getSlika()
                            ,null,null));


        }
        return vi;
    }
}
