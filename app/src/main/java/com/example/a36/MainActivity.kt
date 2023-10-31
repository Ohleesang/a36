package com.example.a36

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun isTrue(a:Char) :Boolean {
                if(a =='0') return true
                else if(a =='1') return true
                else if(a =='2') return true
                else if(a =='3') return true
                else if(a =='4') return true
                else if(a =='5') return true
                else if(a =='6') return true
                else if(a =='7') return true
                else if(a =='8') return true
                else if(a =='9') return true
                else return false

            }
            fun solution(s: String): Boolean {
                var answer = true
                // s의길이가 4또는 6인가
                if(s.length ==4 || s.length ==6) answer = true;
                else return false
                // s에 숫자가 포함되어있는가
                for(i in 0..s.length-1){
                    if(!isTrue(s[i])) return false
                }

                return answer
            }
        }
        val a = Solution()
        a.solution("a234")
        a.solution("1234")
    }
}