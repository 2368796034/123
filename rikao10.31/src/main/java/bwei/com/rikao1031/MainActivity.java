package bwei.com.rikao1031;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button login;
    EditText username;
    EditText password;
    private Button zuce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button)findViewById(R.id.login);
        username=(EditText)super.findViewById(R.id.username);//获取用户输入的用户名
        password=(EditText)super.findViewById(R.id.password);//获取用户密码
        zuce =(Button)super.findViewById(R.id.zuce);//获取注册
        login.setOnClickListener(new View.OnClickListener()//侦听登录点击事件
                                 {
                                     public void onClick(View v)
                                     {//验证用户名密码是否符合要求
                                         if(username.getText().toString().equals("admin")&&password.getText().toString().equals("888888"))
                                         {
                                             Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();//提示用户登陆成功
                                             Intent t=new Intent(MainActivity.this,Main2Activity.class);//从login页面跳转到index界面
                                             startActivity(t);
                                         }
                                         if(!username.getText().toString().equals("admin")||!password.getText().toString().equals("888888"))
                                         {
                                             Toast.makeText(getApplicationContext(), "用户名或密码错误", Toast.LENGTH_SHORT).show();//提示用户用户名或密码错误
                                         }
                                     }
                                 }
        );

        zuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new  Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
            }
        });

    }
}
