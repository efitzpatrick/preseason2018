package org.usfirst.frc.team2399.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

	//the schwoop
	DoubleSolenoid stopper;
	VictorSPX victor;
	
	public Shooter() {
		stopper = new DoubleSolenoid(3, 2, 3);
	}
	
	public void arm() {
		
	}
	
	public void disArm() {
		
	}

	@Override
	protected void initDefaultCommand() {

	}
	
	public void initDefaultCommand(Command c) {
		setDefaultCommand(c);
	}

}
