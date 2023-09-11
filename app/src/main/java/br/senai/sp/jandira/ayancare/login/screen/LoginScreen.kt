package br.senai.sp.jandira.ayancare.login.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import br.senai.sp.jandira.ayancare.components.ButtonPadrao
import br.senai.sp.jandira.ayancare.components.CaixaDeTexto
import br.senai.sp.jandira.ayancare.components.Onda
import br.senai.sp.jandira.ayancare.components.RedeSocialScreen
import br.senai.sp.jandira.ayancare.components.TextFieldPassword
import br.senai.sp.jandira.ayancare.login.components.Linha



@Composable
fun LoginScreen() {
    Surface (
        color = Color(248, 240, 236)
    ){
        Onda()

        Column (
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 40.dp, start = 15.dp, end = 15.dp, bottom = 40.dp)
                .fillMaxSize()
        ){
            Text(
                text = "Olá!",
                fontSize = 35.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(600),
                color = Color(0xFF000000)
            )
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Bem-vindo de volta!",
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF35225F),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "sentimos sua falta.",
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF35225F),
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(25.dp))

            Column (
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
            ){
                CaixaDeTexto(valor = "", label = "Email") {}

                Spacer(modifier = Modifier.height(25.dp))

                TextFieldPassword(label = "Senha", valor = "Senha", aoMudar = {})

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Esqueceu a senha?",
                    fontSize = 13.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFFA7A5A4)
                )
            }

            Spacer(modifier = Modifier.height(50.dp))


            Column (
                modifier = Modifier.width(190.dp)
            ) {
                ButtonPadrao(text = "Entrar") {}
            }

            Linha()

            Row {
                RedeSocialScreen {}
                Spacer(modifier = Modifier.width(70.dp))
                RedeSocialScreen {}
            }

            Spacer(modifier = Modifier.height(50.dp))

            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Não tem conta?",
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFDFAF8),
                    textAlign = TextAlign.Right,
                )
                Text(
                    text = "Cadastre-se aqui.",
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFDFAF8),
                    textAlign = TextAlign.Right,
                    textDecoration = TextDecoration.Underline,
                )
            }

        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview() {
    LoginScreen()
}