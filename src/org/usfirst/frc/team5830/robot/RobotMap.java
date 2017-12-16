package org.usfirst.frc.team5830.robot;

import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static Talon drivetrainLeft1 = new Talon(0);
	public static Talon drivetrainLeft2 = new Talon(1);
	public static Talon drivetrainLeft3 = new Talon(2);
	public static Talon drivetrainRight1 = new Talon(3);
	public static Talon drivetrainRight2 = new Talon(4);
	public static Talon drivetrainRight3 = new Talon(5);
	public static Talon climberMotor1 = new Talon(6); //Formerly Ball Intake
	public static Talon climberMotor2 = new Talon(8);
	
	
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
