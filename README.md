<h2>Temática elegida:</h2>

Salas de conciertos de la provincia de Valencia: Un hobby muy estandarizado en la ciudad de Valencia es la búsqueda de espectáculos musicales en directo. Una aplicación que ayuda a la gente a conocer grandes salas de la provincia de Valencia en donde se apuesta por la música en directo. 

<h2>Público objetivo:</h2>
Personas amantes de la música en directo. Usuarios de dispositivos Android.

<h2>Dispositivos objetivo:</h2>
Como se muestra en el build.gradle.kt de Explora, los dispositivos objetivos son aquellos con versión Android  36. 
Sin embargo, la aplicación estará disponible para todos los dispositivos Android desde la versión 27 hasta la 36, lo que supone más de un  96% de los dispositivos Android en activo. 

<h2>¿Por qué una aplicación nativa?:</h2>
<ul>
    <li>A la hora de progrmar la aplicación, el acceso a las funcionalidades están optimizados y a nivel de usuario, está mucho mejor integrado y ofrece mejor experiencia (teclados virtuales, acceso a funcionalidades del dispositivo, aceso a cámara...).</li>
    <li>Ofrece ventajas a la hora de optimización de pantalla, lo que mejora la experiencia en todo tipo de dispositivos.</li>
    <li>Son más rápidas y funcionan mejor.</li>
    <li>El público objetivo son usuarios de Android.</li>
</ul>

<h2>Estructura del proyecto:</h2>

<ul>
    <li>data class Place: información sobre las salas de concierto</li>
    <li>Componentes @composable
        <ol>
            <li>ImagePlace: imágen obtenida a partir de una referencia a la carpeta de recursos (R) con configuración determinada</li>
            <li>CardPlace: tarjeta con información de las salas de concierto, incluído el componente ImagePlace</li>
        </ol>
    </li>
    <li>Escenas @composable: escena configurada a partir de un Scafold que contiene un TopBar, un buscador (OutlinedTextField) y un lazyColum que despliega una lista de componentes de tipo (CardPlace) </li>
    <li>Recursos: imágenes (drawable), icono, values (ES-EN-FR-CA) con contenidos de String, themes, colors. </li>
</ul>

<h2>Utilizando Debugger y Logcat en Android Studio:</h2>

Podemos ver el valor de la variable i por consola:
<img width="2612" height="839" alt="i=index+1" src="https://github.com/user-attachments/assets/717c948e-3b38-4392-bbad-52bc71342c53" />


Se produce una excepción de tipo illegal argument. La copia se guarda en i+1 y como resultado obtenemos una lista con 2 claves iguales. CRASH
<img width="2477" height="821" alt="Illegal Argument Exc Crash" src="https://github.com/user-attachments/assets/57f577b4-d626-48d3-bce5-2f44ac50b28a" />


Podemos ver el valor de la variable i por consola:
<img width="2601" height="965" alt="i=index +50" src="https://github.com/user-attachments/assets/8caafb84-dc0a-4742-ad62-3c17afadf2a7" />

Se produce una excepción de tipo Out of Bounds:
<img width="2190" height="797" alt="Out of Bound Exc Crash" src="https://github.com/user-attachments/assets/545656cf-ba63-435c-9405-59f91f6958cb" />


<h2>Ciclo de vida de la aplicación al girar la pantalla:</h2>

Ejecución de la aplicación:
<img width="1714" height="991" alt="image" src="https://github.com/user-attachments/assets/a23b2cc7-a1e2-4ed0-805c-7de462ee30e3" />

Giro de pantalla:
<img width="1657" height="1067" alt="image" src="https://github.com/user-attachments/assets/2e140153-53d2-4467-a6b1-4ee20e5127c4" />


La actividad es destruída y se vuelve a crear desde cero.






