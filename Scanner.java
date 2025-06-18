package com.shadowprotect;

import android.os.AsyncTask;
import android.widget.TextView;

public class Scanner extends AsyncTask<Void, Void, String> {
    TextView textView;
    public Scanner(TextView textView) {
        this.textView = textView;
    }
    @Override
    protected String doInBackground(Void... voids) {
        try { Thread.sleep(3000); } catch (InterruptedException e) {}
        return "No threats found!";
    }
    @Override
    protected void onPostExecute(String result) {
        textView.setText(result);
    }
}