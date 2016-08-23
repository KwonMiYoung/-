package com.hyundai.miyoungkwon.videoactivity;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;
import android.widget.Toast;

import org.w3c.dom.Text;



public class VideoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);



        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton4) ;
        button1.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event
                TextView textView4=(TextView)findViewById(R.id.textView4);
                textView4.setText("28");
                Toast.makeText(getApplicationContext(),
                        "좋아요", Toast.LENGTH_SHORT).show();


            }
        }); //좋아요 버튼 눌렀을 떄

        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton5) ;
        button2.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event
                TextView textView5=(TextView)findViewById(R.id.textView5);
                textView5.setText("287");
                Toast.makeText(getApplicationContext(),
                        "싫어요", Toast.LENGTH_SHORT).show();



            }
        }); //싫어요 버튼 눌렀을때


        ImageButton imageButton_up = (ImageButton) findViewById(R.id.imageButton_up) ;
        imageButton_up.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event
                TextView car_id=(TextView)findViewById(R.id.car_id);
                car_id.setText("차량 ID : bb06683534");
                TextView car_pattern=(TextView)findViewById(R.id.car_pattern);
                car_pattern.setText("행동 패턴 : 끼어들기 시도중...");
                TextView textView4=(TextView)findViewById(R.id.textView4);
                textView4.setText("27"); //좋아요 초기값
                TextView textView5=(TextView)findViewById(R.id.textView5);
                textView5.setText("286"); //싫어요 초기값
            }
        }); //위쪽 버튼 눌렀을때

        ImageButton imageButton_left = (ImageButton) findViewById(R.id.imageButton_left) ;
        imageButton_left.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event
                TextView car_id=(TextView)findViewById(R.id.car_id);
                car_id.setText("차량 ID : 0bf1ef1d1e");
                TextView car_pattern=(TextView)findViewById(R.id.car_pattern);
                car_pattern.setText("행동 패턴 : 안전 주행중...");
                TextView textView4=(TextView)findViewById(R.id.textView4);
                textView4.setText("143"); //좋아요 초기값
                TextView textView5=(TextView)findViewById(R.id.textView5);
                textView5.setText("21"); //싫어요 초기값
            }
        }); //왼쪽 버튼 눌렀을때

        ImageButton imageButton_right = (ImageButton) findViewById(R.id.imageButton_right) ;
        imageButton_right.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event
                TextView car_id=(TextView)findViewById(R.id.car_id);
                car_id.setText("차량 ID : 7284c5c114");
                TextView car_pattern=(TextView)findViewById(R.id.car_pattern);
                car_pattern.setText("행동 패턴 : 주변 차량 속도 + 0.27km/h...");
                TextView textView4=(TextView)findViewById(R.id.textView4);
                textView4.setText("53"); //좋아요 초기값
                TextView textView5=(TextView)findViewById(R.id.textView5);
                textView5.setText("21"); //싫어요 초기값

            }
        }); //오른쪽 버튼 눌렀을때

        ImageButton imageButton_down = (ImageButton) findViewById(R.id.imageButton_down) ;
        imageButton_down.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event
                TextView car_id=(TextView)findViewById(R.id.car_id);
                car_id.setText("차량 ID : c5b3243c73");
                TextView car_pattern=(TextView)findViewById(R.id.car_pattern);
                car_pattern.setText("행동 패턴 : 멈춰 있는 중...");
                TextView textView4=(TextView)findViewById(R.id.textView4);
                textView4.setText("274"); //좋아요 초기값
                TextView textView5=(TextView)findViewById(R.id.textView5);
                textView5.setText("63"); //싫어요 초기값

            }
        }); //아래쪽 버튼 눌렀을때



        // 생성한 비디오뷰를 선언
        VideoView videoView = (VideoView) findViewById(R.id.videoView1);

        // 비디오뷰를 커스텀하기 위해서 미디어컨트롤러 객체 생성
        MediaController mediaController = new MediaController(this);

        // 비디오뷰에 연결
        mediaController.setAnchorView(videoView);
        // 안드로이드 res폴더에 raw폴더를 생성 후 재생할 동영상파일을 넣습니다.
        Uri video = Uri.parse("android.resource://" + getPackageName() + "/"
                + R.raw.aaaa);

        //비디오뷰의 컨트롤러를 미디어컨트롤로러 사용
        videoView.setMediaController(mediaController);

        //비디오뷰에 재생할 동영상주소를 연결
        videoView.setVideoURI(video);

        //비디오뷰를 포커스하도록 지정
        videoView.requestFocus();

        //동영상 재생
        videoView.start();

    }



}
