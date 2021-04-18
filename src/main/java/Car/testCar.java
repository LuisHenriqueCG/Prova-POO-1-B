/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

import java.util.Scanner;

public class testCar{

    
    
    
	public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int March;
            int March1;
            int March2;
            int March3;
            int March4;
            int March5;
		
            Car myCar;
		myCar = new Car();
		myCar.Color = "Verde";
		myCar.Model = "Fusca";
		myCar.currentSpeed = 0;
		myCar.MaximumSpeed = 80;

		Motor myMotor = new Motor();
		myMotor.power=120;
		myMotor.type= "flex";

		myCar.motor = myMotor;
                
		// liga o carro
		myCar.toConnect();
                System.out.println(myCar.currentSpeed + " Km/h");

		// acelera o carro
                System.out.println("Engate a primeira marcha: ");
                March = input.nextInt();
                myCar.speedsUp(10);
                System.out.println(myCar.currentSpeed + " Km/h");
               
                System.out.println("Segunda marcha: ");
                March1 = input.nextInt();
		myCar.speedsUp(10);
		System.out.println(myCar.currentSpeed + " Km/h");
                
                System.out.println("Terceira Marcha");
                March2 = input.nextInt();
                myCar.speedsUp(20);
		System.out.println(myCar.currentSpeed + " Km/h");
               
                System.out.println("Quarta Marcha");
                March3 = input.nextInt();
                myCar.speedsUp(20);
		System.out.println(myCar.currentSpeed + " Km/h");
               
                System.out.println("Quinta Marcha");
                March4 = input.nextInt();
                myCar.speedsUp(20);
		System.out.println(myCar.currentSpeed + " Km/h");
                System.out.println("Cuidado, voce ultrapassou o limite de velocidade de 60 Km/h, reduza a velocidade!!");
                March5 = input.nextInt();
                myCar.speedsUp(20 - 40);
                System.out.println(myCar.currentSpeed + " Km/h");
                System.out.println("PARABENS!!!, Continue dentro do limite e salve vidas :D ");
                
                
	}
}