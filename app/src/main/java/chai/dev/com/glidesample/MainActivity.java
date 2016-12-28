package chai.dev.com.glidesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class MainActivity extends AppCompatActivity {

    private static final String NORMAL_IMAGE_URL = "http://www.w3schools.com/css/img_fjords.jpg";
    private static final String GIF_IMAGE_URL = "https://media.giphy.com/media/MGdfeiKtEiEPS/giphy.gif";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showNormalImage();
        showGifImage();
    }

    private void showGifImage() {
        ImageView imageViewGif = (ImageView) findViewById(R.id.imageview_gif);

        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(imageViewGif);
        Glide.with(this).load(GIF_IMAGE_URL).into(imageViewTarget);
    }

    private void showNormalImage() {
        ImageView imageViewNormal = (ImageView) findViewById(R.id.imageview_normal);
        Glide.with(this).load(NORMAL_IMAGE_URL).into(imageViewNormal);
    }
}
