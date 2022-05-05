package sg.edu.np.mad.madpracc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button follow = findViewById(R.id.FollowBtn);

        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                follow.setText("unfollow");
            }
        });
    }
}