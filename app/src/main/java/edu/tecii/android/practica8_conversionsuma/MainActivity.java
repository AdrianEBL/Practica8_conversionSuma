package edu.tecii.android.practica8_conversionsuma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.inputp)
    EditText inputp;
    @Bind(R.id.inputm)
    EditText inputm;
    @Bind(R.id.btnc)
    Button btnc;
    @Bind(R.id.inputpul)
    TextView inputpul;
    @Bind(R.id.inputyar)
    TextView inputyar;
    @Bind(R.id.inputmet)
    TextView inputmet;
    @Bind(R.id.inputmill)
    TextView inputmill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnc)
    public void sumaconversion(){
        String pies = inputp.getText().toString();
        String metros = inputm.getText().toString();

        if(!pies.isEmpty() && !metros.isEmpty()){
            Double pie = Double.parseDouble(pies);
            Double metro = Double.parseDouble(metros);

            Double suma = pie + (metro*3.2808);

            Double pul = suma*12;
            Double yar = suma*0.3333;
            Double met = suma*0.3048;
            Double mill = suma*0.0002;

            String p = "";
            String y = "";
            String m = "";
            String ml = "";
            String fp = String.format("%2.2f",pul);
            String fy = String.format("%2.2f",yar);
            String fm = String.format("%2.2f",met);
            String fml = String.format("%2.2f",mill);
            p = "El resultado de la suma en pulgadas es: " + fp + "";
            y = "El resultado de la suma en yardas es: " + fy + "";
            m = "El resultado de la suma en metros es: " + fm + "";
            ml = "El resultado de la suma en millas es: " + fml + "";

            inputpul.setText(p);
            inputyar.setText(y);
            inputmet.setText(m);
            inputmill.setText(ml);
        }
    }
}
