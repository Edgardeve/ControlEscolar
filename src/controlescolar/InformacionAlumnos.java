/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlescolar;
import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class InformacionAlumnos 
{
   Scanner scan = new Scanner(System.in); 
   //Variables__________________________________________________________________
   static String nombrecom;     //Nombre Completo
   static String date;          //Fecha de nacimiento 
   static int mes,año,dia;      //Variables para fecha de nacimiento 
   static int tel;              //Telefono
   static String address;        //Direccion
   static int noc;              //Numero de cuenta
   static int semes;            //Semetre
   static String[] arramat = {"Calculo","Circuitos","Programacion","Teoria de sistemas"
          ,"Teoria de algoritmos","Inles V"};      //Arreglo de materia
   static int hora,horamin;                    //Variables para hora 
   static String[] horari = new String[6];          //Arreglo para horario
   static String[] arradia = new String[6];        //Arreglo de dia
   //___________________________________________________________________________
   //Metodos
   public void InformacionPersonal()
   {
       System.out.print("Nombre completo: ");
       nombrecom = scan.next();
       System.out.print("Fecha de nacimiento (En numero)"+'\t'+'\t'+"***");
       System.out.print('\n'+"Dia: ");
       dia = scan.nextInt();
       System.out.print('\n'+"mes: ");
       mes = scan.nextInt();
       System.out.print('\n'+"anno: ");
       año = scan.nextInt();
       date = (dia+"/"+mes+"/"+año);
       System.out.print('\n'+"Direccion: ");
       address = scan.next();
       System.out.print('\n'+"Numero de telefono: ");
       tel = scan.nextInt();
   }
   
   public void InformacionAcaemica()
   {
       System.out.print('\n'+"No. Cuenta UAEMEX: ");
       noc = scan.nextInt();
       System.out.print('\n'+"Semestre en curso: ");
       semes = scan.nextInt();
       System.out.println();
       
   }
   
   public void Horarios()
   {
       System.out.println("Horarios"+'\t'+'\t'+'\t'+"***");
       for (int i = 0;i < 6;i++)
       {
           System.out.print('\n'+"Materia "+arramat[i]);
           System.out.print('\n'+"Dia :");
           arradia[i] = scan.next();
           System.out.print("Hora de inicio "+'\t');
           hora = scan.nextInt();
           System.out.print(":");
           horamin = scan.nextInt();
           horari[i] = (hora+":"+horamin+'\t');
           System.out.print('\n'+"Hora de finalizacion "+'\t');
           hora = scan.nextInt();
           System.out.print(":");
           horamin = scan.nextInt();
           horari[i] = horari[i]+("a"+'\t'+hora+":"+horamin);
       }
   }
}
