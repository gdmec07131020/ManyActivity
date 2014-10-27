package cn.edu.gdmec.s07131020.ManyActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {
TextView mytv3,mytv4;
EditText myet3,myet4;
Button mybt2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.second);
		// Intent myintent = getIntent();
		 mytv3=(TextView) findViewById(R.id.textView3);
		 mytv4=(TextView) findViewById(R.id.textView4);
		 myet3=(EditText) findViewById(R.id.editText3);
		 myet4=(EditText) findViewById(R.id.editText4);
		 mybt2=(Button) findViewById(R.id.button2);
		// Bundle mybundle = myintent.getExtras();
		// String msg = mybundle.getString("para1");
		// mytv.setText(msg);
		 mybt2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
			Intent myIt=new Intent();
	        myIt.putExtra("para1", myet3.getText().toString());
	      setResult(RESULT_OK,myIt);
	      finish();
          Uri data=Uri.parse("tel:");   
			Intent result=new Intent(null,data);
			result.putExtra("para", myet4.getText().toString());
			setResult(RESULT_OK,result);
		finish();
				}
	        }
	        );
		 
	}

}
