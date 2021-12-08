package com.example.example.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.example.ui.activities.HomeActivity
import com.example.example.R
import com.example.example.databinding.FragmentLoginBinding
import com.example.example.isValidEmail


/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater,container,false)
        init()
        return binding.root
    }
    fun init(){
        binding.splashAnimation2.playAnimation()
    }
    override fun onStart() {
        super.onStart()
        binding.loginToSignup.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_signupFragment)
        }

        //realizo las validaciones de mi expresion regular con el valor ingresado en el campo de texto
        //del login

        binding.loginButton.setOnClickListener {
            var isValid = true

            if(!binding.loginEmail.text.isValidEmail()) {
                isValid = false
                binding.loginEmailLayout.error = "Correo electronico no valido"
            } else {
                binding.loginEmailLayout.error = null
            }

            if(binding.loginPassword.text.toString().length < 4) {
                isValid = false
                binding.loginPasswordLayout.error = "Contraseña invalida"
            } else {
                binding.loginPasswordLayout.error = null
            }


            if(isValid) {

                //navegamos de esta forma debido a que aun no conocemos como hacerlo de otra manera.
                    //esto hace que el codigo sea fuertemente acoplado , ya que el fragmento sabe a donde tiene
                        //que navegar, por eso no se hace (para eso se usan viewModels compartidos)
                val intent= Intent(requireContext(), HomeActivity::class.java)
                startActivity(intent)
            }
        }

    }


}