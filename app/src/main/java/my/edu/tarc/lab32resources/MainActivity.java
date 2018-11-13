package my.edu.tarc.lab32resources;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMesasge;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewMesasge=findViewById(R.id.textViewMessage);


    }
    public void showMessage(View view)
    {
        textViewMesasge.setText(getString(R.string.greeting));
    }

}
