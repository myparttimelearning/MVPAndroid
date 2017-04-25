package com.tapdevs.mvpandroid.utils;

import android.app.Activity;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;

import com.tapdevs.mvpandroid.R;


/**
 * Created by  Jan Shair on 16/02/2017.
 */

public class SnackBarUtils {

    public static void showSnackBarOnNoInternet(Activity context){
        Snackbar snackbar = Snackbar
                .make(context.findViewById(android.R.id.content), context.getString(R.string.noInternet), Snackbar.LENGTH_LONG)
                .setAction("Connect", v -> IntentUtils.connectToWifi(context));

        // Changing message text color
        snackbar.setActionTextColor(Color.RED);

        // Changing action button text color
        View sbView = snackbar.getView();
        TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_signal_wifi_off, 0, 0, 0);
        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelOffset(R.dimen.snackbar_icon_padding));

        textView.setTextColor(Color.WHITE);

        snackbar.show();
    }
}
