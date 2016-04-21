package ice_pbru.dangchoung.natchanon.electronicdevices;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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
        return 0;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
