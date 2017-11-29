package kmitl.bank58070041.finalproject.lazycafe.controller.activity;


import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Arrays;

import kmitl.bank58070041.finalproject.lazycafe.R;
import kmitl.bank58070041.finalproject.lazycafe.model.User;


public class LoginActivity extends AppCompatActivity {

    private ProgressDialog progressDialog;
    private CallbackManager callbackManager;
    private AccessToken accessToken;
    private LoginButton loginButton;
    private FirebaseAuth.AuthStateListener firebaseAuthListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_login);
        callbackManager = CallbackManager.Factory.create();

        accessToken = AccessToken.getCurrentAccessToken();
        if (accessToken != null){
            connectionWithFacebook();
        }

        loginButton = findViewById(R.id.loginButton);
        loginButton.setReadPermissions(Arrays.asList("email"));

        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                connectionWithFacebook();
            }

            @Override
            public void onCancel() {
                Toast.makeText(getApplicationContext(), "Cancel Login", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(FacebookException error) {
                Toast.makeText(getApplicationContext(), "Error Login", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void connectionWithFacebook() {
        boolean isError = false;

        try {
            Profile profile = Profile.getCurrentProfile();
            User user = User.getUserInstance();
            user.setId(profile.getId());
            user.setUsername(profile.getName());
            user.setUriProfile(profile.getProfilePictureUri(300,300).toString());
            goMainScreen(profile.getName(), profile.getProfilePictureUri(35, 35).toString(), profile.getId());


        } catch (NullPointerException ex) {

            Toast.makeText(LoginActivity.this, "please connect facebook again", Toast.LENGTH_SHORT).show();
            isError = true;
        } catch (Exception ex) {

            Toast.makeText(LoginActivity.this, "please connect facebook again", Toast.LENGTH_SHORT).show();
            isError = true;
        }

        if(isError){
            LoginManager.getInstance().logOut();
            //progress.dismiss();
        }
    }

    private void goMainScreen(String username, String uriProfile, String uploadId) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("username", username);
        intent.putExtra("uriProfile", uriProfile);
        intent.putExtra("uploadId", uploadId);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
    @Override
    protected void onStart() {
        super.onStart();

    }
    @Override
    protected void onStop() {
        super.onStop();

    }

}
