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
public class Calificaciones 
{
    Scanner scan = new Scanner(System.in);
    
    static int[] par1,par2,prom = new int[6];
    static int promgen = 0;
    
    public void Materias(String[] mat)
    {
        for (int i = 0;i < 6;i++)
        {
            System.out.print('\n'+"calificacion de la materia "+mat[i]
                             +"1°P: ");
            par1[i] = scan.nextInt();
            System.out.print('\t'+"2°P: ");
            par2[i] = scan.nextInt();
        }
    }
    
    public void Promedio(int[] par1,int[] par2)
    {
        for (int i = 0;i < 6;i++)
        {
            prom[i] = (par1[i]+par2[i])/2;
            promgen = promgen + prom[i];
        }
        promgen = promgen/6;
        System.out.println("Promedio General________"+promgen);
    }
    
}
