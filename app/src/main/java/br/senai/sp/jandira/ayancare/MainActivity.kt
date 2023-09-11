package br.senai.sp.jandira.ayancare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.ayancare.components.ButtonPadrao
import br.senai.sp.jandira.ayancare.components.CaixaDeTexto
import br.senai.sp.jandira.ayancare.confirmacaoEmail.screen.ConfirmacaoEmailScreen
import br.senai.sp.jandira.ayancare.finalizarCadastro.screen.FinalizarCadastroScreen
import br.senai.sp.jandira.ayancare.login.screen.LoginScreen
import br.senai.sp.jandira.ayancare.telaHome1.screen.TelaHome1Screen
import br.senai.sp.jandira.ayancare.telaHome2.screen.TelaHome2Screen
import br.senai.sp.jandira.ayancare.telaHome3.screen.TelaHome3Screen
import br.senai.sp.jandira.ayancare.telaPrincipal.screen.TelaPrincipalScreen
import br.senai.sp.jandira.ayancare.ui.theme.AyanCareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AyanCareTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    //ButtonPadrao(text = "Entrar", onClick = {})
                    //CaixaDeTexto(valor = "dooas", label = "Entrar") {}
                    //TelaPrincipalScreen()
                    //TelaHome1Screen()
                    //TelaHome2Screen()
                    //TelaHome3Screen()
                    //LoginScreen()
                    //FinalizarCadastroScreen()
                    ConfirmacaoEmailScreen()
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    AyanCareTheme {
        CaixaDeTexto(valor = "", label = "Entrar") {}
    }
}