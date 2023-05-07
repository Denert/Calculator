package ru.mike.creditcalculator2.screens

import android.content.Context
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import ru.mike.creditcalculator2.R
import ru.mike.creditcalculator2.databinding.ScreenCreditCalculationBinding
import ru.mike.creditcalculator2.navigation.BottomNavigationFragment

class ScreenCreditCalculation : BottomNavigationFragment() {

    companion object {
        fun newInstance(): ScreenCreditCalculation = ScreenCreditCalculation()
    }

    private lateinit var bindingTest: ScreenCreditCalculationBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        //TODO: Dagger component
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bindingTest = ScreenCreditCalculationBinding.inflate(inflater, container, false)

        setupViews()

        return bindingTest.root
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        setupViews()
//    }

    private fun setupViews() {
        setupCreditType()
    }

    private fun setupCreditType() {
        val creditTypes = listOf(getString(R.string.credit_annuity), getString(R.string.credit_differentiated))
        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.item_credit_popup_menu,
            creditTypes
        )
        bindingTest.creditTypeTv.setAdapter(adapter)
    }

}