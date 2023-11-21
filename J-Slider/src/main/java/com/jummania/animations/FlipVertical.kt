package com.jummania.animations

import android.view.View
import androidx.viewpager.widget.ViewPager.PageTransformer

/**
 * Created by Jummania on 21,November,2023.
 * Email: sharifuddinjumman@gmail.com
 * Dhaka, Bangladesh.
 */
internal class FlipVertical : PageTransformer {

    // This method is called for each page during the transformation process.
    override fun transformPage(view: View, position: Float) {
        // Calculate the rotation angle based on the position.
        val rotation: Float = -180f * position

        // Set alpha based on the rotation to create a fade-in/fade-out effect.
        view.alpha = if (rotation > 90f || rotation < -90f) 0f else 1f

        // Set the pivot point for rotation at the center of the page.
        view.pivotX = view.width * 0.5f
        view.pivotY = view.height * 0.5f

        // Apply rotation around the X-axis to create a vertical flip effect.
        view.rotationX = rotation
    }
}
