package org.usfirst.frc.team5830.robot;

import org.usfirst.frc.team5830.robot.commands.Climb;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

//import org.usfirst.frc.team5830.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick LeftJoy = new Joystick(0);
	public static Joystick RightJoy = new Joystick(1);
	
	public static Button ClimberButton = new JoystickButton(RightJoy,1);
	//ADDME: Create command and reference in subsystem for Reverse
	//public static Button ClimberReverseButton = new JoystickButton(RightJoy,1);
	
	//public static Button DriveForwardButton = new JoystickButton(LeftJoy,3);
	
	 	
	public static double getRightJoyStickVertical() {
		return RightJoy.getRawAxis(1);
	}
	
	public static double getLeftJoyStickVertical() {
		return LeftJoy.getRawAxis(1);
	}
	
	public OI() {
		ClimberButton.whileHeld(new Climb());
		//ClimberReverseButton.whileHeld(new ClimbReverse());
	}
}

/**
 * CHANGELOG:
 * HUNTER PUGH 9/14/17:
 * Added Climber subsystem, class, and button. Must test.
 * Added Drivetrain using Tank Drive. Must test. Eventually figure out RobotDrive
 * Added support for 2 cameras. Must test.
 * HUNTER PUGH 9/11/17:
 * Created this robot code because the competition season code was cluttered and broken
 */
	
	





//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());





