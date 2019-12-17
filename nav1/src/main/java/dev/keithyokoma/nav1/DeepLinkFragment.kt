package dev.keithyokoma.nav1

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class DeepLinkFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_deep_link, container, false).also {
            it.findViewById<Button>(R.id.button).setOnClickListener {
                startActivity(Intent()
                    .setComponent(ComponentName("dev.keithyokoma.nav2", "dev.keithyokoma.nav2.MainActivity"))
                )
            }
        }

    override fun onResume() {
        super.onResume()
        arguments?.keySet()?.forEach {
            println(arguments?.get(it))
        }
    }
}