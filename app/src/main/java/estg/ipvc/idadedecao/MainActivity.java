package estg.ipvc.idadedecao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixatexto;
    private Button botao;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        caixatexto = (EditText) findViewById(R.id.caixatexto);
        botao = (Button) findViewById(R.id.button);
        resultado = (TextView) findViewById(R.id.resultado);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { caixatexto.getText();
            String num = caixatexto.getText().toString();

            if(num.isEmpty()){

            }
            else{

                Integer valordigitado = Integer.parseInt(num);

                resultado.setText("A idade do seu cão em anos humanos é: " + valordigitado * 7 + " anos");
            }

            }
        });



    }
}
