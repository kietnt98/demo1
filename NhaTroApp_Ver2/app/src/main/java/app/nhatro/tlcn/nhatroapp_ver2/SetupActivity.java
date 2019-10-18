package app.nhatro.tlcn.nhatroapp_ver2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import de.hdodenhof.circleimageview.CircleImageView;

public class SetupActivity extends AppCompatActivity {

    private EditText usernameEdittext, fullnameEdittext, birthdayEdittext;
    private Button SaveButton;
    private CircleImageView profileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        usernameEdittext = (EditText) findViewById(R.id.editText_Setup_Username);
        fullnameEdittext = (EditText) findViewById(R.id.editText_Setup_Fullname);
        birthdayEdittext = (EditText) findViewById(R.id.editText_Setup_Birthday);
        SaveButton = (Button) findViewById(R.id.button_Setup_Save);
        profileImage = (CircleImageView) findViewById(R.id.Setup_img);
    }
}
