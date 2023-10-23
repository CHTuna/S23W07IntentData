package kr.ac.kumoh.s20190008.s23w07intentdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.ac.kumoh.s20190008.s23w07intentdata.databinding.ActivityImageBinding
import kr.ac.kumoh.s20190008.s23w07intentdata.databinding.ActivityMainBinding

class ImageActivity : AppCompatActivity() {
    private lateinit var main: ActivityImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityImageBinding.inflate(layoutInflater)
        setContentView(main.root)

        Log.i("Image!!!", intent.getStringExtra("location") ?: "없음")

        val res = when (intent.getStringExtra("location")){
            "mountain" -> R.drawable.mountain
            "sea" -> R.drawable.sea
            else -> R.drawable.ic_launcher_foreground
        }
        main.image.setImageResource(res)
    }
}