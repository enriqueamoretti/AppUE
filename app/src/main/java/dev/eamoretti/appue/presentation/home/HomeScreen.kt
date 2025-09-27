package dev.eamoretti.appue.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.eamoretti.appue.data.model.CountryModel

val mockCountries = listOf(
    CountryModel("Colombia", 8, "https://flagcdn.com/w320/co.png"),
    CountryModel("Argentina", 1, "https://flagcdn.com/w320/ar.png"),
    CountryModel("Francia", 4, "https://flagcdn.com/w320/fr.png"),
    CountryModel("Brasil", 3, "https://flagcdn.com/w320/br.png"),
    CountryModel("Perú", 52, "https://flagcdn.com/w320/pe.png"),
    CountryModel("Uruguay", 9, "https://flagcdn.com/w320/ur.png")
)

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        //verticalArrangement = Arrangement.Center,
        //horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Bienvenido a la pantalla principal
        Text(text = "Ranking FIFA 2025")
        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn {
            items(mockCountries) { country ->
                Text("Country: ${country.name}")
            }
        }
    }
}
