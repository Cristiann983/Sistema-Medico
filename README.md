   # Sistema de control medico  

Da clic en la imagen para reproducir video 👇
[![Ver Video](https://img.youtube.com/vi/6lJ2TI8NP7o/maxresdefault.jpg)](https://youtu.be/6lJ2TI8NP7o)

## Descripcion 

> [!NOTE]
>Este proyecto es un sistema de gestion de pacientes, medicos y de citas el cual nos permite manipular estos datos dependiendo
>de que usuario haya iniciado sesion ya que se realizo dos el administrador y los doctores, el administrador puede manipular
> todos los datos es decir eliminar, editar, crear un nuevo y las vistas, mientras que el doctor puede mirar ye generar recetas
 >mediante un PDF para despues enviarla por corrreo

## Tecnologias usadas
>[!IMPORTANT]
>Las tecnologías utilizadas en este proyecto incluyen componentes de interfaz gráfica con FlatLaf
> y JCalendar, acceso a bases de datos con MySQL Connector/J, generación de archivos PDF con iText y
>envío de correos electrónicos con JavaMail API. Estas bibliotecas ayudan a crear una aplicación con
>una interfaz atractiva, acceso a base de datos, generación de reportes en PDF y funcionalidad de correo electrónico.

## Uso

Al iniciar el programa con el login, tendrás que iniciar sesión dependiendo del usuario asignado, ya que existen dos tipos de usuario: **Doctor** y **Administrador**. Dependiendo del usuario con el que inicies sesión, se mostrarán diferentes ventanas.
![image](https://github.com/user-attachments/assets/d256cd1d-9f98-44d1-a328-b3562175f722)


### Inicio de sesión con nivel de usuario **Doctor**

El inicio de sesión con el nivel de usuario de **Doctor** tiene tres ventanas disponibles:

1. **Inicio**
   ![image](https://github.com/user-attachments/assets/9ec59b6a-c9e1-420a-9d62-da30d2c23378)

3. **Agenda**
   > En esta ventana, podrás ver el estado de una consulta. 
   > Tienes la opción de generar una receta y enviarla por correo o guardarla solo en el dispositivo local para luego imprimirla.
   ![image](https://github.com/user-attachments/assets/e1aeb443-6a7e-4a0f-b6dc-4a6446078104)

4. **Pacientes**
   >aqui el medico podra visualizar los pasientes existentes y sus datos
![image](https://github.com/user-attachments/assets/f16cb74f-9c55-41cd-9d0a-4333729edf44)

### Inicio de sesión con nivel de usuario **Administrador**

El inicio de sesión con el nivel de usuario de **Administrador** tiene las siguientes ventanas disponibles:

1. **Inicio**
    ![image](https://github.com/user-attachments/assets/fece0c8b-2e0b-449f-bc39-a804d738b76d)

3. **Pacientes**
   > En esta sección, podrás gestionar los pacientes. Tienes la opción de agregar, eliminar o editar los pacientes.
   > Además, se incluye un buscador para facilitar la edición o revisión de los datos de un paciente específico.
   ![image](https://github.com/user-attachments/assets/eb8ff342-ef06-438e-b5ad-3347e1f23535)

4. **Citas Médicas**
   > En este apartado, se generan las citas médicas, las cuales se asocian a los pacientes que has agregado.
   > Puedes cambiar la fecha de una cita, eliminarla o crear nuevas citas.
   ![image](https://github.com/user-attachments/assets/e7d4cf6d-3892-474a-90b1-93f29e59ae4d)

5. **Doctores**
   > Este apartado permite agregar nuevos doctores y gestionar sus datos. 
   > También tienes la opción de eliminar o editar la información de los doctores.
![image](https://github.com/user-attachments/assets/51d121fd-8ca5-45c8-9a56-907a657b51ab)

## Estructura del proyecto
![image](https://github.com/user-attachments/assets/4feacdd7-0941-4281-a257-41b880c47f49)
1. Source packages
   - __sistemamed:__
       es donde aparecere la pantalla principal del doctro que hace referncia a las demas pantallas.
     ![image](https://github.com/user-attachments/assets/61940ae8-5a5d-4f66-904f-3bd83e353bd4)

   - __sesion:__ 
      Donde se encuentra el logion el que nos permitira iniciar sesion dependiendo del usuairo que
     ingrese aqui tambien guardamos la iplementacion de los usuarios para 
     ![image](https://github.com/user-attachments/assets/62a7d6cf-063b-43ff-96f0-819b465fd0d0)

   - db
     
   - inter
   - Modelos
   - Vista admin
   - Vsita doc
   - Vista recepcionista
     
2. Other resources
   - resources
3. Dependencies
4. Java dependencies
5. Projet Files
   -pom.XML







