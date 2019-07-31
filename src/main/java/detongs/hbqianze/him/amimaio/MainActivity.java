package detongs.hbqianze.him.amimaio;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import detongs.hbqianze.him.amimaio.viwe.EpetTypeSwitchView;

public class MainActivity extends AppCompatActivity {

    private EpetTypeSwitchView mEpetTypeSwitchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mEpetTypeSwitchView=new EpetTypeSwitchView(this);

    }

    private void initView() {
        mEpetTypeSwitchView = (EpetTypeSwitchView) findViewById(R.id.epetTypeSwitchView);
    }
}
