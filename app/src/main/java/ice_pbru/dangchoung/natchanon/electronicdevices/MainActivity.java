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
        final int[] intIcon = {R.drawable.r01, R.drawable.c02, R.drawable.diode01};


        final String[] titleString = new String[20];
        titleString[0] = "Resistor";
        titleString[1] = "Capacitor";
        titleString[2] = "Diode";
        titleString[3] = "";
        titleString[4] = "";
        titleString[5] = "";
        titleString[6] = "";
        titleString[7] = "";
        titleString[8] = "";
        titleString[9] = "";
        titleString[10] = "";
        titleString[11] = "";
        titleString[12] = "";
        titleString[13] = "";
        titleString[14] = "";
        titleString[15] = "";
        titleString[16] = "";
        titleString[17] = "";
        titleString[18] = "";
        titleString[19] = "";


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
