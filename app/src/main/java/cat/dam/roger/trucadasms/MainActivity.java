package cat.dam.roger.trucadasms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView SMS;
    private TextView Telefon, RESPOSTA;
    private Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_SMS, btn_CALL, btn_DEL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declarem el textview i l'autocomplete
        SMS = (AutoCompleteTextView) findViewById(R.id.SMS);
        Telefon = (TextView) findViewById(R.id.Telefon);
        RESPOSTA = (TextView) findViewById(R.id.RESPOSTA);
        //Declarem els votons
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_SMS = (Button) findViewById(R.id.btn_SMS);
        btn_CALL = (Button) findViewById(R.id.btn_CALL);
        btn_DEL = (Button) findViewById(R.id.btn_DEL);


    }

    //Una funcio que afagira el boto clicat al numero de telefon



    public void btn1(View view) {
        Telefon.setText(Telefon.getText() + "1");
    }

    public void btn2(View view) {
        Telefon.setText(Telefon.getText() + "2");
    }

    public void btn3(View view) {
        Telefon.setText(Telefon.getText() + "3");
    }

    public void btn4(View view) {
        Telefon.setText(Telefon.getText() + "4");
    }

    public void btn5(View view) {
        Telefon.setText(Telefon.getText() + "5");
    }

    public void btn6(View view) {
        Telefon.setText(Telefon.getText() + "6");
    }

    public void btn7(View view) {
        Telefon.setText(Telefon.getText() + "7");
    }

    public void btn8(View view) {
        Telefon.setText(Telefon.getText() + "8");
    }
    public void btn9(View view) {
        Telefon.setText(Telefon.getText() + "9");
    }
    public void SMS(View view) {
        if(SMS.getText().length() >= 1){
            RESPOSTA.setText("SMS Correcta");
        }else{
            RESPOSTA.setText("SMS incorrecta posan un altre");
        }

    }
    public void CALL(View view) {
        if(Telefon.getText().length() == 9) {
            RESPOSTA.setText("Telefon correcta TRUCANT");
        }else{
            RESPOSTA.setText("Telefon incorrecta");
        }
    }

    public void DEL(View view) {
        Telefon.setText("");
    }




}

