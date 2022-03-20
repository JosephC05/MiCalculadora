package edu.itsco.micalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var operacion : Int = 0
    var numero: Double = 0.0
    lateinit var lbresultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lbresultado = findViewById(R.id.lbresultado)
        val btnc: Button = findViewById(R.id.btnc)
        val btnigual:Button = findViewById(R.id.btnigual)

        btnigual.setOnClickListener {
            var numero2: Double = lbresultado.text.toString().toDouble()
            var respuesta: Double =0.0

            when(operacion){
                1 -> respuesta = numero+numero2
                2 -> respuesta = numero-numero2
                3 -> respuesta = numero*numero2
                4 -> respuesta = numero/numero2

            }
            lbresultado.setText(respuesta.toString())
        }

        btnc.setOnClickListener {
            numero = 0.0
            operacion = 0
            lbresultado.setText("")
        }

    }
    fun numeroclick(view: View) {
        var num: String = lbresultado.text.toString()
        when (view.id) {
            R.id.btncero -> lbresultado.setText(num + "0")
            R.id.btn1 -> lbresultado.setText(num + "1")
            R.id.btn2 -> lbresultado.setText(num + "2")
            R.id.btn3 -> lbresultado.setText(num + "3")
            R.id.btn4 -> lbresultado.setText(num + "4")
            R.id.btn5 -> lbresultado.setText(num + "5")
            R.id.btn6 -> lbresultado.setText(num + "6")
            R.id.btn7 -> lbresultado.setText(num + "7")
            R.id.btn8 -> lbresultado.setText(num + "8")
            R.id.btn9 -> lbresultado.setText(num + "9")
            R.id.btnpunto -> lbresultado.setText(num + ".")


        }
    }
    fun operacionclick (view: View){
        numero = lbresultado.text.toString().toDouble()
        when(view.id){
            R.id.btnsuma -> {
                lbresultado.setText("")
                operacion = 1
            }
            R.id.btnresta -> {
                lbresultado.setText("")
                operacion = 2
            }
            R.id.btnmulti -> {
                lbresultado.setText("")
                operacion = 3
            }
            R.id.btndividir -> {
                lbresultado.setText("")
                operacion = 4
            }
        }
    }

}