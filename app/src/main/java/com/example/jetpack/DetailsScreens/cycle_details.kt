import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpack.DetailsScreens.getDetails_cycle
import com.example.jetpack.R

@Composable

fun cycle_details(navController: NavController) {


    val listcycle = getDetails_cycle().get(0)




    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Card(
            modifier = Modifier
                .padding(8.dp)
                .background(Color(717070))
                .fillMaxSize(),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 4.dp,
                pressedElevation = 8.dp,
                disabledElevation = 0.dp
            )

        ) {
            Column(
                horizontalAlignment= Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(Color.White)
                    .padding(8.dp)
                    .fillMaxSize()
            ) {
                Spacer(
                    modifier = Modifier
                        .height(8.dp)
                        .background(Color.Gray)
                )
                Image(
                    painter = painterResource(id = listcycle.img),
                    contentDescription = " ",
                    modifier = Modifier
                        .padding(end = 10.dp)
                        .size(400.dp)
                        .weight(.5f)

                )
                Column(
                    Modifier
                        .weight(.8f)
                        .padding(10.dp),
                    horizontalAlignment = Alignment.Start,

                    ) {

                    Text(
                        text = "Owner details:",
                        fontSize = 17.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = listcycle.name,
                        style = MaterialTheme.typography.titleLarge,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Text(text = "Sch ID: ",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                        Text(
                            text = listcycle.schid,
                            color = Color.Gray,
                            fontSize = 20.sp
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = listcycle.price,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row {
                        Text(text = "Contact No: ",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp)
                        Text(text = listcycle.no)
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row (verticalAlignment = Alignment.CenterVertically){
                        Text(text = "WhatsApp No: ",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp)
                        Text(text = listcycle.Wno)
                        Image(
                            alignment = Alignment.Center,
                            painter = painterResource(id = R.drawable.wc),
                            contentDescription = " ",
                            modifier = Modifier
                                .padding(end = 50.dp)
                                .size(20.dp)
                                .weight(.5f)

                        )

                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Product Discription:",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp)
                    Text(text = listcycle.prodDisc)


//



                }
            }
        }
    }
}
