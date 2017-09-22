package edu.temple.signupform;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button saveButton = (Button)findViewById(R.id.saveButton);
        final EditText nameField = (EditText)findViewById(R.id.nameField);
        final EditText emailField = (EditText)findViewById(R.id.emailTextField);
        final EditText password = (EditText)findViewById(R.id.passwordField);
        final EditText confirmPassword = (EditText)findViewById(R.id.confirmField);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameField.getText().toString();
                String email = emailField.getText().toString();
                String pw = password.getText().toString();
                String confirmPw = confirmPassword.getText().toString();

                if (name.equals("Name") || name.length() == 0 || email.length() == 0 || pw.length() == 0 || confirmPw.length() == 0) {
                    Toast.makeText(FormActivity.this, "All Fields Must Be Entered", Toast.LENGTH_SHORT).show();
                } else {
                    if (!pw.equals(confirmPw)) {
                        Toast.makeText(FormActivity.this, "Passwords Do Not Match", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(FormActivity.this, "Information Saved", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });
    }
}
