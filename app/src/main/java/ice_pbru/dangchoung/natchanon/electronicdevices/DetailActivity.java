package ice_pbru.dangchoung.natchanon.electronicdevices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detailTextView;
    private ImageView elecImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        //bind Widget

        bindWidget();

        showView();
    }

    private void showView() {

        String strTitle = getIntent().getStringExtra("Title");
        int intIcon = getIntent().getIntExtra("Image", R.drawable.r01);
        int intIndex = getIntent().getIntExtra("Index", 0);

        titleTextView.setText(strTitle);
        elecImageView.setImageResource(intIcon);

        String[] strDetail = getResources().getStringArray(R.array.electronic_detail);
        detailTextView.setText(strDetail[intIndex]);
    }

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.textView);
        detailTextView = (TextView) findViewById(R.id.textView2);
        elecImageView = (ImageView) findViewById(R.id.imageView);
    }
}//Main Class
