package br.senai.sp.jandira.ayancare.cadastro.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ayancare.R
import br.senai.sp.jandira.ayancare.cadastro.components.BarraProgresso
import br.senai.sp.jandira.ayancare.components.ButtonPadrao
import br.senai.sp.jandira.ayancare.components.CaixaDeTexto
import br.senai.sp.jandira.ayancare.components.Onda
import br.senai.sp.jandira.ayancare.components.TextFieldPassword
import br.senai.sp.jandira.ayancare.login.screen.LoginScreen

@Composable
fun CadastroScreen() {

    var checked by remember {
        mutableStateOf(false)
    }

    Surface (
        color = Color(248, 240, 236)
    ) {
        Onda()
        Column (
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 40.dp, start = 15.dp, end = 15.dp, bottom = 40.dp)
                .fillMaxSize()
        ){
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Criar Conta",
                    fontSize = 40.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
                Text(
                    text = "Insira seus dados para se registrar",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF9E8BC1),
                    textAlign = TextAlign.Center,
                )
            }

            Column (
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
            ){
                CaixaDeTexto(valor = "", label = "Email") {}

                Spacer(modifier = Modifier.height(25.dp))

                TextFieldPassword(label = "Senha", valor = "Senha", aoMudar = {})

                Spacer(modifier = Modifier.height(25.dp))

                TextFieldPassword(label = "Confirmar Senha", valor = "Senha", aoMudar = {})

                Spacer(modifier = Modifier.height(30.dp))

                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ){
                    Checkbox(
                        checked = checked,
                        onCheckedChange = {
                            checked = it
                        }
                    )
                    Text(
                        text = "Aceito Todos ",
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000)
                    )
                    Text(
                        text = "Termos de Uso",
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                        textDecoration = TextDecoration.Underline
                    )
                }

            }
            Column (
                modifier = Modifier.width(190.dp)
            ) {
                ButtonPadrao(text = "Proximo") {}
            }
            BarraProgresso(text = "1 / 3", valor = 110)

        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CadastroPreview() {
    CadastroScreen()
}