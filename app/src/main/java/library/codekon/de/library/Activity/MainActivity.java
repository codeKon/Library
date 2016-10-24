package library.codekon.de.library.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import library.codekon.de.library.Controller.CustomRecyclerAdapter;
import library.codekon.de.library.R;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] titles = {getResources().getString(R.string.literature_1), getResources().getString(R.string.literature_2),
                getResources().getString(R.string.literature_3), getResources().getString(R.string.literature_4)};


        mRecyclerView =
                (RecyclerView) findViewById(R.id.recycler_view);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new CustomRecyclerAdapter(this, titles);
        mRecyclerView.setAdapter(mAdapter);
    }

}
