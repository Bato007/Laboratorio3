package com.example.laboratorio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.laboratorio3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    // Cambiando el contenido del texto y luego haciendo visibles/
    fun changeText(view: View){
        binding.newContent.text = binding.changeName.text

        //Cambiando la visibilidad
        if(binding.nameView.visibility == 0){
            binding.nameView.visibility = View.GONE
            binding.changeName.visibility = View.GONE
            binding.newContent.visibility = View.VISIBLE
        } else {
            binding.nameView.visibility = View.VISIBLE
            binding.changeName.visibility = View.VISIBLE
            binding.newContent.visibility = View.GONE
        }
    }

    // Empezando la actividad
    fun changeActivity(view: View){
        // Mandando el texto
        val intent = Intent(this, Main2Activity::class.java)
        val message: String = "Chiquimula es un departamento ubicado en el oriente " +
                "\nde Guatemala. Limita al norte con el departamento de Zacapa; al sur con la República " +
                "\nde El Salvador y el departamento de Jutiapa; al este con la República de Honduras; y al " +
                "\noeste con los departamentos de Jalapa y Zacapa. Es conocido en el ámbito guatemalteco como" +
                "\n La Perla de Oriente. Es uno de los departamentos con mejor Índice de Desarrollo Humano," +
                "\n además es el tercer departamento de Guatemala en tener un mayor porcentaje de población " +
                "\neconómicamente activa y es el cuarto con mayor producción de Producto Interno Bruto y ocupa " +
                "\nel segundo puesto en los departamentos con mejor PIB per cápita. Es el departamento más visitado " +
                "\ndel país, datos del Instituto Guatemalteco de Turismo estiman que un aproximado de 4 a 5 millones " +
                "\nde personas visitan este departamento cada año, superando a los departamentos de Guatemala, " +
                "\nSacatepéquez y Petén; Esquipulas es el municipio principalmente visitado. Las únicas dos ciudades" +
                "\n existentes son la Ciudad de Chiquimula y la Ciudad de Esquipulas, la primera ubicada en el nor-occidente " +
                "\ndel departamento y la segunda se ubica en el sur-centro. Tiene una población de 388 115 habitantes, la mayoría " +
                "\njóvenes entre 0 a 35 años. Es el séptimo departamento con menor población. Aproximadamente el 93% está compuesto" +
                "\n mayoritariamente por mestizos y criollos, en su mayoría de español y alemán, el otro 7% está compuesto por los " +
                "\nindígenas en su mayoría el pueblo Chortís."
        intent.putExtra("placeDescription", message)
        intent.putExtra("placeName", "Chiquimula")
        startActivity(intent)
    }

    fun changeActivity2(view: View){
        // Mandando el texto
        val intent = Intent(this, Main2Activity::class.java)
        val message: String = "Jutiapa es uno de los 22 departamentos de la República de Guatemala, ubicado a 118 km de la capital, " +
                "\nes bastante montañoso y cuenta con playas turísticas al sur del departamento. Su clima es muy diverso entre cálido y" +
                "\n templado. Su cabecera departamental es Jutiapa y limita al norte con los departamentos de Jalapa y Chiquimula; al sur" +
                "\n con el departamento de Santa Rosa y el océano Pacífico y al este con la República de El Salvador. Cuenta con una población " +
                "\nde 489.085 habitantes. Jutiapa oficialmente es el único departamento de Guatemala que no tiene descendientes Mayas propios " +
                "\nde la región. En Jutiapa un 64% mayoritariamente mestizo (no indígena) pero por la llegada de inmigrantes al país en siglos " +
                "\npasados y actualmente han crecido los criollos y mestizos predominantemente blanco, con ascendencias extranjeras. Un 6% de la " +
                "\npoblación es indígena en su totalidad del pueblo Chortís los cuales no son propios de la región Jutiapaneca, si no que han " +
                "\nemigrado del departamento vecino del norte Chiquimula, y un 2% es Xinca lo cual se caracteriza por ser una etnia totalmente " +
                "\nde familia desconocida y no relacionada con el Azteca ni Maya. Su extensión territorial es de 3.219 km2.\n" +
                "\nEconomía La principal riqueza de la región la constituyen los productos derivados de la ganadería (queso, leche, carne y cueros)," +
                "\n razón por la cual se distingue por sus grandes haciendas de ganado vacuno y caballar"
        intent.putExtra("placeDescription", message)
        intent.putExtra("placeName", "Jutiapa")
        startActivity(intent)
    }

    fun changeActivity3(view: View){
        // Mandando el texto
        val intent = Intent(this, Main2Activity::class.java)
        val message: String = "Quiché es un departamento que se encuentra situado en la región noroccidental de la República de Guatemala.\n" +
                "Poco después de la conquista de Guatemala, la región de la Sierra de los Cuchumatanes, fue parte de la región de Tezulutlán " +
                "\nen donde numerosos indígenas se atrincheraron para resistir la conquista española. Cuando los españoles e indígenas tlaxcaltecas" +
                "\n y cholultecas invadieron Guatemala en la década de 1520, la región de Sacapulas y otros poblados indígenas ixiles y uspantekos" +
                "\n resistieron varios años a la conquista gracias a su ubicación en la sierra de los Cuchumatanes y a la ferocidad de sus guerreros; " +
                "\ntras varios años de derrotar los intentos de conquista española, finalmente fueron derrotados en diciembre de 1530, y los guerreros " +
                "\nsobrevivientes fueron marcados como esclavos en castigo a su prolongada resistencia.\n" +
                "El departamento propiamente dicho fue creado a partir de los departamentos originales de Totonicapán/Huehuetenango y Sololá/Suchitepéquez " +
                "\nque se habían creado en 1825, pocos años después de la Independencia de Centroamérica. El gobierno de facto provisorio de Miguel García" +
                "\nGranados el 12 de agosto de 1872 consideró que era conveniente crea el nuevo departamento para lograr una mejor administración de la región.\n" +
                "\nA partir de 1970 pertenece a la Franja Transversal del Norte y durante la guerra civil que vivió el país entre 1960 y 1996 fue el " +
                "\nescenario de cruentos combates y políticas de tierra arrasada, principalmente en el área petrolera de Ixcán especialmente a partir de 1972, con " +
                "\nel ingreso al territorio del Ejército Guerrillero de los Pobres. Limita al norte con México; al sur con los departamentos de Chimaltenango y Sololá;" +
                "\nal este con los departamentos de Alta Verapaz y Baja Verapaz; y al oeste con los departamentos de Totonicapán y Huehuetenango."
        intent.putExtra("placeDescription", message)
        intent.putExtra("placeName", "Quiché")
        startActivity(intent)
    }
}
