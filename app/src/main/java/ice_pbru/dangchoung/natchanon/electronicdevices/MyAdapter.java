package ice_pbru.dangchoung.natchanon.electronicdevices;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by PBRU_ICE017 on 21/4/2559.
 */
public class MyAdapter extends BaseAdapter {

    //Explicit
    private Context context;
    private int[] iconInts;
    private String[] titleStrings, detailStrings;
    public MyAdapter(Context context, int[] iconInts, String[] titleStrings, String[] detailStrings){

        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return iconInts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.listview,viewGroup,false);

        //For Icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);

        //For Title
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView3);
        titleTextView.setText(titleStrings[i]);

        //For Detail
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView4);
        detailTextView.setText(detailStrings[i]);

        return view1;

    }
}
