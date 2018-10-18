package jakeolantern.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMsg;
    private CharSequence originalMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Main Function here :D
        super.onCreate(savedInstanceState);

        //To display the UI fucntion
        //R -> special shortform referring to "Resources - res folder"
        setContentView(R.layout.activity_main);

        //Link UI to program
        textViewMsg = findViewById(R.id.textView);
        originalMessage = textViewMsg.getText();
    }

    public void displayMessage(View view){
        textViewMsg.setText("Hello, I am your Galaxy s9!");

    }

    public void resetMessage(View view){
        textViewMsg.setText(originalMessage);
    }
}
