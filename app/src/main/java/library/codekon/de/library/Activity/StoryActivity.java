package library.codekon.de.library.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;

import library.codekon.de.library.R;

public class StoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        ImageView imageView_1 = (ImageView)findViewById(R.id.imageview_1);
        imageView_1.setImageResource(R.drawable.kasagi);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
        }
        return true;
    }
}