package cn.edu.gdmec.s07131020.ManyActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText myet1,myet2;
    TextView mytv1,mytv2;
    Button mybt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytv1=(EditText) findViewById(R.id.textView1);
        mytv2=(EditText) findViewById(R.id.textView2);
        myet1=(EditText) findViewById(R.id.editText1);
        myet2=(EditText) findViewById(R.id.editText2);
        mybt1=(Button) findViewById(R.id.button1);
        
        mybt1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
		Intent myIt=new Intent(MainActivity.this,SecondActivity.class);
      
        startActivityForResult(myIt,1);

		
			}
        }
        );
        }
        
    


    @Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
	if(requestCode==1){
		if(resultCode==RESULT_OK){
			String msg = data.getExtras().getString("para");
			myet1.setText(msg);
			myet2.setText(msg);
		}
	}
    }




	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
