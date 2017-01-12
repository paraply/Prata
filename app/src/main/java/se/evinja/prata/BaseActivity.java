package se.evinja.prata;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created 2017-01-12.
 */
public class BaseActivity extends AppCompatActivity {
    private ProgressDialog mProgressDialog;

    public void showProgressDialog() {
        if (mProgressDialog == null) {
         mProgressDialog = new ProgressDialog(this);
         mProgressDialog.setCancelable(false);
         mProgressDialog.setMessage("Laddar...");
        }
        mProgressDialog.show();
    }

    public void hideProgressDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }

    public String getUID() {
        return FirebaseAuth.getInstance().getCurrentUser().getUid();
    }

}
