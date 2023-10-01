package hungpnph28935.fptpolytechnic.test2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.AlertDialog
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview


import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import hungpnph28935.fptpolytechnic.test2.ui.theme.Test2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test2Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize()) {
                    homeScreen()
                    //aaaaaaaaaaa

                }
            }
        }
    }
}
@Composable
fun homeScreen() {
    val brush = Brush.verticalGradient(listOf(Color(0xFFFEAFAF), Color(0xffFF0000)))
    Box(modifier = Modifier
        .fillMaxSize()
        .background(brush)){
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 80.dp)
        ) {
            loginScreen()
            Spacer(modifier = Modifier.height(40.dp))
            btnLogin()
        }
    }

}
@Composable
fun loginScreen() {
    Image(
        painterResource(id = R.drawable.logo_polychat),
        contentDescription ="",
    )
    Spacer(modifier = Modifier.height(20.dp))
    Row {
        Text("POLY", style = TextStyle(Color.White, fontSize = 30.sp,fontWeight = FontWeight.Bold))
        Text("CHAT", style = TextStyle(Color(0xffffc78f), fontSize = 30.sp,fontWeight = FontWeight.Bold))

    }

    Spacer(modifier = Modifier.height(20.dp))
    Column (
        modifier = Modifier.padding(start = 20.dp, end = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ){
       Text(text = "Kết bạn và trò chuyện thú vị", style = TextStyle(Color.Yellow, fontSize = 20.sp,fontWeight = FontWeight.W500))
       Spacer(modifier = Modifier.height(15.dp))
       Text(text = "Bằng việc đăng nhap và đồng ý với các điều khoản sử dụng và chính sách quyền riêng tư của chúng tôi",
           color = Color.White, textAlign = TextAlign.Center, fontWeight = FontWeight.W500)
    }

}
@Composable
fun btnLogin() {
  //  var showDialog by remember { mutableStateOf(false) }
    Button(onClick = {  },
        colors = ButtonDefaults.buttonColors(
            Color.White,
            contentColor = Color.Red),
        modifier = Modifier.width(300.dp)
    ) {
        Icon(painterResource(id = R.drawable.logo_google)  ,
            contentDescription ="",Modifier.size(16.dp) )
        Text(" Đăng nhập bằng Google", fontSize = 20.sp)    }
    Spacer(modifier = Modifier.height(20.dp))
    Button(onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            Color.White,
            contentColor = Color.Red),
        modifier = Modifier.width(300.dp)
    ) {
        Text(text = "Xem thông tin điều khoản", fontSize = 20.sp)
    }
    //-----------
//    if (showDialog){
//        LoginDialoga(
//            onDismiss = { showDialog = false }
//        )
//    }
}
@Composable
fun LoginDialog(
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Đăng nhập") },
        modifier = Modifier.fillMaxWidth(),
        confirmButton = {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "Đăng nhập chỉ với sinh viên Fpoly nhé, nhanh như chó chạy ngoài đồng")
                Spacer(modifier = Modifier.width(24.dp))
                Button(
                    onClick = {
                        // Handle Google login
                        onDismiss()
                    },
                    colors = ButtonDefaults.buttonColors(
                        Color.White,
                        contentColor = Color.Red),
                    modifier = Modifier.fillMaxWidth(24f)
                ) {
                    Icon(painterResource(id = R.drawable.ic_launcher_background)  , contentDescription ="",
                        Modifier
                            .size(12.dp)
                            .padding(12.dp) )
                    Text("Đăng nhập với Google")
                }
                Spacer(modifier = Modifier.width(16.dp))
            }
        }
    )
}
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun LoginDialoga(
    onDismiss: () -> Unit
) {
    BottomSheetScaffold(
        sheetContent = {
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(250.dp)
        .background(Color.Red)){

    }
        }
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(Color.Red)
                .fillMaxSize(1.0f)
                .padding(20.dp)
        ) {
            Text("Đăng Nhập", style = TextStyle(Color.White, fontSize = 25.sp,fontWeight = FontWeight.Bold))
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    onDismiss()
                },
                colors = ButtonDefaults.buttonColors(
                    Color.White,
                    contentColor = Color.Red),
                modifier = Modifier.fillMaxWidth(24f)
            ) {
                Icon(painterResource(id = R.drawable.ic_launcher_background)  ,
                    contentDescription ="",Modifier.size(14.dp) )
                Text(" Đăng nhập bằng Google", fontSize = 20.sp)
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Test2Theme {
        homeScreen()
    }
}

