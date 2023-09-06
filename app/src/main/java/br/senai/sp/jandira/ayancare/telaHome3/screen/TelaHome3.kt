package br.senai.sp.jandira.ayancare.telaHome3.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ayancare.R
import br.senai.sp.jandira.ayancare.components.ButtonPadrao
import br.senai.sp.jandira.ayancare.components.Header

@Composable
fun TelaHome3Screen() {

    Column (
        modifier = Modifier
            .padding(15.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Header()
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Trazendo conectividade",
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(700),
                color = Color(0xFF35225F),
                textAlign = TextAlign.Center
            )
            Text(
                text = "para o usuario",
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(700),
                color = Color(0xFF35225F),
                textAlign = TextAlign.Center
            )
        }
        Image(
            painter = painterResource(id = R.drawable.home3),
            contentDescription = "",
            modifier = Modifier
                .padding(6.dp)
                .width(300.dp)
                .height(300.dp)
        )
        Text(
            text = "mais conforto de dentro da sua casa",
            fontSize = 16.sp,
            fontFamily = FontFamily(Font(R.font.poppins)),
            fontWeight = FontWeight(500),
            color = Color(0xFF35225F),
            textAlign = TextAlign.Center
        )
        Row (){
            Card (
                Modifier
                    .width(10.dp)
                    .height(10.dp)
                    .background(
                        color = Color(0xFF35225F),
                        shape = RoundedCornerShape(size = 10.dp)
                    )
            ){}
            Spacer(modifier = Modifier.width(8.dp))
            Card (
                Modifier
                    .width(10.dp)
                    .height(10.dp)
                    .background(
                        color = Color(0xFF35225F),
                        shape = RoundedCornerShape(size = 10.dp)
                    )
            ){}
            Spacer(modifier = Modifier.width(8.dp))
            Card (
                Modifier
                    .width(10.dp)
                    .height(10.dp)
                    .background(
                        color = Color(0xFF35225F),
                        shape = RoundedCornerShape(size = 10.dp)
                    )
            ){}

        }
        ButtonPadrao(text = "Ir para o app") {}
        Text(
            text = "Pular",
            fontSize = 14.sp,
            color = Color.Transparent,
        )
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaHome3Preview() {
    TelaHome3Screen()
}