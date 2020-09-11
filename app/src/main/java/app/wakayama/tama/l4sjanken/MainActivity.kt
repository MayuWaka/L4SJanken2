package app.wakayama.tama.l4sjanken

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var kachi: Int = 0
        var make: Int = 0

        gooButton.setOnClickListener {
            playerImage.setImageResource(R.drawable.goo)
            val number: Int = Random.nextInt(3)

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.goo_r)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
                1 -> {
                    cpu.setImageResource(R.drawable.choki_r)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))

                    kachi = kachi + 1
                }
                2 -> {
                    cpu.setImageResource(R.drawable.paa_r)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))

                    make = make + 1
                }
            }

            // 勝敗を表示する
            textSyouhai.text = kachi.toString() + " 勝" + make.toString() + " 敗 です。"

//            val ret :Int = showResult()
        }


        chokiButton.setOnClickListener {
            playerImage.setImageResource(R.drawable.choki)
            val number: Int = Random.nextInt(3)

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.goo_r)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))

                    make = make + 1
                }
                1 -> {
                    cpu.setImageResource(R.drawable.choki_r)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
                2 -> {
                    cpu.setImageResource(R.drawable.paa_r)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))

                    kachi = kachi + 1
                }
            }
            // 勝敗を表示する
            textSyouhai.text = kachi.toString() + " 勝" + make.toString() + " 敗 です。"

        }


        paaButton.setOnClickListener {
            playerImage.setImageResource(R.drawable.paa)
//            player.text = "あなたの手はパーです"
            val number: Int = Random.nextInt(3)

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.goo_r)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))

                    kachi = kachi + 1
                }
                1 -> {
                    cpu.setImageResource(R.drawable.choki_r)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))

                    make = make + 1
                }
                2 -> {
                    cpu.setImageResource(R.drawable.paa_r)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
            }

            // 勝敗を表示する
            textSyouhai.text = kachi.toString() + " 勝" + make.toString() + " 敗 です。"

//            val ret :Int = showResult()
        }

    }
}