package kr.hs.emirim.ganggangi.hellogithub;
// dirkd
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = (Button)findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"콰고가ㅗ가과광",Toast.LENGTH_SHORT).show();
    }
}