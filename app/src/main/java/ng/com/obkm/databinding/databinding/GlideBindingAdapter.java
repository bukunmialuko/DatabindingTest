package ng.com.obkm.databinding.databinding;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import ng.com.obkm.databinding.R;

public class GlideBindingAdapter {

    @BindingAdapter("imageResource")
    public static void setImageResource(ImageView view, int imageUrl){
        Context context = view.getContext();
        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);

        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageUrl)
                .into(view);
    }
    @BindingAdapter("imageResource")
    public static void setImageResource(ImageView view, String imageUrl){
        Context context = view.getContext();
        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);

        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageUrl)
                .into(view);
    }
}
