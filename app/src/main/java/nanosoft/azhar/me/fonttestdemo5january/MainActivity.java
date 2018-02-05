package nanosoft.azhar.me.fonttestdemo5january;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvText = (TextView)findViewById(R.id.tv_text);
//Add all your custom fonts with proper naming inside the fonts folder. Android supports both .ttf and .otf formats.
        // Create a TypeFace using font from Assets folder
        Typeface mtypeFace = Typeface.createFromAsset(getAssets(),
                "Sail-Regular.otf");
        // set TypeFace to the TextView or Edittext
      //  tvText.setTypeface(mtypeFace);
        Typeface mytTypeface=Typeface.createFromAsset(getAssets(),"Capture_it.ttf");
        tvText.setTypeface(mytTypeface);
    }
}
