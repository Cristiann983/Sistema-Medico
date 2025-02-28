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

## Estructura del Proyecto

### 1. Source Packages

#### **sistemamed**
Es donde aparece la pantalla principal del doctor, que hace referencia a las demás pantallas.  
![Pantalla principal del doctor](https://github.com/user-attachments/assets/61940ae8-5a5d-4f66-904f-3bd83e353bd4)

#### **sesion**  
Contiene el login, que permite iniciar sesión dependiendo del usuario que ingrese. Aquí también se implementa la lógica de los usuarios para realizar el inicio de sesión y se realiza la consulta a la base de datos.  
![Paquete sesión](https://github.com/user-attachments/assets/62a7d6cf-063b-43ff-96f0-819b465fd0d0)

#### **db**  
Este paquete contiene la clase encargada de realizar la conexión con la base de datos.  
![Paquete db](https://github.com/user-attachments/assets/b6c1dee5-2714-4ce2-beb8-f46b29b525cf)

#### **inter**  
En este paquete se encuentran las clases que representan las tablas de la base de datos con métodos abstractos. Estas clases se implementarán posteriormente para realizar consultas.  
![Paquete inter](https://github.com/user-attachments/assets/3b385bfa-27f4-41c0-a20e-a4d7b5ed48ab)

#### **Modelos**  
Contiene las clases que representan las tablas de la base de datos con sus respectivos atributos. Estas clases permiten acceder y asignar valores cuando se implementan las clases abstractas, creando objetos para cada tabla.  
![Paquete Modelos](https://github.com/user-attachments/assets/8d3024d7-f19f-49f0-aac0-5a0796b63525)

#### **Vista admin**  
Este paquete contiene la pantalla principal del administrador, desde donde se implementan las demás pantallas. También incluye clases con métodos implementados de las interfaces, encargadas de realizar consultas a la base de datos para su uso en las ventanas del administrador.  
![Pantalla del administrador](https://github.com/user-attachments/assets/f4cb9f2d-92c5-4a58-92e6-3c03119274d2)

#### **Vista doc**  
Contiene todas las ventanas que se muestran en la vista del doctor.  
![Paquete Vista doc](https://github.com/user-attachments/assets/5c27c8a2-49f7-41e7-af51-ad4375cf2a4d)

#### **Vista recepcionista**  
Incluye las ventanas correspondientes a cada menú de la vista del administrador con sus respectivas funcionalidades.  
![Paquete Vista recepcionista](https://github.com/user-attachments/assets/aca39114-be4c-43fc-a936-797a89edaf33)

---

### 2. Other Resources

#### **resources**  
Este paquete contiene los recursos utilizados, como imágenes.  
![Paquete resources](https://github.com/user-attachments/assets/e558a582-81e0-411d-8125-bf079ccc3a36)

---

### 3. Dependencies  

#### **Dependencies**  
Se refiere a las bibliotecas necesarias para compilar, ejecutar y asegurar el funcionamiento correcto del proyecto.  
![Dependencias](https://github.com/user-attachments/assets/5498602d-4225-418a-9722-687245cbeeb8)

---

### 4. Java Dependencies  

Contiene las bibliotecas de Java necesarias para el correcto funcionamiento del proyecto, incluyendo el JDK.  
![Dependencias de Java](https://github.com/user-attachments/assets/defd0676-325a-4c71-b061-98cc2da3b0ee)

---

### 5. Project Files

#### **pom.xml**  
Archivo XML que contiene la configuración y metadatos del proyecto. Describe cómo debe ser construido, compilado, empaquetado y distribuido. También se utiliza para descargar las librerías necesarias.  
![Archivo pom.xml](https://github.com/user-attachments/assets/2dea8f52-1d36-4ed6-9ac0-6a700647462a)

---
## Funciones importantes
1. La clase para la conexion con la base de datos
   
   __Esta clase es la base para establecer una conexión con la base de datos.  
    No olvides incluirla en tu proyecto.__
       
     
    ```java
   package com.mycompany.sistemamed.db;
   import java.sql.Connection;
   import java.sql.DriverManager;
   import java.sql.SQLException;
   import java.util.logging.Level;
   import java.util.logging.Logger;

   /**
    *
    * @author crist
    */
   public class Conexion {
    protected Connection conexion;
    private final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    private final String DB_URL="jdbc:mysql://localhost/clinica?useUnicode=true&characterEncoding=UTF-8";
    
    private final String USER="root";
    private final String PASS="Placido0707.";
    
    public void Connectar() throws ClassNotFoundException {
        try{
         conexion= (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
         Class.forName(JDBC_DRIVER);
        }catch(SQLException ex){
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
    public void cerrar() throws SQLException{
          if(conexion!=null){
              if(!conexion.isClosed()){
                  conexion.close();
              }
          }
          
        }
        
   }
    ```
   
2.Clase que implmenta la interfaz, Esta es la clase de las citasIMP

   __De igula manera las clases en donde se implmentaran las consultas de las bases de datos por cada tabla ya que desde aqui podremos moificar para hacer alguna ctulizacion futura de 
   algun campo como esta clase debes de poner las demas en donde de igual manera se hace uso de consultas como la clase "DoctoresIMP", "PacientesIMP" y "userIMP" esta clases tienen una estructura
   similar como la del codigo dado a continuación__
 ```java
   package com.mycompany.sistemamed.vistasAdmin;

import com.mycompany.sistemamed.db.Conexion;
import com.mycompany.sistemamed.inter.CitasInter;
import com.mycompany.sistemamed.modelos.Citas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CitasImpl extends Conexion implements CitasInter {

    @Override
    //Añadir usuaario a la base de datos
    public void registrar(Citas cita) throws Exception {
       try{
           this.Connectar();
           PreparedStatement st=this.conexion.prepareStatement(
                   "INSERT INTO Citas(Fecha, Hora, idPaciente, Motivo) VALUES (?,?,?,?)");
           
               st.setString(1,cita.getFecha());
                st.setString(2,cita.getHora());
                 st.setInt(3,Integer.parseInt(cita.getPaciente()));
                  st.setString(4,cita.getMotivo());
                   
                   
              st.executeUpdate();
              st.close();
                    
       }catch(Exception e){
         throw e;
       }finally{
       this.cerrar();
       }
    }

    @Override
    public void modificar(Citas ci) throws Exception {
        try{
            this.Connectar();
            PreparedStatement st=this.conexion.prepareStatement(""
                    + "UPDATE Citas SET FECHA=?,Hora=?, Paciente=?, Motivo=? WHERE idCita=?;");
            st.setString(1,ci.getFecha());
             st.setString(2,ci.getHora());
              st.setString(3,ci.getPaciente());
               st.setString(4,ci.getMotivo());
                st.setInt(5,ci.getIdCita());
                st.executeUpdate();
                  st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(int idCita) throws Exception {
      try{
           this.Connectar();
            PreparedStatement st=this.conexion.prepareStatement(
            "DELETE FROM CITAS WHERE idCita=?;"
            );
            st.setInt(1,idCita);
                  st.executeUpdate();
                  st.close();
        }catch(Exception e){
            throw e;
        }finally{
           this.cerrar();
        }
    }
    

    @Override
    //Visualizar los usuarios
    public List<Citas> listar() throws Exception {
            List<Citas> lista=null;
            try{
                this.Connectar();
           PreparedStatement st=this.conexion.prepareStatement( 
            "SELECT c.idCita, c.Fecha, c.Hora, CONCAT(p.nombre, ' ', p.apellidos) AS Paciente, " +
            "c.Motivo, c.Estado " +
            "FROM Citas c " +
            "INNER JOIN Pacientes p ON c.idPaciente = p.idPaciente" );
           lista = new ArrayList();
           ResultSet rs = st.executeQuery();
                while(rs.next()){
                  Citas cita=new Citas();
                  cita.setIdCita(rs.getInt("idCita"));
                  cita.setFecha(rs.getString("Fecha"));
                  cita.setHora(rs.getString("Hora"));
                  cita.setPaciente(rs.getString("Paciente"));
                  cita.setMotivo(rs.getString("Motivo"));
                  cita.setEstado(rs.getString("Estado"));
                  lista.add(cita);
                }
                rs.close();
                st.close();
            }catch(Exception e){
                throw e;
            }finally{
            this.cerrar();
            }
            return lista;
    }

    @Override
    public Citas getCitasId(int citaId) throws Exception {
        Citas cita=new Citas();
        try{
            this.Connectar();
            PreparedStatement st=this.conexion.prepareStatement(
            "SELECT * FROM Citas WHERE idCita=? LIMIT 1;");
            st.setInt(1,citaId);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                cita.setIdCita(rs.getInt("idCita"));
                cita.setFecha(rs.getString("Fecha"));
                cita.setHora(rs.getString("Hora"));
                cita.setPaciente(rs.getString("Paciente"));
                cita.setMotivo(rs.getString("Motivo"));
                
            }
            rs.close();
            st.close();
            
        }catch(Exception e){
            throw e;
        }
        return cita;
    }
 ```
3.Metodos de crear PDF y encviar por correo

   __Estos dos metodos se van a ecargar de generar un PDF y una vez que se genere lo envia por correo si asi lo deceas 
   esto lo puedes cambiar en el actionPerformance de algun boton para decir si lo quieres enviar o no__

 ```java
private String generarRecetaPDF(String nombrePaciente, String motivo, String fecha, List<String> medicamentos) {
    String filePath = "receta_" + nombrePaciente.replace(" ", "_") + ".pdf";
    try {
        Document document = new Document(PageSize.A4);
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));
        document.open();

        // Establecer fuentes
        Font boldFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
        Font normalFont = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);

        // Encabezado con el nombre de la clínica
        Paragraph header = new Paragraph("CLÍNICA MEDESK", boldFont);
        header.setAlignment(Element.ALIGN_CENTER);
        document.add(header);

        // Espacio debajo del encabezado
        document.add(new Paragraph("\n"));

        // Información del paciente en un cuadro
        PdfPTable pacienteTable = new PdfPTable(2);
        pacienteTable.setWidthPercentage(100);
        pacienteTable.setSpacingBefore(10f);
        pacienteTable.setSpacingAfter(10f);

        // Estilo de las celdas
        PdfPCell cell;

        // Primera fila
        cell = new PdfPCell(new Phrase("FECHA: " + fecha, normalFont));
        cell.setBorder(Rectangle.BOX);
        pacienteTable.addCell(cell);

        cell = new PdfPCell(new Phrase("MUNICIPIO: Villa de Etla Oaxaca", normalFont));
        cell.setBorder(Rectangle.BOX);
        pacienteTable.addCell(cell);

        // Segunda fila
        cell = new PdfPCell(new Phrase("NOMBRE: " + nombrePaciente, normalFont));
        cell.setBorder(Rectangle.BOX);
        pacienteTable.addCell(cell);

        cell = new PdfPCell(new Phrase("CC: 123456789", normalFont));
        cell.setBorder(Rectangle.BOX);
        pacienteTable.addCell(cell);

        document.add(pacienteTable);

        // Diagnóstico
        Paragraph diagnostico = new Paragraph("CIE-10: R10.3 " + motivo, boldFont);
        diagnostico.setSpacingAfter(10f);
        document.add(diagnostico);

        // Tabla para los medicamentos (cuadro separado)
        PdfPTable medicamentoTable = new PdfPTable(1);
        medicamentoTable.setWidthPercentage(100);
        medicamentoTable.setSpacingBefore(10f);

        // Título de la sección
        PdfPCell medicamentoHeader = new PdfPCell(new Phrase("Receta Médica", boldFont));
        medicamentoHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
        medicamentoHeader.setBackgroundColor(BaseColor.LIGHT_GRAY);
        medicamentoHeader.setPadding(5f);
        medicamentoTable.addCell(medicamentoHeader);

        // Lista de medicamentos
        for (String medicamento : medicamentos) {
            PdfPCell medicamentoCell = new PdfPCell(new Phrase(medicamento, normalFont));
            medicamentoCell.setPadding(5f);
            medicamentoCell.setBorder(Rectangle.BOX);
            medicamentoTable.addCell(medicamentoCell);
        }

        document.add(medicamentoTable);

        // Espacio adicional
        document.add(new Paragraph("\n"));

        // Firma del médico
        Paragraph firma = new Paragraph("FIRMA MÉDICO", boldFont);
        firma.setAlignment(Element.ALIGN_RIGHT);
        document.add(firma);

        // Cerrar el documento
        document.close();

        return filePath;
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}


private void enviarCorreoConAdjunto(String destinatario, String asunto, String cuerpo, String filePath) {
    final String remitente = "correoELctronico";
    final String password = "contraselaDeAccesoDelCorreo";

    // Configuración del servidor SMTP de Gmail
    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");

    Session session = Session.getInstance(props, new Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(remitente, password);
        }
    });

    try {
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(remitente));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
        message.setSubject(asunto);

        // Parte del mensaje
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText(cuerpo);

        // Archivo adjunto
        MimeBodyPart attachPart = new MimeBodyPart();
        attachPart.attachFile(filePath);

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        multipart.addBodyPart(attachPart);

        message.setContent(multipart);

        Transport.send(message);
        System.out.println("Correo enviado exitosamente.");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

 ```
    





   







