package br.senai.sp.jandira.ayancare.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ayancare.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CaixaDeTexto(
    valor: String,
    label: String,
    aoMudar:() -> Unit
){

    OutlinedTextField(
        value = valor,
        onValueChange = { aoMudar() },
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(4.dp),
        label = {
            Text(
                text = label
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun CaixaDeTextoPreview(){
    CaixaDeTexto(valor = "", label = "") {}
}