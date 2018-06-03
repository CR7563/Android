package com.example.zhihao.ui;

        import android.graphics.Color;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.telephony.SmsMessage;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.SubMenu;
        import android.widget.EditText;
        import android.widget.Toast;

public class XMLmenu extends AppCompatActivity {
    //textFont
    final int font_small=0x111;
    final int font_mid=0x112;
    final int font_big=0x113;

    //plain-menu
    final int plain_item=0x11b;

    //color
    final int font_red=0x114;
    final int font_black=0x115;
    private EditText edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definemenu);
        edit=(EditText) findViewById(R.id.edit1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        SubMenu fontMenu=menu.addSubMenu("字体大小");
        fontMenu.setHeaderTitle("选择字体大小");
        fontMenu.add(0,font_small,0,"10号字体");
        fontMenu.add(0,font_mid,0,"16号字体");
        fontMenu.add(0,font_big,0,"20号字体");

        menu.add(0,plain_item,0,"普通菜单选项");

        SubMenu colornenu=menu.addSubMenu("字体颜色");
        colornenu.add(0,font_red,0,"红色");
        colornenu.add(0,font_black,0,"黑色");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case font_small:
                edit.setTextSize(10*2);
                break;
            case font_mid:
                edit.setTextSize(16*2);
                break;
            case font_big:
                edit.setTextSize(20*2);
                break;
            case font_red:
                edit.setTextColor(getResources().getColor(R.color.red));
                break;
            case font_black:
                edit.setTextColor(getResources().getColor(R.color.black));
                break;
            case plain_item:
                Toast.makeText(this,"你单击了普通菜单选项",Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }
}
