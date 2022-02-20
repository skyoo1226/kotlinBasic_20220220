package com.knta.kotlinbasic_20220220

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 아무말 => 메모 남김
        // 단축키는 Ctrl + /

//        btnLog 버튼이 눌리면 해야할 일
        btnLog.setOnClickListener {

//            로그 버튼이 눌릴때마다 실행될 코드
//            로그를 찍어 보자  이벤트 처리

            Log.d("메인화면", "로그 버튼 눌림")
            Log.e("메인화면", "e로 로그 찍어보기")

        }



    }
}