package com.example.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.calculator.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private var isResultDisplayed = false // Sonucun gösterilip gösterilmediğini takip eden değişken

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentMainBinding.inflate(inflater, container, false)

        /* operation=-1 no action
           operation=0 dividing
           operation=1 multiplication
           operation=2 subtraction
           operation=3 addition
         */

        var firstNum=0.0
        var operation=0

        binding.buttonTamsilme.setOnClickListener{
            firstNum=0.0
            binding.textView.text=""
            operation=-1
            isResultDisplayed = false
        }

        binding.buttonTekSil.setOnClickListener {
            if (isResultDisplayed == false) { //sonuç gösterilmiyorsa
                var text = binding.textView.text.toString()
                if (text.length == 1) {
                    binding.textView.text = "0"
                } else {
                    binding.textView.text = text.substring(0, text.length - 1)
                }
            }
        }

        binding.buttonBolme.setOnClickListener{
            firstNum = binding.textView.text.toString().replace(',', '.').toDouble()
            binding.textView.text=""
            operation=0
            isResultDisplayed = false
        }

        binding.buttonCarpma.setOnClickListener{
            firstNum = binding.textView.text.toString().replace(',', '.').toDouble()
            binding.textView.text=""
            operation=1
            isResultDisplayed = false
        }

        binding.buttonEksi.setOnClickListener{
            firstNum = binding.textView.text.toString().replace(',', '.').toDouble()
            binding.textView.text=""
            operation=2
            isResultDisplayed = false
        }

        binding.buttonArti.setOnClickListener{
            firstNum = binding.textView.text.toString().replace(',', '.').toDouble()
            binding.textView.text=""
            operation=3
            isResultDisplayed = false
        }

        binding.button9.setOnClickListener{
            var text=binding.textView.text.toString()
            if (text=="0" || isResultDisplayed){
                binding.textView.text="9"
            } else{
                binding.textView.append("9")
            }
            isResultDisplayed = false
        }

        binding.button8.setOnClickListener{
            var text=binding.textView.text.toString()
            if (text=="0" || isResultDisplayed){
                binding.textView.text="8"
            } else{
                binding.textView.append("8")
            }
            isResultDisplayed = false
        }

        binding.button7.setOnClickListener{
            var text=binding.textView.text.toString()
            if (text=="0" || isResultDisplayed){
                binding.textView.text="7"
            } else{
                binding.textView.append("7")
            }
            isResultDisplayed = false
        }

        binding.button6.setOnClickListener{
            var text=binding.textView.text.toString()
            if (text=="0" || isResultDisplayed){
                binding.textView.text="6"
            } else{
                binding.textView.append("6")
            }
            isResultDisplayed = false
        }

        binding.button5.setOnClickListener{
            var text=binding.textView.text.toString()
            if (text=="0" || isResultDisplayed){
                binding.textView.text="5"
            } else{
                binding.textView.append("5")
            }
            isResultDisplayed = false
        }

        binding.button4.setOnClickListener{
            var text=binding.textView.text.toString()
            if (text=="0" || isResultDisplayed){
                binding.textView.text="4"
            } else{
                binding.textView.append("4")
            }
            isResultDisplayed = false
        }

        binding.button3.setOnClickListener{
            var text=binding.textView.text.toString()
            if (text=="0" || isResultDisplayed){
                binding.textView.text="3"
            } else{
                binding.textView.append("3")
            }
            isResultDisplayed = false
        }

        binding.button2.setOnClickListener{
            var text=binding.textView.text.toString()
            if (text=="0" || isResultDisplayed){
                binding.textView.text="2"
            } else{
                binding.textView.append("2")
            }
            isResultDisplayed = false
        }

        binding.button1.setOnClickListener{
            var text=binding.textView.text.toString()
            if (text=="0" || isResultDisplayed){
                binding.textView.text="1"
            } else{
                binding.textView.append("1")
            }
            isResultDisplayed = false
        }

        binding.button0.setOnClickListener{
            var text=binding.textView.text.toString()
            if (text=="0" || isResultDisplayed){
                binding.textView.text="0"
            } else{
                binding.textView.append("0")
            }
            isResultDisplayed = false
        }


        binding.buttonVirgul.setOnClickListener {
            var text = binding.textView.text.toString()
            if (!text.contains(".")) {
                binding.textView.append(".")
            }
            isResultDisplayed = false
        }



        binding.buttonEsittir.setOnClickListener{
            val secNum = binding.textView.text.toString().replace(',', '.').toDouble()
            var total=when(operation){
                0 -> firstNum / secNum
                1 -> firstNum * secNum
                2 -> firstNum - secNum
                3 -> firstNum + secNum
                else -> binding.textView.text="Hiçbir işlem seçilmedi !"
            }

            binding.textView.text=total.toString()
            isResultDisplayed = true //sonuç gösterildi
        }






            return binding.root
    }

}
