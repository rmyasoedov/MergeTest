package com.example.mergetest.frame1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.mergetest.MyConst
import com.example.mergetest.MyFun
import com.example.mergetest.R


class Frame1Fragment : Fragment() {

    lateinit var a1: EditText
    lateinit var a2: EditText
    lateinit var buttonSum: Button
    lateinit var resultField: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_frame1, container, false)

        a1 = root!!.findViewById(R.id.a1)
        a2 = root.findViewById(R.id.a2)
        buttonSum = root.findViewById(R.id.buttonSum)
        resultField = root.findViewById(R.id.resultField)

        buttonSum.text = MyConst.LABEL_BUTTON

        buttonSum.setOnClickListener {
            val sum = MyFun.Sum(a1.text.toString().toDouble(),a2.text.toString().toDouble())
            resultField.setText(sum.toString())
        }


        return root
    }
}