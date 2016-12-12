package rtc.patcharee.unchittha.crosswordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HowToActivity extends AppCompatActivity {

    //Explicit
    private TextView textView;
    private ImageView imageView;
    private static final String howtoSTRING = "เมื่อเข้าสู้หน้าเกม จะโชว์ช่องสี่เหลี่ยมมา มีทั้งแนวตั้งและแนวนอน เมื่อต้องการเล่นเกมให้ผู้เล่นคลิกที่ปุ่ม “คำใบ้” ทางด้านขวามือ เพื่อโชว์ความหมายของคำที่จะนำไปเติมลงในช่องสี่เหลี่ยม ในหน้าคำใบ้ก็จะมีความหมายของแต่ละข้อทั้งแนวตั้งและแนวนอน เมื่อเข้าใจคำใบ้ที่กำหนดให้แล้ว ให้ผู้เล่นคลิกปุ่ม “กลับ”เพื่อกลับไปยังหน้าเกม เมื่อเริ่มเล่นเกม ให้ผู้เล่นคลิกที่ช่องสี่เหลี่ยมตามข้อในแต่ละช่อง เพื่อเติมตัวอักษรภาษาอังกฤษลงไป เมื่อเติมครบทุกข้อในช่องสี่เหลี่ยมแล้ว เกมจะทำการตรวจความถูกต้อง ถึงจะผ่านไปด่านต่อไป" +
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to);

        //Bind Widget
        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView2);

        //Show View
        textView.setText(howtoSTRING);

        //Image Controller
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HowToActivity.this, PlayActivity.class));
            }
        });

    }   //Main Method

}   // Main Class
