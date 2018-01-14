/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author mikak
 */
public class Car {
    	public void Body(){
		System.out.println("Valmistetaan: Body");
	}
	public void Chassis(){
		System.out.println("Valmistetaan: Chassis");
	}
	public void Engine(){
		System.out.println("Valmistetaan: Engine");
	}
	public void Wheel(){
		int i = 0;
		while(i<4){
			System.out.println("Valmistetaan: Wheel");
                        i++;
		}
	}
        public void CarParts(){
            System.out.println("Autoon kuuluu:\nBody\nChassis\nEngine\n4 Wheel");
        }
}

