package com.myapplication.bookhub.fragment

import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.myapplication.bookhub.R


class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val feedback: TextView = view.findViewById(R.id.feedback)
        feedback.text =
            Html.fromHtml("<a href=\"mailto:bhoomika.garg.9@gmail.com\">Send Feedback</a>")
        feedback.movementMethod = LinkMovementMethod.getInstance()



        return view

    }


}