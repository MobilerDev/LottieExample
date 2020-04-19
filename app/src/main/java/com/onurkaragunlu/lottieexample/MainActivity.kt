package com.onurkaragunlu.lottieexample

import android.animation.Animator
import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable
import com.airbnb.lottie.TextDelegate
import com.airbnb.lottie.model.KeyPath
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lottiebutton.addAnimatorUpdateListener {
            if (it.animatedValue as Float >= 0.6) {
                println("Example")
            }

        }


        lottiebutton.setAnimation("buynow.json")
        lottiebutton.setOnClickListener {

            lottiebutton.setMinProgress(0.2f)
            lottiebutton.setMaxProgress(0.5f)
            lottiebutton.repeatCount = LottieDrawable.INFINITE
            lottiebutton.playAnimation()

            Handler().postDelayed({
                lottiebutton.repeatCount = 1
                lottiebutton.setMaxProgress(1.0f)

            }, 3000)
        }
    }

    fun setButtonAnimationListener() {
        lottiebutton.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?, isReverse: Boolean) {
                super.onAnimationEnd(animation, isReverse)
            }

            override fun onAnimationEnd(animation: Animator?) {

            }

            override fun onAnimationCancel(animation: Animator?) {

            }

            override fun onAnimationStart(animation: Animator?, isReverse: Boolean) {
                super.onAnimationStart(animation, isReverse)
            }

            override fun onAnimationStart(animation: Animator?) {

            }
        })
    }

}

