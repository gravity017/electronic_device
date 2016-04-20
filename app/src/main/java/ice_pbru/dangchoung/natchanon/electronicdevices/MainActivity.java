package ice_pbru.dangchoung.natchanon.electronicdevices;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Expercit
    private Button aboutmeButton;
    private ListView electroniclistview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        buttonController();

        createListView();
    }

    private void createListView() {
    }

    private void buttonController() {
        aboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com"));
                startActivity(intent);
            }
        });

    }

    private void bindWidget() {
        aboutmeButton = (Button) findViewById(R.id.button);
        electroniclistview = (ListView) findViewById(R.id.listView);

    }//Bind Widget
}//Main Class
