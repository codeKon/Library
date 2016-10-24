package library.codekon.de.library.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import library.codekon.de.library.R;

public class NovelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novel);

        ImageView imageView_1 = (ImageView) findViewById(R.id.imageview_1);
        ImageView imageView_2 = (ImageView) findViewById(R.id.imageview_2);
        ImageView imageView_3 = (ImageView) findViewById(R.id.imageview_3);
        ImageView imageView_4 = (ImageView) findViewById(R.id.imageview_4);

        imageView_1.setImageResource(R.drawable.viva_la_muerte);
        imageView_2.setImageResource(R.drawable.nuke_turkiye);
        imageView_3.setImageResource(R.drawable.valla_kurda);
        imageView_4.setImageResource(R.drawable.ok_musti);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
           finish();

        }
        return true;
    }
}
